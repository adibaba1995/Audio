package com.dupletstudios.audio.presentation.presenter.impl;

import android.net.Uri;
import android.util.Log;

import com.dupletstudios.audio.domain.interactors.base.TicketInteractor;
import com.dupletstudios.audio.domain.model.Ticket;
import com.dupletstudios.audio.presentation.presenter.base.AudioListenerPresenter;

import javax.inject.Inject;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class AudioListenerPresenterImpl extends AudioListenerPresenter {

    private TicketInteractor interactor;

    @Inject
    public AudioListenerPresenterImpl(TicketInteractor interactor) {
        this.interactor = interactor;
    }

    @Override
    public void updateTicket(Ticket ticket) {
        interactor.update(ticket);
    }

}
