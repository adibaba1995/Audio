package com.dupletstudios.audio.domain.interactors.impl;

import com.dupletstudios.audio.domain.interactors.base.TicketInteractor;
import com.dupletstudios.audio.domain.model.Ticket;
import com.dupletstudios.audio.network.TicketService;

import javax.inject.Inject;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class TicketInteractorImpl extends TicketInteractor {

    TicketService ticketService;

    @Inject
    public TicketInteractorImpl(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Override
    public void update(Ticket data) {
        ticketService.updateTicket(data);
    }
}
