package com.dupletstudios.audio.network.ultrasonic;

/**
 * Created by adityathanekar on 28/01/17.
 */

public interface XTUltrasonicsInterface {
    void didHearTriggerWithTitle(String var1, double var2);

    void logTriggerTitles();

    void microphonePermissionGranted();
}
