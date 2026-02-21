package net.brixian.witheringsearing;

import net.brixian.witheringsearing.datagen.WSModelGenerator;
import net.brixian.witheringsearing.datagen.WSBlockTagGenerator;
import net.brixian.witheringsearing.datagen.WSRegistryProvider;
import net.brixian.witheringsearing.world.WSConfiguredFeatures;
import net.brixian.witheringsearing.world.WSPlacedFeatures;
import net.brixian.witheringsearing.world.biome.WSBiomes;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class WitheringSearingDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack =fabricDataGenerator.createPack();
		pack.addProvider(WSBlockTagGenerator::new);
		pack.addProvider(WSModelGenerator::new);
		pack.addProvider(WSRegistryProvider::new);



	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, WSConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, WSPlacedFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, WSBiomes::boostrap);
	}
}
