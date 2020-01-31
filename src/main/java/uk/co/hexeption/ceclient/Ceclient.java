package uk.co.hexeption.ceclient;

import me.zero.alpine.bus.EventBus;
import me.zero.alpine.bus.EventManager;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uk.co.hexeption.ceclient.event.EventCaller;
import uk.co.hexeption.ceclient.utils.LogHelper;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ceclient")
public class Ceclient {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    // Instance
    public static final Ceclient INSTANCE = new Ceclient();

    // Events
    public final EventBus eventBus = new EventManager();

    // Font Manager

    // Mod Manager

    // Hud Manager

    // Command Manager

    // Command Prefix (settings)

    public void start() {
        LogHelper.section(String.format("Starting %s v%s", ClientInfo.MOD_NAME, ClientInfo.MOD_BUILD));

        // Test Events
        eventBus.subscribe(new EventCaller());

        LogHelper.endSection();
        Runtime.getRuntime().addShutdownHook(new Thread(this::end));
    }

    public void end() {
        LogHelper.section(String.format("Stopping %s v%s", ClientInfo.MOD_NAME, ClientInfo.MOD_BUILD));
        LogHelper.endSection();
    }

}
