package com.test.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public abstract class MinecraftMixin {
    //Embed your code at the beginning of the getVersion method of the Minecraft class
    @Inject(method = "getVersion", at = @At("HEAD"))
    public void onGetVersion(CallbackInfoReturnable<String> cir) {
        //Code...
    }
}
