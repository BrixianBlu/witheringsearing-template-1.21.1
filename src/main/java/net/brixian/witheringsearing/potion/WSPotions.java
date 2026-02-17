package net.brixian.witheringsearing.potion;

import net.brixian.witheringsearing.WitheringSearing;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class WSPotions {
    public static final RegistryEntry<Potion> ANXIOUS = registerPotion("anxious", new Potion());
    public static final RegistryEntry<Potion> AILING = registerPotion("aling", new Potion());


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(WitheringSearing.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        WitheringSearing.LOGGER.info("Registering Mod Potions for " + WitheringSearing.MOD_ID);
    }
}
