package io.github.wakecode.openengine.core;

import io.github.wakecode.openengine.test.Launcher;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;

public class EngineManager {
    public static final long NANOSECOND = 1000000000L;
    public static final float FRAMERATE = 1000;

    private static int fps;
    private static float frameTime = 1.0f / FRAMERATE;

    private boolean isRunning;

    private WindowManager window;
    private GLFWErrorCallback errorCallback;

    private void init() throws Exception {
        GLFW.glfwSetErrorCallback(errorCallback = GLFWErrorCallback.createPrint(System.err));

        window = Launcher.getWindow();
        window.init();
    }

    public void start() throws Exception {
        init();

        if (isRunning) {
            return;
        }

        run();
    }

    public void run() {

    }

    private void stop() {

    }

    private void input() {

    }

    private void render() {

    }

    private void update() {

    }

    private void cleanup() {
        
    }
}
