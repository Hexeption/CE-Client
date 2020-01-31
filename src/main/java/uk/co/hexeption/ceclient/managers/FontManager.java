package uk.co.hexeption.ceclient.managers;

import java.awt.Font;
import uk.co.hexeption.ceclient.Ceclient;
import uk.co.hexeption.ceclient.font.MinecraftFontRenderer;

/**
 * FontManager
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 04:42 pm
 */
public class FontManager {

    private static String fontName = "Comfortaa";

    public MinecraftFontRenderer hud = new MinecraftFontRenderer();

    public static String getFontName() {
        return fontName;
    }

    public static void setFontName(String fontName) {
        FontManager.fontName = fontName;
        Ceclient.INSTANCE.fontManager.init();
    }

    public void init() {
        hud.setFont(new Font(fontName, Font.PLAIN, 22), true);
    }
}
