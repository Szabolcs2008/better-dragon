package me.Szabolcs2008.betterdragon.item;

import me.Szabolcs2008.betterdragon.Betterdragon;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;

import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Cocaine extends Item {
    public Cocaine(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {

        if (world.isClient) {
            return ActionResult.PASS;
        }

        ItemStack itemstack = player.getInventory().player.getStackInHand(hand);

        itemstack.decrement(1);

        Betterdragon.LOGGER.info("This shi works?");

        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 120, 1), player);

        return ActionResult.CONSUME;
    }

}
