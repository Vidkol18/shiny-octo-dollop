package com.vidkol.tutorialmod.item;

import com.vidkol.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final Supplier<CreativeModeTab> BLACK_OPAL_ITEMS_TAB = CREATIVE_MODE_TABS.register("black_opal_items_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tutorialmod.black_opal_items_tab"))
            .icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.BLACK_OPAL.get());
                pOutput.accept(ModItems.RAW_BLACK_OPAL.get());
            })
            .build());

    public static final Supplier<CreativeModeTab> BLACK_OPAL_BLOCKS_TAB = CREATIVE_MODE_TABS.register("black_opal_blocks_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tutorialmod.black_opal_blocks_tab"))
            .icon(() -> new ItemStack(ModItems.RAW_BLACK_OPAL.get())) // --[TO FIX]-- Change this to a block
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "black_opal_items_tab"))
            .displayItems((pParameters, pOutput) -> {
                //--[TO FIX]-- Add the correct block to the tab
                pOutput.accept(Blocks.HAY_BLOCK);
                pOutput.accept(Blocks.DIAMOND_BLOCK);
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
