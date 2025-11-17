package yourname.mods.yourmod.forge.client;

import net.blay09.mods.balm.client.BalmClientRegistrars;
import yourname.mods.yourmod.client.YourModClient;

public class ForgeYourModClient {

    public static void initialize(BalmClientRegistrars registrars) {
        registrars.registerModule(new YourModClient());
    }

}
