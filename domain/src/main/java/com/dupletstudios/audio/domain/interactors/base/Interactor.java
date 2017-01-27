package com.dupletstudios.audio.domain.interactors.base;


import com.dupletstudios.audio.domain.model.Data;

import java.util.List;

/**
 * Created by adityathanekar on 27/01/17.
 */

public abstract class Interactor<T extends Data> {
    private Callback callback;

    public abstract void insert(T data);

    public abstract void update(T data);

    public abstract void delete(T data);

    public abstract List<T> getAllData();

    public interface Callback {
        void addSuccess();
        void addFailure();
        void updateSuccess();
        void updateFailure();
        void deleteSuccess();
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public Callback getCallback() {
        return callback;
    }
}
