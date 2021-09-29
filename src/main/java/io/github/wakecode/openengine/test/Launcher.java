package io.github.wakecode.openengine.test;

import io.github.wakecode.openengine.core.EngineManager;
import io.github.wakecode.openengine.core.WindowManager;
import io.github.wakecode.openengine.core.utils.Constants;
import org.lwjgl.Version;

public class Launcher {
    private static WindowManager window;
    private static EngineManager engine;

    public static void main(String[] args) {
        System.out.println("[INFO] Using LWJGL v" + Version.getVersion());

        window = new WindowManager(Constants.TITLE, 1600, 900, false);
        engine = new EngineManager();

        try {
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow() {
        return window;
    }
}
