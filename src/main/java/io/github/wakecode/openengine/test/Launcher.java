package io.github.wakecode.openengine.test;

import io.github.wakecode.openengine.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {
    private static WindowManager window;

    public static void main(String[] args) {
        System.out.println("[INFO] Using LWJGL v" + Version.getVersion());

        window = new WindowManager("OpenEngine", 1600, 900, false);

        while (!window.windowShouldClose()) {
            window.update();
        }

        window.cleanup();
    }

    public static WindowManager getWindow() {
        return window;
    }
}
