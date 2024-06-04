package net.serenas.mooblooms.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MoobloomStewEffect extends StatusEffect {

    public MoobloomStewEffect() {
        super(StatusEffectCategory.HARMFUL, 0XFFD648);
    }

     @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
      return true;
    }
   
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
      return true;
    }
    
}
