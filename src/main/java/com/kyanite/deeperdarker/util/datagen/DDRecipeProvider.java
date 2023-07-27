package com.kyanite.deeperdarker.util.datagen;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.function.Consumer;

public class DDRecipeProvider extends FabricRecipeProvider {
    public DDRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        SmithingTransformRecipeBuilder NETHERITE_HELMET_TO_WARDEN_HELMET_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_HELMET)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_HELMET);
        SmithingTransformRecipeBuilder NETHERITE_CHESTPLATE_TO_WARDEN_CHESTPLATE_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_CHESTPLATE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_CHESTPLATE);
        SmithingTransformRecipeBuilder NETHERITE_LEGGINGS_TO_WARDEN_LEGGINGS_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_LEGGINGS)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_LEGGINGS);
        SmithingTransformRecipeBuilder NETHERITE_BOOTS_TO_WARDEN_BOOTS_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_BOOTS)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_BOOTS);
        SmithingTransformRecipeBuilder NETHERITE_SWORD_TO_WARDEN_SWORD_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_SWORD)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_SWORD);
        SmithingTransformRecipeBuilder NETHERITE_PICKAXE_TO_WARDEN_PICKAXE_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_PICKAXE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_PICKAXE);
        SmithingTransformRecipeBuilder NETHERITE_AXE_TO_WARDEN_AXE_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_AXE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_AXE);
        SmithingTransformRecipeBuilder NETHERITE_SHOVEL_TO_WARDEN_SHOVEL_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_SHOVEL)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_SHOVEL);
        SmithingTransformRecipeBuilder NETHERITE_HOE_TO_WARDEN_HOE_UPGRADE = SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)),
                Ingredient.of(new ItemStack(Items.NETHERITE_HOE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                RecipeCategory.COMBAT,
                DDItems.WARDEN_HOE);

        NETHERITE_HELMET_TO_WARDEN_HELMET_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_CHESTPLATE_TO_WARDEN_CHESTPLATE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_LEGGINGS_TO_WARDEN_LEGGINGS_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_BOOTS_TO_WARDEN_BOOTS_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_SWORD_TO_WARDEN_SWORD_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_SHOVEL_TO_WARDEN_SHOVEL_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_PICKAXE_TO_WARDEN_PICKAXE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_AXE_TO_WARDEN_AXE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_HOE_TO_WARDEN_HOE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        NETHERITE_HELMET_TO_WARDEN_HELMET_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_helmet_to_warden_helmet_upgrade"));
        NETHERITE_CHESTPLATE_TO_WARDEN_CHESTPLATE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_chestplate_to_warden_chestplate_upgrade"));
        NETHERITE_LEGGINGS_TO_WARDEN_LEGGINGS_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_leggings_to_warden_leggings_upgrade"));
        NETHERITE_BOOTS_TO_WARDEN_BOOTS_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_boots_to_warden_boots_upgrade"));
        NETHERITE_SWORD_TO_WARDEN_SWORD_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_sword_to_warden_sword_upgrade"));
        NETHERITE_PICKAXE_TO_WARDEN_PICKAXE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_pickaxe_to_warden_pickaxe_upgrade"));
        NETHERITE_AXE_TO_WARDEN_AXE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_axe_to_warden_axe_upgrade"));
        NETHERITE_SHOVEL_TO_WARDEN_SHOVEL_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_shovel_to_warden_shovel_upgrade"));
        NETHERITE_HOE_TO_WARDEN_HOE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_hoe_to_warden_hoe_upgrade"));

        planksFromLogs(exporter, DDBlocks.ECHO_PLANKS, TagKey.create(
                Registries.ITEM, new ResourceLocation(DeeperDarker.MOD_ID, "echo_logs")), 4);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DDBlocks.ECHO_WOOD, 3).define('L', DDBlocks.ECHO_LOG).pattern("LL").pattern("LL").unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_LOG), FabricRecipeProvider.has(DDBlocks.ECHO_LOG)).save(exporter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, DDBlocks.STRIPPED_ECHO_WOOD, 3).define('L', DDBlocks.STRIPPED_ECHO_LOG).pattern("LL").pattern("LL").unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_LOG), FabricRecipeProvider.has(DDBlocks.ECHO_LOG)).save(exporter);
        oneToOneConversionRecipe(exporter, DDBlocks.ECHO_BUTTON, DDBlocks.ECHO_PLANKS, "wooden_button");
        doorBuilder(DDBlocks.ECHO_DOOR, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        fenceGateBuilder(DDBlocks.ECHO_FENCE_GATE, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        fenceBuilder(DDBlocks.ECHO_FENCE, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        hangingSign(exporter, DDBlocks.ECHO_HANGING_SIGN, DDBlocks.ECHO_PLANKS);
        pressurePlate(exporter, DDBlocks.ECHO_PRESSURE_PLATE, DDBlocks.ECHO_PLANKS);
        signBuilder(DDBlocks.ECHO_SIGN, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS));
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.ECHO_SLAB, DDBlocks.ECHO_PLANKS);
        stairBuilder(DDBlocks.ECHO_STAIRS, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        trapdoorBuilder(DDBlocks.ECHO_TRAPDOOR, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);

        stairBuilder(DDBlocks.SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.SCULK_STONE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_STAIRS, DDBlocks.SCULK_STONE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_SLAB, DDBlocks.SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_SLAB, DDBlocks.SCULK_STONE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_WALL, DDBlocks.SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_WALL, DDBlocks.SCULK_STONE);

        stairBuilder(DDBlocks.COBBLED_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.COBBLED_SCULK_STONE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_SCULK_STONE_STAIRS, DDBlocks.COBBLED_SCULK_STONE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_SCULK_STONE_SLAB, DDBlocks.COBBLED_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_SCULK_STONE_SLAB, DDBlocks.COBBLED_SCULK_STONE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_SCULK_STONE_WALL, DDBlocks.COBBLED_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_SCULK_STONE_WALL, DDBlocks.COBBLED_SCULK_STONE);

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE, DDBlocks.SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE, DDBlocks.SCULK_STONE);
        stairBuilder(DDBlocks.POLISHED_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.POLISHED_SCULK_STONE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE_STAIRS, DDBlocks.POLISHED_SCULK_STONE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE_SLAB, DDBlocks.POLISHED_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE_SLAB, DDBlocks.POLISHED_SCULK_STONE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE_WALL, DDBlocks.POLISHED_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_SCULK_STONE_WALL, DDBlocks.POLISHED_SCULK_STONE);

        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICKS, DDBlocks.SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICKS, DDBlocks.SCULK_STONE);
        stairBuilder(DDBlocks.SCULK_STONE_BRICK_STAIRS, Ingredient.of(DDBlocks.SCULK_STONE_BRICKS));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICK_STAIRS, DDBlocks.SCULK_STONE_BRICKS);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICK_SLAB, DDBlocks.SCULK_STONE_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICK_SLAB, DDBlocks.SCULK_STONE_BRICKS, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICK_WALL, DDBlocks.SCULK_STONE_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_BRICK_WALL, DDBlocks.SCULK_STONE_BRICKS);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILES, DDBlocks.SCULK_STONE);
        stairBuilder(DDBlocks.SCULK_STONE_TILE_STAIRS, Ingredient.of(DDBlocks.SCULK_STONE_TILES));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILE_STAIRS, DDBlocks.SCULK_STONE_TILES);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILE_SLAB, DDBlocks.SCULK_STONE_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILE_SLAB, DDBlocks.SCULK_STONE_TILES, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILE_WALL, DDBlocks.SCULK_STONE_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_STONE_TILE_WALL, DDBlocks.SCULK_STONE_TILES);

        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE), RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE, 0.1f, 200, "sculk_stone");
        stairBuilder(DDBlocks.SMOOTH_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.SMOOTH_SCULK_STONE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE_STAIRS, DDBlocks.SMOOTH_SCULK_STONE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE_SLAB, DDBlocks.SMOOTH_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE_SLAB, DDBlocks.SMOOTH_SCULK_STONE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE_WALL, DDBlocks.SMOOTH_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_SCULK_STONE_WALL, DDBlocks.SMOOTH_SCULK_STONE);

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE, DDBlocks.SMOOTH_SCULK_STONE);
        stairBuilder(DDBlocks.CUT_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.CUT_SCULK_STONE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE_STAIRS, DDBlocks.CUT_SCULK_STONE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE_SLAB, DDBlocks.CUT_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE_SLAB, DDBlocks.CUT_SCULK_STONE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE_WALL, DDBlocks.CUT_SCULK_STONE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_SCULK_STONE_WALL, DDBlocks.CUT_SCULK_STONE);

        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CHISELED_SCULK_STONE, DDBlocks.SCULK_STONE_BRICK_SLAB);

        // Sculk Grime
        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME, DDItems.GRIME_BALL);
        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICKS, DDItems.GRIME_BRICK);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICKS, DDBlocks.SCULK_GRIME);
        stairBuilder(DDBlocks.SCULK_GRIME_BRICK_STAIRS, Ingredient.of(DDBlocks.SCULK_GRIME_BRICKS));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICK_STAIRS, DDBlocks.SCULK_GRIME_BRICKS);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICK_SLAB, DDBlocks.SCULK_GRIME_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICK_SLAB, DDBlocks.SCULK_GRIME_BRICKS, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICK_WALL, DDBlocks.SCULK_GRIME_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SCULK_GRIME_BRICK_WALL, DDBlocks.SCULK_GRIME_BRICKS);

        // Gloomslate
        stairBuilder(DDBlocks.GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.GLOOMSLATE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_STAIRS, DDBlocks.GLOOMSLATE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_SLAB, DDBlocks.GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_SLAB, DDBlocks.GLOOMSLATE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_WALL, DDBlocks.GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_WALL, DDBlocks.GLOOMSLATE);

        stairBuilder(DDBlocks.COBBLED_GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.COBBLED_GLOOMSLATE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_GLOOMSLATE_STAIRS, DDBlocks.COBBLED_GLOOMSLATE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_GLOOMSLATE_SLAB, DDBlocks.COBBLED_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_GLOOMSLATE_SLAB, DDBlocks.COBBLED_GLOOMSLATE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_GLOOMSLATE_WALL, DDBlocks.COBBLED_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.COBBLED_GLOOMSLATE_WALL, DDBlocks.COBBLED_GLOOMSLATE);

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE, DDBlocks.GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE, DDBlocks.GLOOMSLATE);
        stairBuilder(DDBlocks.POLISHED_GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.POLISHED_GLOOMSLATE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE_STAIRS, DDBlocks.POLISHED_GLOOMSLATE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE_SLAB, DDBlocks.POLISHED_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE_SLAB, DDBlocks.POLISHED_GLOOMSLATE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE_WALL, DDBlocks.POLISHED_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.POLISHED_GLOOMSLATE_WALL, DDBlocks.POLISHED_GLOOMSLATE);

        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICKS, DDBlocks.GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICKS, DDBlocks.GLOOMSLATE);
        stairBuilder(DDBlocks.GLOOMSLATE_BRICK_STAIRS, Ingredient.of(DDBlocks.GLOOMSLATE_BRICKS));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICK_STAIRS, DDBlocks.GLOOMSLATE_BRICKS);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICK_SLAB, DDBlocks.GLOOMSLATE_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICK_SLAB, DDBlocks.GLOOMSLATE_BRICKS, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICK_WALL, DDBlocks.GLOOMSLATE_BRICKS);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_BRICK_WALL, DDBlocks.GLOOMSLATE_BRICKS);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILES, DDBlocks.GLOOMSLATE);
        stairBuilder(DDBlocks.GLOOMSLATE_TILE_STAIRS, Ingredient.of(DDBlocks.GLOOMSLATE_TILES));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILE_STAIRS, DDBlocks.GLOOMSLATE_TILES);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILE_SLAB, DDBlocks.GLOOMSLATE_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILE_SLAB, DDBlocks.GLOOMSLATE_TILES, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILE_WALL, DDBlocks.GLOOMSLATE_TILES);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.GLOOMSLATE_TILE_WALL, DDBlocks.GLOOMSLATE_TILES);

        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE), RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE, 0.1f, 200, "sculk_stone");
        stairBuilder(DDBlocks.SMOOTH_GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.SMOOTH_GLOOMSLATE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE_STAIRS, DDBlocks.SMOOTH_GLOOMSLATE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE_SLAB, DDBlocks.SMOOTH_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE_SLAB, DDBlocks.SMOOTH_GLOOMSLATE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE_WALL, DDBlocks.SMOOTH_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.SMOOTH_GLOOMSLATE_WALL, DDBlocks.SMOOTH_GLOOMSLATE);

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE, DDBlocks.SMOOTH_GLOOMSLATE);
        stairBuilder(DDBlocks.CUT_GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.CUT_GLOOMSLATE));
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE_STAIRS, DDBlocks.CUT_GLOOMSLATE);
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE_SLAB, DDBlocks.CUT_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE_SLAB, DDBlocks.CUT_GLOOMSLATE, 2);
        wall(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE_WALL, DDBlocks.CUT_GLOOMSLATE);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CUT_GLOOMSLATE_WALL, DDBlocks.CUT_GLOOMSLATE);

        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, DDBlocks.CHISELED_GLOOMSLATE, DDBlocks.GLOOMSLATE_BRICK_SLAB);

        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_COAL_ORE), RecipeCategory.MISC, Items.COAL, 0.1f, 200, "coal");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_COAL_ORE), RecipeCategory.MISC, Items.COAL, 0.1f, 100, "coal");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, 200, "iron_ingot");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, 100, "iron_ingot");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_COPPER_ORE), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, 200, "copper_ingot");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_COPPER_ORE), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, 100, "copper_ingot");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_GOLD_ORE), RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 200, "gold_ingot");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_GOLD_ORE), RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 100, "gold_ingot");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_REDSTONE_ORE), RecipeCategory.MISC, Items.REDSTONE, 0.7f, 200, "redstone");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_REDSTONE_ORE), RecipeCategory.MISC, Items.REDSTONE, 0.7f, 100, "redstone");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_EMERALD_ORE), RecipeCategory.MISC, Items.EMERALD, 1.0f, 200, "emerald");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_EMERALD_ORE), RecipeCategory.MISC, Items.EMERALD, 1.0f, 100, "emerald");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_LAPIS_ORE), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, 200, "lapis_lazuli");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_LAPIS_ORE), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, 100, "lapis_lazuli");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_DIAMOND_ORE), RecipeCategory.MISC, Items.DIAMOND, 1.0f, 200, "diamond");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_DIAMOND_ORE), RecipeCategory.MISC, Items.DIAMOND, 1.0f, 100, "diamond");

        oreSmelting(exporter, List.of(DDItems.GRIME_BALL), RecipeCategory.MISC, DDItems.GRIME_BRICK, 0.3f, 200, "grime_brick");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE, 2).define('D', Items.DIAMOND).define('U', DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE).define('S', Items.SCULK).pattern("DUD").pattern("DSD").pattern("DDD").unlockedBy(FabricRecipeProvider.getHasName(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE), FabricRecipeProvider.has(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE)).save(exporter);
        woodenBoat(exporter, DDItems.ECHO_BOAT, DDBlocks.ECHO_PLANKS);
        chestBoat(exporter, DDItems.ECHO_CHEST_BOAT, DDBlocks.ECHO_PLANKS);
    }
}