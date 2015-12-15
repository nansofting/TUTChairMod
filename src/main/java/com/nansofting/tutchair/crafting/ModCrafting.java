package com.nansofting.tutchair.crafting;

import com.nansofting.tutchair.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tutChairBlock), "CC ", "RCR", "RC ", 'C', Blocks.coal_block, 'R',
				Blocks.redstone_block);
	}
}
