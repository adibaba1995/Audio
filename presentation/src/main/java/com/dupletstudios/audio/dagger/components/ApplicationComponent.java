package com.dupletstudios.audio.dagger.components;


import com.dupletstudios.audio.application.PhotoBookApplication;
import com.dupletstudios.audio.dagger.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by adityathanekar on 15/06/16.
 */

@Component(modules = { ApplicationModule.class }) @Singleton
public interface ApplicationComponent {
    void inject(PhotoBookApplication target);
}
