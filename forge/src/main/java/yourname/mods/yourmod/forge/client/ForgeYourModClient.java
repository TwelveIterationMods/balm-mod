package yourname.mods.yourmod.forge.client;

import net.blay09.mods.balm.api.client.BalmClient;
import yourname.mods.yourmod.client.YourModClient;

public class ForgeYourModClient {

    public static void initialize() {
        BalmClient.registerModule(new YourModClient());
    }

}
