package com.dupletstudios.audio.domain.model;

import java.util.Date;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class Ticket implements Data {
    long timeStamp;
    String boardingPoint;
    String destination;
    boolean entered;

    public Ticket() {
    }

    public Ticket(long timeStamp, String boardingPoint, String destination, boolean entered) {
        this.timeStamp = timeStamp;
        this.boardingPoint = boardingPoint;
        this.destination = destination;
        this.entered = entered;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isEntered() {
        return entered;
    }

    public void setEntered(boolean entered) {
        this.entered = entered;
    }
}
