package net.bravelylad.classmod.datagen;

import net.bravelylad.classmod.ClassMod;
import net.bravelylad.classmod.item.ModItems;
import net.bravelylad.classmod.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, ClassMod.MOD_ID, registries);
    }

    @Override
    protected void start(HolderLookup.Provider registries) {
        add("sculk_controller_chip_from_warden", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/warden"))
                        .build() },
                ModItems.SCULK_CONTROLLER_CHIP.get()));
    }
}
