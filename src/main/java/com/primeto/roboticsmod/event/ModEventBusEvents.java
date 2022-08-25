package com.primeto.roboticsmod.event;

import com.primeto.roboticsmod.RoboticsMod;
import com.primeto.roboticsmod.entity.ModEntityTypes;
import com.primeto.roboticsmod.entity.client.armor.HardwareArmorModel;
import com.primeto.roboticsmod.entity.client.armor.HardwareArmorRenderer;
import com.primeto.roboticsmod.entity.custom.DrillRobotEntity;
import com.primeto.roboticsmod.entity.custom.ModSpawnEggItem;
import com.primeto.roboticsmod.item.custom.HardwareArmorItem;
import net.minecraft.client.renderer.debug.EntityAIDebugRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.item.ArmorItem;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = RoboticsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.DRILL_ROBOT.get(), DrillRobotEntity.setCustomAttributes().create());
    }
    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event){
        ModSpawnEggItem.initSpawnEggs();
    }


}

