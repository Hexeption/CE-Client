package uk.co.hexeption.ceclient.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Level;
import uk.co.hexeption.ceclient.Ceclient;

/**
 * Created by Hexeption on 29/12/2016.
 */
public class LogHelper {

    private static void log(Level level, Object message) {

        Ceclient.LOGGER.log(level, String.valueOf(message));
    }

    /**
     * No events will be logged.
     */
    public static void off(Object message) {

        log(Level.OFF, message);
    }

    /**
     * A severe error that will prevent the application from continuing.
     */
    public static void fatal(Object message) {

        log(Level.FATAL, message);
    }

    /**
     * An error in the application, possibly recoverable.
     */
    public static void error(Object message) {

        log(Level.ERROR, message);
    }

    /**
     * An event that might possible lead to an error.
     */
    public static void warn(Object message) {

        log(Level.WARN, message);
    }

    /**
     * An event for informational purposes.
     */
    public static void info(Object message) {

        log(Level.INFO, message);
    }

    /**
     * A general debugging event.
     */
    public static void debug(Object message) {

        log(Level.DEBUG, message);
    }

    /**
     * A fine-grained debug message, typically capturing the flow through the application.
     */
    public static void tace(Object message) {

        log(Level.TRACE, message);
    }

    /**
     * All events should be logged.
     */
    public static void all(Object message) {

        log(Level.ALL, message);
    }


    public static void section(String message) {

        info(StringUtils.center(" " + message + " ", 70, '='));
    }

    public static void endSection() {
        info("======================================================================");
    }

}
