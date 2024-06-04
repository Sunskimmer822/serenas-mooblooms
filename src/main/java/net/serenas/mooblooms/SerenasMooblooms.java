package net.serenas.mooblooms;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.serenas.mooblooms.effects.MoobloomStewEffect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerenasMooblooms implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("serenas-mooblooms");

	public static final StatusEffect MOOBLOOM_HALLUCINATIONS = new MoobloomStewEffect();

	@Override
	public void onInitialize() {

		LOGGER.info("moos are starting to bloom");

		Registry.register(Registries.STATUS_EFFECT, new Identifier("serenas-mooblooms", "moobloom_hallucinations"), MOOBLOOM_HALLUCINATIONS);


		LOGGER.info("The moos are ready to bloom");
	}
}