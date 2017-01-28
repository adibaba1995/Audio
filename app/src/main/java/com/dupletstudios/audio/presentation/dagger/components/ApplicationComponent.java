package com.dupletstudios.audio.presentation.dagger.components;

import com.dupletstudios.audio.presentation.application.AudioListenerApplication;
import com.dupletstudios.audio.presentation.dagger.modules.ApplicationModule;
import com.dupletstudios.audio.presentation.dagger.modules.AudioListenerModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by adityathanekar on 15/06/16.
 */

@Component(modules = { ApplicationModule.class }) @Singleton
public interface ApplicationComponent {
    void inject(AudioListenerApplication target);
    AudioListenerComponent plus(AudioListenerModule module);
}
