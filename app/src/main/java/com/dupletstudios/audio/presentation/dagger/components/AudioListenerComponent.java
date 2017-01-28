package com.dupletstudios.audio.presentation.dagger.components;

import com.dupletstudios.audio.presentation.dagger.modules.AudioListenerModule;
import com.dupletstudios.audio.presentation.dagger.modules.TicketModule;
import com.dupletstudios.audio.presentation.dagger.scopes.FragmentScope;
import com.dupletstudios.audio.presentation.view.activity.AudioListenerActivity;

import dagger.Subcomponent;

/**
 * Created by adityathanekar on 15/01/17.
 */

@FragmentScope
@Subcomponent(modules = {AudioListenerModule.class, TicketModule.class})
public interface AudioListenerComponent {
    void inject(AudioListenerActivity target);
}