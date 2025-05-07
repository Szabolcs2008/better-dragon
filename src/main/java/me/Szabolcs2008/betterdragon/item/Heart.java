package me.Szabolcs2008.betterdragon.item;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class Heart extends Item {
    public Heart(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {

        player.getAttributeInstance(EntityAttributes.MAX_HEALTH).addPersistentModifier(new EntityAttributeModifier(Identifier.of("plus_hp"), 1, EntityAttributeModifier.Operation.ADD_VALUE));

        return ActionResult.SUCCESS;
    }

}
