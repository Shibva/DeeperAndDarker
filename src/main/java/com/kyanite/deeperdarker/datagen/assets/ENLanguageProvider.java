package com.kyanite.deeperdarker.datagen.assets;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDEffects;
import com.kyanite.deeperdarker.content.DDEntities;
import com.kyanite.deeperdarker.content.DDItems;
import com.kyanite.deeperdarker.content.entities.DDBoat;
import com.kyanite.deeperdarker.content.entities.DDChestBoat;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ENLanguageProvider extends LanguageProvider {
    public ENLanguageProvider(PackOutput output) {
        super(output, DeeperDarker.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("item.minecraft.tipped_arrow.effect.sculk_affinity", "Arrow of Sculk Affinity");
        add("item.minecraft.tipped_arrow.effect.long_sculk_affinity", "Arrow of Sculk Affinity");
        add("item.minecraft.potion.effect.sculk_affinity", "Potion of Sculk Affinity");
        add("item.minecraft.potion.effect.long_sculk_affinity", "Potion of Sculk Affinity");
        add("item.minecraft.splash_potion.effect.sculk_affinity", "Splash Potion of Sculk Affinity");
        add("item.minecraft.splash_potion.effect.long_sculk_affinity", "Splash Potion of Sculk Affinity");
        add("item.minecraft.lingering_potion.effect.sculk_affinity", "Lingering Potion of Sculk Affinity");
        add("item.minecraft.lingering_potion.effect.long_sculk_affinity", "Lingering Potion of Sculk Affinity");

        add("advancements." + DeeperDarker.MOD_ID + ".root.title", "Sculk Story");
        add("advancements." + DeeperDarker.MOD_ID + ".root.description", "You feel something pulling you towards the source...");
        add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_city.title", "A Metropolis of Restless Souls");
        add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_city.description", "Find an Ancient City");
        add("advancements." + DeeperDarker.MOD_ID + ".kill_warden.title", "Phantom Thief");
        add("advancements." + DeeperDarker.MOD_ID + ".kill_warden.description", "Slay the Warden and take its heart");
        add("advancements." + DeeperDarker.MOD_ID + ".enter_otherside.title", "Below the Bedrock");
        add("advancements." + DeeperDarker.MOD_ID + ".enter_otherside.description", "Deep below the bedrock... the darkness awaits");
        add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_temple.title", "fta name");
        add("advancements." + DeeperDarker.MOD_ID + ".find_ancient_temple.description", "fta desc");
        add("advancements." + DeeperDarker.MOD_ID + ".obtain_sculk_transmitter.title", "Noise Complaint");
        add("advancements." + DeeperDarker.MOD_ID + ".obtain_sculk_transmitter.description", "Acquire a Sculk Transmitter");
        add("advancements." + DeeperDarker.MOD_ID + ".explore_otherside.title", "Echolocation");
        add("advancements." + DeeperDarker.MOD_ID + ".explore_otherside.description", "Explore all Otherside biomes");
        add("advancements." + DeeperDarker.MOD_ID + ".obtain_reinforce_echo_shard.title", "Sculk Engineer");
        add("advancements." + DeeperDarker.MOD_ID + ".obtain_reinforce_echo_shard.description", "Reinforce an Echo Shard");
        add("advancements." + DeeperDarker.MOD_ID + ".warden_armor.title", "Cover Me with Sculk");
        add("advancements." + DeeperDarker.MOD_ID + ".warden_armor.description", "Protect yourself with a full set of Warden Armor");

        add("itemGroup." + DeeperDarker.MOD_ID, "Deeper And Darker");

        add("block." + DeeperDarker.MOD_ID + ".linked", "Linked transmitter");
        add("block." + DeeperDarker.MOD_ID + ".unlinked", "Unlinked transmitter");
        add("block." + DeeperDarker.MOD_ID + ".not_transmittable", "Cannot link to block");
        add("block." + DeeperDarker.MOD_ID + ".not_found", "The linked block is missing or unloaded");
        add("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.linked", "Linked to %1$s");
        add("tooltips." + DeeperDarker.MOD_ID + ".sculk_transmitter.not_linked", "Unlinked");

        add("subtitles.ambience.portal.groan", "The Otherside forebodes");
        add("subtitles.entity.snapper.ambient", "Sculk Snapper breathes");
        add("subtitles.entity.snapper.bite", "Sculk Snapper bites");
        add("subtitles.entity.snapper.hurt", "Sculk Snapper hurts");
        add("subtitles.entity.snapper.sniff", "Sculk Snapper sniffs");
        add("subtitles.entity.shattered.ambient", "Shattered growls");
        add("subtitles.entity.shattered.death", "Shattered dies");
        add("subtitles.entity.shattered.hurt", "Shattered hurts");
        add("subtitles.item.transmitter.error", "Transmitter fails");
        add("subtitles.item.transmitter.link", "Transmitter links");
        add("subtitles.item.transmitter.open", "Transmitter transmits");
        add("subtitles.item.transmitter.unlink", "Transmitter unlinks");

        DDBlocks.BLOCKS.getEntries().forEach(block -> add(block, "block"));
        DDItems.ITEMS.getEntries().stream().filter(item -> !(item.get() instanceof BlockItem)).forEach(item -> add(item, "item"));
        DDEntities.ENTITIES.getEntries().forEach(entity -> add(entity, "entity"));
        DDEffects.EFFECTS.getEntries().forEach(effect -> add(effect, "effect"));
    }

    private void add(RegistryObject<?> entry, String prefix) {
        if(filter(entry)) return;
        String key = entry.getId().getPath();
        add(prefix + "." + DeeperDarker.MOD_ID + "." + key, convertToName(key));
    }

    private boolean filter(RegistryObject<?> entry) {
        return entry.get() instanceof WallSignBlock || entry.get() instanceof WallHangingSignBlock || entry.get() instanceof DDBoat || entry.get() instanceof DDChestBoat;
    }

    private String convertToName(String key) {
        StringBuilder builder = new StringBuilder(key.substring(0, 1).toUpperCase() + key.substring(1));
        for(int i = 1; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        String name = builder.toString();
        if(name.contains("Chest ")) name = name.replace("Chest ", "") + " With Chest";
        if(name.contains("Lapis")) name = name.replace("Lapis", "Lapis Lazuli");
        if(name.contains("Of The")) name = name.replace("Of The", "of the");
        if(name.contains("With")) name = name.replace("With", "with");

        return name;
    }
}