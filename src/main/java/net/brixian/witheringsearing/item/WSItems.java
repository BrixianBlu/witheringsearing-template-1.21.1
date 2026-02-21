package net.brixian.witheringsearing.item;

import net.brixian.witheringsearing.WitheringSearing;
import net.brixian.witheringsearing.block.WSBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WSItems {
    public static final Item WITHERED_SIGN = registerItem("withered_sign", new SignItem(
            new Item.Settings().maxCount(16), WSBlocks.WITHERED_SIGN, WSBlocks.WITHERED_WALL_SIGN));
    public static final Item WITHERED_HANGING_SIGN = registerItem("withered_hanging_sign",
            new HangingSignItem(WSBlocks.WITHERED_HANGING_SIGN, WSBlocks.WITHERED_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WitheringSearing.MOD_ID, name), item);

    }


    public static void registerWitheredSearingItems() {
        WitheringSearing.LOGGER.info("Registering Mod Items for " + WitheringSearing.MOD_ID);
    }}