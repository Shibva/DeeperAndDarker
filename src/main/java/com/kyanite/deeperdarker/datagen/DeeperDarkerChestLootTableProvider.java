package com.kyanite.deeperdarker.datagen;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.blocks.DeeperDarkerBlocks;
import com.kyanite.deeperdarker.enchantments.DeeperDarkerEnchantments;
import com.kyanite.deeperdarker.items.DeeperDarkerItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.*;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class DeeperDarkerChestLootTableProvider extends SimpleFabricLootTableProvider {
    public static final Identifier ANCIENT_TEMPLE_BASEMENT = new Identifier(DeeperDarker.MOD_ID, "chests/ancient_temple_basement");
    public static final Identifier ANCIENT_TEMPLE_SECRET = new Identifier(DeeperDarker.MOD_ID, "chests/ancient_temple_secret");

    public DeeperDarkerChestLootTableProvider(FabricDataOutput output) {
        super(output, LootContextTypes.CHEST);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> exporter) {
        exporter.accept(ANCIENT_TEMPLE_BASEMENT, LootTable.builder().pool(
                LootPool.builder().rolls(UniformLootNumberProvider.create(4, 6)).with(
                        ItemEntry.builder(Blocks.SCULK).weight(32)
                                .apply(
                                SetCountLootFunction.builder(UniformLootNumberProvider.create(6, 8))))
                        .with(ItemEntry.builder(Blocks.SOUL_SOIL).weight(31)
                                .apply(
                                        SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 7))
                                )).with(ItemEntry.builder(DeeperDarkerItems.SOUL_DUST).weight(31)
                                                .apply(
                                                        SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 7))
                                                )).with(ItemEntry.builder(Items.ECHO_SHARD).weight(30)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4, 7))))
                        .with(ItemEntry.builder(DeeperDarkerItems.GRIME_BRICK).weight(28)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(5, 13))))
                        .with(ItemEntry.builder(Items.NAME_TAG).weight(26))
                        .with(ItemEntry.builder(DeeperDarkerItems.SCULK_BONE).weight(25)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2, 7))))
                        .with(ItemEntry.builder(Items.STRING).weight(20)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(9, 16))))
                        .with(ItemEntry.builder(DeeperDarkerBlocks.CRYSTALLIZED_AMBER).weight(18)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2, 5))))
                        .with(ItemEntry.builder(Items.IRON_INGOT).weight(16)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(7, 14))))
                        .with(ItemEntry.builder(Items.GOLD_INGOT).weight(13)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(7, 12))))
                        .with(ItemEntry.builder(Items.DIAMOND).weight(10)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 7))))
                        .with(ItemEntry.builder(Items.BOOK).weight(8)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 2))).apply(
                        EnchantRandomlyLootFunction.create()))
                        .with(ItemEntry.builder(Items.ENCHANTED_GOLDEN_APPLE).weight(3)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 2))))
                        .with(ItemEntry.builder(Items.MUSIC_DISC_OTHERSIDE).weight(2))
                        .with(ItemEntry.builder(Items.BOOK).weight(1)
                                .apply(EnchantRandomlyLootFunction.create().add(DeeperDarkerEnchantments.CATALYSIS)))
                        .with(ItemEntry.builder(DeeperDarkerItems.WARDEN_CARAPACE).weight(1)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 2)))))
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(2))
                        .with(ItemEntry.builder(Items.POTION).weight(10)
                                .apply(SetPotionLootFunction.builder(Potions.STRONG_STRENGTH)))
                        .with(ItemEntry.builder(Items.IRON_LEGGINGS).weight(7)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(25, 35)).allowTreasureEnchantments())
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.2f, 0.5f))))
                        .with(ItemEntry.builder(Items.IRON_SHOVEL).weight(7)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(15, 30)))
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.3f, 0.9f))))
                        .with(ItemEntry.builder(Items.DIAMOND_BOOTS).weight(5)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(25, 40)))
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.1f, 0.2f))))
                        .with(ItemEntry.builder(Items.IRON_HOE).weight(5)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 40))))
                        .with(ItemEntry.builder(Items.DIAMOND_SWORD).weight(4)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(30, 40)).allowTreasureEnchantments())
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.4f, 0.8f))))
                        .with(ItemEntry.builder(Items.DIAMOND_HELMET).weight(3)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(35, 50))))
                        .with(ItemEntry.builder(Items.DIAMOND_HOE).weight(3)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(30, 50)))
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.5f, 0.9f))))
                        .with(ItemEntry.builder(Items.DIAMOND_LEGGINGS).weight(3)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(40, 50)).allowTreasureEnchantments())
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.15f, 0.4f))))
                        .with(ItemEntry.builder(Items.DIAMOND_AXE).weight(2)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(40, 50)).allowTreasureEnchantments())
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.5f, 0.7f))))
                        .with(ItemEntry.builder(Items.DIAMOND_CHESTPLATE).weight(2)
                                .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(40, 50)).allowTreasureEnchantments())
                                .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.3f, 0.7f))))));
        exporter.accept(ANCIENT_TEMPLE_SECRET, LootTable.builder().pool(LootPool.builder().rolls(UniformLootNumberProvider.create(3, 6))
                .with(ItemEntry.builder(Blocks.COBWEB).weight(97)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 2))))
                .with(ItemEntry.builder(Items.ECHO_SHARD).weight(29)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 5))))
                .with(EmptyEntry.builder().weight(17))
                .with(ItemEntry.builder(Items.DIAMOND).weight(2)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2, 6)))))
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(DeeperDarkerItems.SCULK_TRANSMITTER))));
    }
}
