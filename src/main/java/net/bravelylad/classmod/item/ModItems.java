package net.bravelylad.classmod.item;

import net.bravelylad.classmod.ClassMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, ClassMod.MOD_ID);

        public static final RegistryObject<Item> SCULK_CONTROLLER_CHIP = ITEMS.register("sculk_controller_chip",
                () -> new Item(new Item.Properties()));

        public  static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
