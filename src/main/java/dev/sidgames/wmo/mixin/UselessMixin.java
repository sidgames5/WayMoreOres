package dev.sidgames.wmo.mixin;

import dev.sidgames.wmo.Reference;
import dev.sidgames.wmo.WayMoreOres;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class UselessMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        Reference.LOGGER.info("This line is printed by an example mod mixin!");
    }
}