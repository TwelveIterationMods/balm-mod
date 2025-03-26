package yourname.mods.yourmod;

import net.blay09.mods.balm.api.block.BalmBlockEntities;
import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.command.BalmCommands;
import net.blay09.mods.balm.api.component.BalmComponents;
import net.blay09.mods.balm.api.config.BalmConfig;
import net.blay09.mods.balm.api.entity.BalmEntities;
import net.blay09.mods.balm.api.item.BalmItems;
import net.blay09.mods.balm.api.loot.BalmLootTables;
import net.blay09.mods.balm.api.menu.BalmMenus;
import net.blay09.mods.balm.api.module.BalmModule;
import net.blay09.mods.balm.api.network.BalmNetworking;
import net.blay09.mods.balm.api.recipe.BalmRecipes;
import net.blay09.mods.balm.api.sound.BalmSounds;
import net.blay09.mods.balm.api.stats.BalmStats;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yourname.mods.yourmod.block.ModBlocks;
import yourname.mods.yourmod.block.entity.ModBlockEntities;
import yourname.mods.yourmod.command.ModCommands;
import yourname.mods.yourmod.component.ModComponents;
import yourname.mods.yourmod.entity.ModEntities;
import yourname.mods.yourmod.item.ModItems;
import yourname.mods.yourmod.loot.ModLoot;
import yourname.mods.yourmod.menu.ModMenus;
import yourname.mods.yourmod.network.ModNetworking;
import yourname.mods.yourmod.recipe.ModRecipeTypes;
import yourname.mods.yourmod.sound.ModSounds;
import yourname.mods.yourmod.stats.ModStats;
import yourname.mods.yourmod.worldgen.ModWorldGen;

public class YourMod implements BalmModule {

    public static final Logger logger = LoggerFactory.getLogger(YourMod.class);

    public static final String MOD_ID = "yourmod";

    @Override
    public void registerConfig(BalmConfig config) {
        config.registerConfig(YourModConfig.class);
    }

    @Override
    public void registerComponents(BalmComponents components) {
        ModComponents.initialize(components);
    }

    @Override
    public void registerBlocks(BalmBlocks blocks) {
        ModBlocks.initialize(blocks);
    }

    @Override
    public void registerBlockEntities(BalmBlockEntities blockEntities) {
        ModBlockEntities.initialize(blockEntities);
    }

    @Override
    public void registerEntities(BalmEntities entities) {
        ModEntities.initialize(entities);
    }

    @Override
    public void registerItems(BalmItems items) {
        ModItems.initialize(items);
    }

    @Override
    public void registerMenus(BalmMenus menus) {
        ModMenus.initialize(menus);
    }

    @Override
    public void registerLootTables(BalmLootTables lootTables) {
        ModLoot.initialize(lootTables);
    }

    @Override
    public void registerRecipes(BalmRecipes recipes) {
        ModRecipeTypes.initialize(recipes);
    }

    @Override
    public ResourceLocation getId() {
        return id("common");
    }

    @Override
    public void registerStats(BalmStats stats) {
        ModStats.initialize(stats);
    }

    @Override
    public void registerWorldGen(BalmWorldGen worldGen) {
        ModWorldGen.initialize(worldGen);
    }

    @Override
    public void registerNetworking(BalmNetworking networking) {
        ModNetworking.initialize(networking);
    }

    @Override
    public void registerCommands(BalmCommands commands) {
        ModCommands.initialize(commands);
    }

    @Override
    public void registerSounds(BalmSounds sounds) {
        ModSounds.initialize(sounds);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

}
