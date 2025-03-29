package com.starfluxgames.celestialskies.creativetabs;

import com.starfluxgames.celestialskies.CelestialSkies;
import com.starfluxgames.celestialskies.blocks.ModBlocks;
import com.starfluxgames.celestialskies.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CelestialSkies.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TABS.register("celestialskies_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REFINED_MYSTICITE.get()))
                    .title(Component.translatable("creativetab.celestialskies.celestialskies_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_MYSTICITE);
                        output.accept(ModItems.REFINED_MYSTICITE);
                        output.accept(ModBlocks.RAW_MYSTICITE_BLOCK);
                        output.accept(ModBlocks.MYSTICITE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_MYSTICITE_ORE);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
