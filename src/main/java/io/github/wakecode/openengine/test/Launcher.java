package io.github.wakecode.openengine.test;

import io.github.wakecode.openengine.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("[INFO] Using LWJGL v" + Version.getVersion());

        WindowManager window = new WindowManager("OpenEngine", 1600, 900, false);
        window.init();

        while (!window.windowShouldClose()) {
            window.update();
        }

        window.cleanup();
    }
}
