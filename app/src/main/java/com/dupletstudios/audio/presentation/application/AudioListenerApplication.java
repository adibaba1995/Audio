package com.dupletstudios.audio.presentation.application;

import android.app.Application;

import com.dupletstudios.audio.presentation.dagger.components.ApplicationComponent;
import com.dupletstudios.audio.presentation.dagger.components.AudioListenerComponent;
import com.dupletstudios.audio.presentation.dagger.components.DaggerApplicationComponent;
import com.dupletstudios.audio.presentation.dagger.modules.ApplicationModule;
import com.dupletstudios.audio.presentation.dagger.modules.AudioListenerModule;
import com.dupletstudios.audio.presentation.dagger.modules.TicketModule;

/**
 * Created by adityathanekar on 27/06/16.
 */

public final class AudioListenerApplication extends Application {
    private ApplicationComponent applicationComponent;
    private AudioListenerComponent audioListenerComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public AudioListenerComponent createAudioListenerComponent() {
        audioListenerComponent =  applicationComponent.plus(new AudioListenerModule());
        return audioListenerComponent;
    }

    public void releaseViewPatientFragmentComponent() {
        audioListenerComponent = null;
    }

}
