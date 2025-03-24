package com.starfluxgames.celestialskies.items;

import com.starfluxgames.celestialskies.CelestialSkies;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CelestialSkies.MOD_ID);
    public static final DeferredItem<Item> REFINED_MYSTICITE = ITEMS.register("refined_mysticite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MYSTICITE = ITEMS.register("raw_mysticite", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}