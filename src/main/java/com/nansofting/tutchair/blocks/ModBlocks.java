package com.nansofting.tutchair.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block tutChairBlock;

	public static void createBlocks() {
		GameRegistry.registerBlock(tutChairBlock = new TUTChairBlock(), "tut_chair_block");
	}

}
