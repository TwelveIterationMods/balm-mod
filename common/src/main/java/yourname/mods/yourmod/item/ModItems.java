package yourname.mods.yourmod.item;

import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import yourname.mods.yourmod.YourMod;

import static net.blay09.mods.balm.api.item.BalmItems.itemProperties;
import static yourname.mods.yourmod.YourMod.id;

public class ModItems {
    public static Item yourItem;

    public static void initialize(BalmItems items) {
        items.registerItem((identifier) -> ModItems.yourItem = new Item(itemProperties(identifier)), id("your_item"));
        items.registerCreativeModeTab(() -> new ItemStack(ModItems.yourItem), id(YourMod.MOD_ID));
    }

}
