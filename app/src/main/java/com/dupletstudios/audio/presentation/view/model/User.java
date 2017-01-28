package com.dupletstudios.audio.presentation.view.model;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class User {

    private Long timeStamp;
    private Long time2Stamp;
    private String boardingPoint;
    private String destination;
    private Boolean entered;

    public User() {
    }

    public User(Long timeStamp, Long time2Stamp, String boardingPoint, String destination, Boolean entered) {
        this.timeStamp = timeStamp;
        this.boardingPoint = boardingPoint;
        this.destination = destination;
        this.entered = entered;
        this.time2Stamp = time2Stamp;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getTime2Stamp() {
        return time2Stamp;
    }

    public void setTime2Stamp(Long time2Stamp) {
        this.time2Stamp = time2Stamp;
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

    public Boolean getEntered() {
        return entered;
    }

    public void setEntered(Boolean entered) {
        this.entered = entered;
    }
}