package yourname.mods.yourmod.item;

import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import yourname.mods.yourmod.YourMod;

import static yourname.mods.yourmod.YourMod.id;

public class ModItems {
    public static DeferredItem yourItem;

    public static void initialize(BalmItemRegistrar items) {
        yourItem = items.register("your_item", Item::new).asDeferredItem();
    }

    public static void initialize(BalmCreativeModeTabRegistrar creativeModeTabs) {
        creativeModeTabs.register(YourMod.MOD_ID, builder ->
                builder.title(Component.translatable(id(YourMod.MOD_ID).toLanguageKey("itemGroup")))
                        .icon(() -> ModItems.yourItem.createStack())
                        .displayItems((displayParameters, output) -> {
                            output.accept(ModItems.yourItem);
                        })
        );
    }

}
