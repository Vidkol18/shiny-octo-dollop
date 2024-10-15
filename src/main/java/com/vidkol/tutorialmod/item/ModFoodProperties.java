package com.vidkol.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    public static final FoodProperties TOMATO = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST), 0.65f)
            .build();

    public static final FoodProperties TOMATO_JUICE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST), 0.65f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION), 0.7f)
            .build();
}
