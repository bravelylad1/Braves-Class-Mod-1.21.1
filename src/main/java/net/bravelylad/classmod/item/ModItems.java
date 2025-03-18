package net.bravelylad.classmod.item;

import net.bravelylad.classmod.ClassMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, ClassMod.MOD_ID);

        public static final RegistryObject<Item> SCULK_CONTROLLER_CHIP = ITEMS.register("sculk_controller_chip",
                () -> new Item(new Item.Properties()) {
                        @Override
                                public void appendHoverText(ItemStack pStack, net.minecraft.world.item.Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                                pTooltipComponents.add(Component.translatable("tooltip.bravesclassmod.sculk_controller_chip.tooltip1"));
                                pTooltipComponents.add(Component.translatable("tooltip.bravesclassmod.sculk_controller_chip.tooltip2"));
                                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                        }
                });

        public static final RegistryObject<Item> TEST_SHARD = ITEMS.register("test_shard",
                () -> new Item(new Item.Properties()));

        public  static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
