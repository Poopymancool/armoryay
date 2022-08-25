package com.primeto.roboticsmod.entity.client.armor;

import com.primeto.roboticsmod.RoboticsMod;
import com.primeto.roboticsmod.item.custom.HardwareArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HardwareArmorModel extends AnimatedGeoModel<HardwareArmorItem> {
    @Override
    public ResourceLocation getModelLocation(HardwareArmorItem object) {
        return new ResourceLocation(RoboticsMod.MOD_ID, "geo/customarmor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HardwareArmorItem object) {
        return new ResourceLocation(RoboticsMod.MOD_ID, "textures/models/armor/custom_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HardwareArmorItem animatable) {
        return new ResourceLocation(RoboticsMod.MOD_ID, "animations/armor_animation.json");
    }
}
