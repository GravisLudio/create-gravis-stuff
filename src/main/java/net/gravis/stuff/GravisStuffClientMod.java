package net.gravis.stuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderingRegistry;
import net.minecraft.client.renderer.block.FluidModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;

public class GravisStuffClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Material stillMaterial = new Material(Identifier.fromNamespaceAndPath(GravisStuffMod.MOD_ID, "block/volcanic_tar_still"));
        Material flowMaterial = new Material(Identifier.fromNamespaceAndPath(GravisStuffMod.MOD_ID, "block/volcanic_tar_flow"));
        
        FluidModel.Unbaked unbaked = new FluidModel.Unbaked(stillMaterial, flowMaterial, null, null);
        
        FluidRenderingRegistry.register(
                GravisStuffMod.STILL_VOLCANIC_TAR,
                GravisStuffMod.FLOWING_VOLCANIC_TAR,
                unbaked
        );
        
        System.out.println("[Create: Gravis Stuff] Client fluid render handler and sprites registered!");
    }
}
