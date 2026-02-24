package net.fatbrandon.datagen.loot;

import net.fatbrandon.bythecreek.ByTheCreek;
import net.fatbrandon.bythecreek.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ByTheCreek.MOD_ID, existingFileHelper);

        withExistingParent(ModItems.BUBBLE_EYE_GOLDFISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    @Override
    protected void registerModels() {

    }
}