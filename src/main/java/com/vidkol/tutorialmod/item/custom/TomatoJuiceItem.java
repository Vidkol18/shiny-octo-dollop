package com.vidkol.tutorialmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class TomatoJuiceItem extends Item {
    public TomatoJuiceItem(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}
