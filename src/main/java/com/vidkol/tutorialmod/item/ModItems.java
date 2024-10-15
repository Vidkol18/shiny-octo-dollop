package com.vidkol.tutorialmod.item;

import com.vidkol.tutorialmod.TutorialMod;
import com.vidkol.tutorialmod.item.custom.ChainsawItem;
import com.vidkol.tutorialmod.item.custom.TomatoJuiceItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    //--[ITEMS [Mats]]--
    public static final DeferredItem<Item> BLACK_OPAL = ITEMS.registerSimpleItem("black_opal");
    public static final DeferredItem<Item> RAW_BLACK_OPAL = ITEMS.registerItem("raw_black_opal", Item::new, new Item.Properties());

    //--[ITEMS [Tools]]--
    public static final DeferredItem<Item> CHAINSAW = ITEMS.registerItem("chainsaw", ChainsawItem::new, new Item.Properties().durability(32));

    //--[ITEMS [Food | Drink]]--
    public static final DeferredItem<Item> TOMATO = ITEMS.registerItem("tomato", Item::new, new Item.Properties().food(ModFoodProperties.TOMATO));
    public static final DeferredItem<Item> TOMATO_JUICE = ITEMS.registerItem("tomato_juice", TomatoJuiceItem::new, new Item.Properties().food(ModFoodProperties.TOMATO_JUICE).stacksTo(16));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
