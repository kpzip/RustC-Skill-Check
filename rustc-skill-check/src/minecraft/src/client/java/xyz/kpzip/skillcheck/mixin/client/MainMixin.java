package xyz.kpzip.skillcheck.mixin.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.main.Main;

@Mixin(Main.class)
public class MainMixin {
	
	@Inject(at = @At("TAIL"), method = "main")
	private static void main(CallbackInfo info) {
		System.exit(-1);
	}
	
}