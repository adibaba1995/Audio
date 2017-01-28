package com.dupletstudios.audio.presentation.presenter.base;

import com.dupletstudios.audio.domain.model.Ticket;
import com.dupletstudios.audio.presentation.view.AudioListenerView;

/**
 * Created by adityathanekar on 28/01/17.
 */

public abstract class AudioListenerPresenter extends BasePresenter<AudioListenerView> {
    public abstract void updateTicket(Ticket ticket);
}
