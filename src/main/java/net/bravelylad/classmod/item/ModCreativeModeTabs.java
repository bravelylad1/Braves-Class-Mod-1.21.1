package net.bravelylad.classmod.item;

import net.bravelylad.classmod.ClassMod;
import net.bravelylad.classmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClassMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CLASS_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("class_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCULK_CONTROLLER_CHIP.get()))
                    .title(Component.translatable("creativetab.bravesclassmod.class_ingredients"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SCULK_CONTROLLER_CHIP.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TEST_ITEMS_TAB = CREATIVE_MODE_TABS.register("test_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TEST_BLOCK.get()))
                    .withTabsBefore(CLASS_INGREDIENTS_TAB.getId())
                    .title(Component.translatable("creativetab.bravesclassmod.test_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TEST_BLOCK.get());
                        output.accept(ModItems.TEST_SHARD.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
