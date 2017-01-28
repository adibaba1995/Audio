package com.dupletstudios.audio.presentation.dagger.modules;

import com.dupletstudios.audio.domain.interactors.base.TicketInteractor;
import com.dupletstudios.audio.presentation.dagger.scopes.FragmentScope;
import com.dupletstudios.audio.presentation.presenter.base.AudioListenerPresenter;
import com.dupletstudios.audio.presentation.presenter.impl.AudioListenerPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by adityathanekar on 28/01/17.
 */

@Module
public class AudioListenerModule {

    @FragmentScope
    @Provides
    AudioListenerPresenter provideAudioListenerPresenter(TicketInteractor interactor) {
        return new AudioListenerPresenterImpl(interactor);
    }
}
