package com.dupletstudios.audio.application;

import android.app.Application;

import com.dupletstudios.audio.dagger.components.ApplicationComponent;
import com.dupletstudios.audio.dagger.components.DaggerApplicationComponent;
import com.dupletstudios.audio.dagger.modules.ApplicationModule;

/**
 * Created by adityathanekar on 27/06/16.
 */

public final class PhotoBookApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
