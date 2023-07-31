package com.kyanite.deeperdarker.util;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DDCreativeTab {
    private static final CreativeModeTab.Builder ITEM_GROUP_BUILDER =
            FabricItemGroup.builder().title(Component.translatable("itemGroup.deeperdarker")).icon(() -> new ItemStack(DDItems.WARDEN_SWORD)).displayItems(((displayContext, entries) -> {
        entries.accept(new ItemStack(DDItems.WARDEN_HELMET));
        entries.accept(new ItemStack(DDItems.WARDEN_CHESTPLATE));
        entries.accept(new ItemStack(DDItems.WARDEN_LEGGINGS));
        entries.accept(new ItemStack(DDItems.WARDEN_BOOTS));
        entries.accept(new ItemStack(DDItems.WARDEN_SWORD));
        entries.accept(new ItemStack(DDItems.WARDEN_PICKAXE));
        entries.accept(new ItemStack(DDItems.WARDEN_AXE));
        entries.accept(new ItemStack(DDItems.WARDEN_SHOVEL));
        entries.accept(new ItemStack(DDItems.WARDEN_HOE));
        entries.accept(new ItemStack(DDItems.WARDEN_UPGRADE_SMITHING_TEMPLATE));
        entries.accept(new ItemStack(DDItems.REINFORCED_ECHO_SHARD));
        entries.accept(new ItemStack(DDItems.WARDEN_CARAPACE));
        entries.accept(new ItemStack(DDItems.HEART_OF_THE_DEEP));
        entries.accept(new ItemStack(DDItems.SOUL_CRYSTAL));
        entries.accept(new ItemStack(DDItems.SOUL_DUST));
        entries.accept(new ItemStack(DDItems.SCULK_BONE));
        entries.accept(new ItemStack(DDBlocks.ECHO_LOG));
        entries.accept(new ItemStack(DDBlocks.ECHO_WOOD));
        entries.accept(new ItemStack(DDBlocks.STRIPPED_ECHO_LOG));
        entries.accept(new ItemStack(DDBlocks.STRIPPED_ECHO_WOOD));
        entries.accept(new ItemStack(DDBlocks.ECHO_BUTTON));
        entries.accept(new ItemStack(DDBlocks.ECHO_DOOR));
        entries.accept(new ItemStack(DDBlocks.ECHO_FENCE_GATE));
        entries.accept(new ItemStack(DDBlocks.ECHO_FENCE));
        entries.accept(new ItemStack(DDBlocks.ECHO_HANGING_SIGN));
        entries.accept(new ItemStack(DDBlocks.ECHO_LEAVES));
        entries.accept(new ItemStack(DDBlocks.ECHO_PLANKS));
        entries.accept(new ItemStack(DDBlocks.ECHO_PRESSURE_PLATE));
        entries.accept(new ItemStack(DDBlocks.ECHO_SAPLING));
        entries.accept(new ItemStack(DDBlocks.ECHO_SIGN));
        entries.accept(new ItemStack(DDBlocks.ECHO_SLAB));
        entries.accept(new ItemStack(DDBlocks.ECHO_STAIRS));
        entries.accept(new ItemStack(DDBlocks.ECHO_TRAPDOOR));
        entries.accept(new ItemStack(DDItems.ECHO_BOAT));
        entries.accept(new ItemStack(DDItems.ECHO_CHEST_BOAT));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_SLAB));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_WALL));
        entries.accept(new ItemStack(DDBlocks.COBBLED_SCULK_STONE));
        entries.accept(new ItemStack(DDBlocks.COBBLED_SCULK_STONE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.COBBLED_SCULK_STONE_SLAB));
        entries.accept(new ItemStack(DDBlocks.COBBLED_SCULK_STONE_WALL));
        entries.accept(new ItemStack(DDBlocks.POLISHED_SCULK_STONE));
        entries.accept(new ItemStack(DDBlocks.POLISHED_SCULK_STONE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.POLISHED_SCULK_STONE_SLAB));
        entries.accept(new ItemStack(DDBlocks.POLISHED_SCULK_STONE_WALL));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_BRICKS));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_BRICK_STAIRS));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_BRICK_SLAB));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_BRICK_WALL));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_TILES));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_TILE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_TILE_SLAB));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_TILE_WALL));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_SCULK_STONE));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_SCULK_STONE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_SCULK_STONE_SLAB));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_SCULK_STONE_WALL));
        entries.accept(new ItemStack(DDBlocks.CUT_SCULK_STONE));
        entries.accept(new ItemStack(DDBlocks.CUT_SCULK_STONE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.CUT_SCULK_STONE_SLAB));
        entries.accept(new ItemStack(DDBlocks.CUT_SCULK_STONE_WALL));
        entries.accept(new ItemStack(DDBlocks.CHISELED_SCULK_STONE));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_SLAB));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_WALL));
        entries.accept(new ItemStack(DDBlocks.COBBLED_GLOOMSLATE));
        entries.accept(new ItemStack(DDBlocks.COBBLED_GLOOMSLATE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.COBBLED_GLOOMSLATE_SLAB));
        entries.accept(new ItemStack(DDBlocks.COBBLED_GLOOMSLATE_WALL));
        entries.accept(new ItemStack(DDBlocks.POLISHED_GLOOMSLATE));
        entries.accept(new ItemStack(DDBlocks.POLISHED_GLOOMSLATE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.POLISHED_GLOOMSLATE_SLAB));
        entries.accept(new ItemStack(DDBlocks.POLISHED_GLOOMSLATE_WALL));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_BRICKS));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_BRICK_STAIRS));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_BRICK_SLAB));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_BRICK_WALL));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_TILES));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_TILE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_TILE_SLAB));
        entries.accept(new ItemStack(DDBlocks.GLOOMSLATE_TILE_WALL));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_GLOOMSLATE));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_GLOOMSLATE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_GLOOMSLATE_SLAB));
        entries.accept(new ItemStack(DDBlocks.SMOOTH_GLOOMSLATE_WALL));
        entries.accept(new ItemStack(DDBlocks.CUT_GLOOMSLATE));
        entries.accept(new ItemStack(DDBlocks.CUT_GLOOMSLATE_STAIRS));
        entries.accept(new ItemStack(DDBlocks.CUT_GLOOMSLATE_SLAB));
        entries.accept(new ItemStack(DDBlocks.CUT_GLOOMSLATE_WALL));
        entries.accept(new ItemStack(DDBlocks.CHISELED_GLOOMSLATE));
        entries.accept(new ItemStack(DDBlocks.SCULK_GRIME));
        entries.accept(new ItemStack(DDBlocks.SCULK_GRIME_BRICKS));
        entries.accept(new ItemStack(DDBlocks.SCULK_GRIME_BRICK_STAIRS));
        entries.accept(new ItemStack(DDBlocks.SCULK_GRIME_BRICK_SLAB));
        entries.accept(new ItemStack(DDBlocks.SCULK_GRIME_BRICK_WALL));
        entries.accept(new ItemStack(DDBlocks.ECHO_SOIL));
        entries.accept(new ItemStack(DDBlocks.SCULK_GLEAM));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_COAL_ORE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_IRON_ORE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_COPPER_ORE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_GOLD_ORE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_REDSTONE_ORE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_EMERALD_ORE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_LAPIS_ORE));
        entries.accept(new ItemStack(DDBlocks.SCULK_STONE_DIAMOND_ORE));
        entries.accept(DDBlocks.GLOOMSLATE_COAL_ORE);
        entries.accept(DDBlocks.GLOOMSLATE_IRON_ORE);
        entries.accept(DDBlocks.GLOOMSLATE_COPPER_ORE);
        entries.accept(DDBlocks.GLOOMSLATE_GOLD_ORE);
        entries.accept(DDBlocks.GLOOMSLATE_REDSTONE_ORE);
        entries.accept(DDBlocks.GLOOMSLATE_EMERALD_ORE);
        entries.accept(DDBlocks.GLOOMSLATE_LAPIS_ORE);
        entries.accept(DDBlocks.GLOOMSLATE_DIAMOND_ORE);
        entries.accept(new ItemStack(DDItems.GRIME_BALL));
        entries.accept(new ItemStack(DDItems.GRIME_BRICK));
        entries.accept(new ItemStack(DDBlocks.SCULK_TENDRILS));
        entries.accept(new ItemStack(DDBlocks.SCULK_VINES));
        entries.accept(new ItemStack(DDBlocks.INFESTED_SCULK));
        entries.accept(new ItemStack(DDBlocks.SCULK_JAW));
        entries.accept(new ItemStack(DDBlocks.GLOOMY_CACTUS));
        entries.accept(new ItemStack(DDBlocks.GLOOMY_GRASS));
        entries.accept(new ItemStack(DDBlocks.GLOOMY_SCULK));
        entries.accept(new ItemStack(DDBlocks.GLOOMY_GEYSER));
        entries.accept(new ItemStack(DDBlocks.CRYSTALLIZED_AMBER));
        entries.accept(new ItemStack(DDBlocks.ANCIENT_VASE));
        entries.accept(new ItemStack(DDItems.SCULK_TRANSMITTER));
        entries.accept(new ItemStack(DDItems.SCULK_SNAPPER_SPAWN_EGG));
        entries.accept(new ItemStack(DDItems.SHATTERED_SPAWN_EGG));
        entries.accept(new ItemStack(DDItems.SCULK_LEECH_SPAWN_EGG));
        entries.accept(new ItemStack(DDItems.SHRIEK_WORM_SPAWN_EGG));
        entries.accept(new ItemStack(DDItems.STALKER_SPAWN_EGG));
        entries.accept(new ItemStack(DDItems.SCULK_CENTIPEDE_SPAWN_EGG));
    }));

    public static CreativeModeTab DEEPER_AND_DARKER;

    public static void init() {
        DEEPER_AND_DARKER = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(DeeperDarker.MOD_ID, "deeper_and_darker"), ITEM_GROUP_BUILDER.build());
        DeeperDarker.LOGGER.debug("Registering creative tab");
    }
}
