package net.brixian.witheringsearing.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.biome.source.util.VanillaBiomeParameters;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

public class WSNetherRegion extends Region {

    public WSNetherRegion(Identifier name, RegionType type, int weight) {
        super(name, RegionType.NETHER, weight);
    }
    public void addBiomes(Registry<Biome> registry, Consumer<com.mojang.datafixers.util.Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addBiome(
                mapper,
                MultiNoiseUtil.createNoiseHypercube(
                        0.4f,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0
                ),
                WSBiomes.WITHERED_FOREST
        );
    }}