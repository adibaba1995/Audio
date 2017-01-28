package com.dupletstudios.audio.network;

import com.dupletstudios.audio.domain.model.Ticket;

/**
 * Created by adityathanekar on 15/01/17.
 */

public abstract class TicketService extends BaseService {
    public abstract void updateTicket(Ticket ticket);
}
