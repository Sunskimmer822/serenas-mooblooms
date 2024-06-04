package net.serenas.mooblooms;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.Registries;

public class SerenasMoobloomsClient implements ClientModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("serenas-mooblooms-client");

    public static List<CowHallucination> cowList = new ArrayList<>();
    public static List<CowHallucination> removeList = new ArrayList<>();

    @Override
    public void onInitializeClient() {

        LOGGER.info("moobloom client is started!");

        


        MinecraftClient client = MinecraftClient.getInstance();


        HudRenderCallback.EVENT.register((context, tickDelta ) -> {

            if (client.player.hasStatusEffect(Registries.STATUS_EFFECT.getEntry(SerenasMooblooms.MOOBLOOM_HALLUCINATIONS))) {


                if (Math.random()>0.9) {
                    CowHallucination hallucination = new CowHallucination(client);
                    cowList.add(hallucination);
                }
                cowList.forEach((hallucination) -> {
                    context.drawGuiTexture(hallucination.getTexture(), hallucination.getX(), hallucination.getY(), hallucination.getWidth(), hallucination.getHeight());
                    hallucination.setX(hallucination.getX()+hallucination.getVelocity());
                    if (hallucination.getX()<0 ||hallucination.getX()>client.getWindow().getWidth()) {
                        removeList.add(hallucination);
                    }
                });
                removeList.forEach((hallucination) -> {
                    cowList.remove(hallucination);
                });
                removeList.clear();
                
            }
            
        });
    }
    
}
