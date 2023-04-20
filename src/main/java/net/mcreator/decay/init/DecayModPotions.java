
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.decay.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.decay.DecayMod;

public class DecayModPotions {
	public static Potion DECAY;

	public static void load() {
		DECAY = Registry.register(Registry.POTION, new ResourceLocation(DecayMod.MODID, "decay"), new Potion(new MobEffectInstance(MobEffects.WITHER, 800, 1, false, true)));
	}
}
