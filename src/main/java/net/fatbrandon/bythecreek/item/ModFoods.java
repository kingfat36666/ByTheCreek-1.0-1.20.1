package net.fatbrandon.bythecreek.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties FRIED_FISH = new FoodProperties.Builder().meat().alwaysEat().nutrition(5)
            .saturationMod(0.6f).build();
    public static final FoodProperties GOLDFISH = new FoodProperties.Builder().meat().alwaysEat().nutrition(2)
            .saturationMod(0.1f).build();
}


