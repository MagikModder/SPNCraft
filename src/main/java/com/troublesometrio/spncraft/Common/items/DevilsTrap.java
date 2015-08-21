package com.troublesometrio.spncraft.Common.items;

import com.troublesometrio.spncraft.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class DevilsTrap extends Block {

public DevilsTrap() {
super(Material.ground);
}
public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
{
	
	
	
    float speed = 0.125F;
    return AxisAlignedBB.getBoundingBox((double)p_149668_2_, (double)p_149668_3_, (double)p_149668_4_, (double)(p_149668_2_ + 1), (double)((float)(p_149668_3_ + 1) - speed), (double)(p_149668_4_ + 1));
}



public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
{
    p_149670_5_.motionX *= Reference.DevilsTrapSpeed;
    p_149670_5_.motionZ *= Reference.DevilsTrapSpeed;
}


}