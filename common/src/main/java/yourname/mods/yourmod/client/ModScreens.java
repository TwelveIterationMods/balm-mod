package yourname.mods.yourmod.client;

import net.blay09.mods.balm.api.client.screen.BalmScreens;
import yourname.mods.yourmod.client.screen.YourScreen;
import yourname.mods.yourmod.menu.ModMenus;

import static yourname.mods.yourmod.YourMod.id;

public class ModScreens {
    public static void initialize(BalmScreens screens) {
        screens.registerScreen(id("your_menu"), ModMenus.yourMenu::get, YourScreen::new);
    }
}
