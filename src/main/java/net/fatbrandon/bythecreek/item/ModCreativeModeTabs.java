package net.fatbrandon.bythecreek.item;

import net.fatbrandon.bythecreek.ByTheCreek;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ByTheCreek.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BY_THE_CREEK_TAB = CREATIVE_MODE_TABS.register("bythecreek",
            () -> CreativeModeTab.builder().icon(() ->new ItemStack(ModItems.GOLDFISH.get()))
                    .title(Component.translatable("creativetab.bythecreek"))
                    .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.GOLDFISH.get());
                    pOutput.accept(ModItems.GOLDFISH_BUCKET.get());
                    pOutput.accept(ModItems.BUBBLE_EYE_GOLDFISH_SPAWN_EGG.get());
                    pOutput.accept(ModItems.FRIED_FISH.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
