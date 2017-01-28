package com.dupletstudios.audio.network;


import com.dupletstudios.audio.domain.model.Data;

/**
 * Created by adityathanekar on 15/01/17.
 */

public abstract class BaseService {

    private Callbacks callbacks;

    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public Callbacks getCallbacks() {
        return callbacks;
    }

    public interface Callbacks {
        void dataChanged(Data data);
        void clear();
        void dataAddedSuccessfully();
    }

}
