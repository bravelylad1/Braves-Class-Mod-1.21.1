package net.bravelylad.classmod.datagen;

import net.bravelylad.classmod.ClassMod;
import net.bravelylad.classmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ClassMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SCULK_CONTROLLER_CHIP.get());
        basicItem(ModItems.TEST_SHARD.get());

    }
}