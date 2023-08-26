package com.kyanite.deeperdarker.world.trees;

import com.kyanite.deeperdarker.world.DDTrunkPlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

public class EchoTrunkPlacer extends TrunkPlacer {
//    private static final Codec<UniformInt> BRANCH_START_CODEC = ExtraCodecs.intervalCodec(UniformInt.CODEC, "min", "max", uniformInt -> {
//        if (uniformInt.getMaxValue() - uniformInt.getMinValue() < 1) {
//            return DataResult.error("Need at least 2 blocks variation for the branch starts to fit both branches");
//        }
//        return DataResult.success(uniformInt);
//    });

    public static final Codec<EchoTrunkPlacer> CODEC = RecordCodecBuilder.create(instance -> EchoTrunkPlacer.trunkPlacerParts(instance).and(instance.group(IntProvider.codec(1, 3).fieldOf("branch_count").forGetter(echoTrunkPlacer -> echoTrunkPlacer.branchCount), (IntProvider.codec(2, 16).fieldOf("branch_horizontal_length")).forGetter(echoTrunkPlacer -> echoTrunkPlacer.branchHorizontalLength), (UniformInt.codec(-16, 0/*, BRANCH_START_CODEC*/).fieldOf("branch_start_offset_from_top")).forGetter(echoTrunkPlacer -> echoTrunkPlacer.branchStartOffsetFromTop), (IntProvider.codec(-16, 16).fieldOf("branch_end_offset_from_top")).forGetter(echoTrunkPlacer -> echoTrunkPlacer.branchEndOffsetFromTop))).apply(instance, EchoTrunkPlacer::new));
    private final IntProvider branchCount;
    private final IntProvider branchHorizontalLength;
    private final UniformInt branchStartOffsetFromTop;
    private final UniformInt secondBranchStartOffsetFromTop;
    private final IntProvider branchEndOffsetFromTop;

    public EchoTrunkPlacer(int i, int j, int k, IntProvider intProvider, IntProvider intProvider2, IntProvider intProvider3, IntProvider intProvider4) {
        super(i, j, k);
        this.branchCount = intProvider;
        this.branchHorizontalLength = intProvider2;
        this.branchStartOffsetFromTop = (UniformInt) intProvider3;
        this.secondBranchStartOffsetFromTop = UniformInt.of(intProvider3.getMinValue(), intProvider3.getMaxValue() - 1);
        this.branchEndOffsetFromTop = intProvider4;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return DDTrunkPlacerTypes.ECHO_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader levelSimulatedReader, BiConsumer<BlockPos, BlockState> biConsumer, RandomSource randomSource, int i, BlockPos blockPos, TreeConfiguration treeConfiguration) {
        boolean bl2;
        int l;
        EchoTrunkPlacer.setDirtAt(levelSimulatedReader, biConsumer, randomSource, blockPos.below(), treeConfiguration);
        int j = Math.max(0, i - 1 + this.branchStartOffsetFromTop.sample(randomSource));
        int k = Math.max(0, i - 1 + this.secondBranchStartOffsetFromTop.sample(randomSource));
        if (k >= j) {
            ++k;
        }
        boolean bl = (l = this.branchCount.sample(randomSource)) == 3;
        boolean bl3 = bl2 = l >= 2;
        int m = bl ? i : (bl2 ? Math.max(j, k) + 1 : j + 1);
        for (int n = 0; n < m; ++n) {
            this.placeLog(levelSimulatedReader, biConsumer, randomSource, blockPos.above(n), treeConfiguration);
        }
        ArrayList<FoliagePlacer.FoliageAttachment> list = new ArrayList<FoliagePlacer.FoliageAttachment>();
        if (bl) {
            list.add(new FoliagePlacer.FoliageAttachment(blockPos.above(m), 0, false));
        }
        BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
        Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(randomSource);
        Function<BlockState, BlockState> function = blockState -> (BlockState)blockState.setValue(RotatedPillarBlock.AXIS, direction.getAxis());
        list.add(this.generateBranch(levelSimulatedReader, biConsumer, randomSource, i, blockPos, treeConfiguration, function, direction, j, j < m - 1, mutableBlockPos));
        if (bl2) {
            list.add(this.generateBranch(levelSimulatedReader, biConsumer, randomSource, i, blockPos, treeConfiguration, function, direction.getOpposite(), k, k < m - 1, mutableBlockPos));
        }
        return list;
    }

    private FoliagePlacer.FoliageAttachment generateBranch(LevelSimulatedReader levelSimulatedReader, BiConsumer<BlockPos, BlockState> biConsumer, RandomSource randomSource, int i, BlockPos blockPos, TreeConfiguration treeConfiguration, Function<BlockState, BlockState> function, Direction direction, int j, boolean bl, BlockPos.MutableBlockPos mutableBlockPos) {
        int o;
        Direction direction2;
        mutableBlockPos.set(blockPos).move(Direction.UP, j);
        int k = i - 1 + this.branchEndOffsetFromTop.sample(randomSource);
        boolean bl2 = bl || k < j;
        int l = this.branchHorizontalLength.sample(randomSource) + (bl2 ? 1 : 0);
        BlockPos blockPos2 = blockPos.relative(direction, l).above(k);
        int m = bl2 ? 2 : 1;
        for (int n = 0; n < m; ++n) {
            this.placeLog(levelSimulatedReader, biConsumer, randomSource, mutableBlockPos.move(direction), treeConfiguration, function);
        }
        Direction direction3 = direction2 = blockPos2.getY() > mutableBlockPos.getY() ? Direction.UP : Direction.DOWN;
        while ((o = mutableBlockPos.distManhattan(blockPos2)) != 0) {
            float f = (float)Math.abs(blockPos2.getY() - mutableBlockPos.getY()) / (float)o;
            boolean bl3 = randomSource.nextFloat() < f;
            mutableBlockPos.move(bl3 ? direction2 : direction);
            this.placeLog(levelSimulatedReader, biConsumer, randomSource, mutableBlockPos, treeConfiguration, bl3 ? Function.identity() : function);
        }
        return new FoliagePlacer.FoliageAttachment(blockPos2.above(), 0, false);
    }
}

