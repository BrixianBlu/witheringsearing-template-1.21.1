package net.brixian.witheringsearing.world.biome;

import net.brixian.witheringsearing.WitheringSearing;
import net.brixian.witheringsearing.world.biome.surface.WSMaterialRules;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;
import net.minecraft.resource.ResourceFinder;

public class WSModTerrablenderAPI implements ModInitializer, TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new WSNetherRegion(Identifier.of(WitheringSearing.MOD_ID, "nether"), RegionType.NETHER, 1));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.NETHER, WitheringSearing.MOD_ID, WSMaterialRules.makeRules());
}

    @Override
    public void onInitialize() {

    }
}
