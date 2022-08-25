package com.primeto.roboticsmod.event;

import com.primeto.roboticsmod.RoboticsMod;
import com.primeto.roboticsmod.entity.client.armor.HardwareArmorRenderer;
import com.primeto.roboticsmod.item.custom.HardwareArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = RoboticsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final FMLClientSetupEvent event) {
        GeoArmorRenderer.registerArmorRenderer(HardwareArmorItem.class, new HardwareArmorRenderer());
    }

}
