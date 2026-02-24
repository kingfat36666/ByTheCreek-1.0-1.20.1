package net.fatbrandon.bythecreek.item;

import net.fatbrandon.bythecreek.ByTheCreek;
import net.fatbrandon.bythecreek.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ByTheCreek.MOD_ID);
//food
public static final RegistryObject<Item> FRIED_FISH = ITEMS.register("fried_fish",
        () -> new Item(new Item.Properties().food(ModFoods.FRIED_FISH)));

//goldfish
   public static final RegistryObject<Item> GOLDFISH = ITEMS.register("goldfish",
            () -> new Item(new Item.Properties().food(ModFoods.GOLDFISH)));
    public static final RegistryObject<Item> GOLDFISH_BUCKET = ITEMS.register("goldfish_bucket",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BUBBLE_EYE_GOLDFISH_SPAWN_EGG = ITEMS.register("bubble_eye_goldfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BUBBLEEYEGOLDFISH,0xe4551a, 0xf5b027,
                    new Item.Properties()));

    //


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
