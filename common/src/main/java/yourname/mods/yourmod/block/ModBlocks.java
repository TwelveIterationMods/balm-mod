package yourname.mods.yourmod.block;

import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.world.level.block.Block;

public class ModBlocks {

    public static DeferredBlock yourBlock;

    public static void initialize(BalmBlockRegistrar blocks) {
        yourBlock = blocks.register("your_block", Block::new, it -> it.strength(1.5f)).withDefaultItem().asDeferredBlock();
    }

}
