package com.dupletstudios.audio.presentation.presenter.base;


import com.dupletstudios.audio.presentation.view.BaseView;

import java.lang.ref.WeakReference;

/**
 * Created by adityathanekar on 17/06/16.
 */

public abstract class BasePresenter<T extends BaseView> {

    private WeakReference<T> view;

    public void attachView(T view) {
        this.view = new WeakReference<T>(view);
    }

    public void detachView() {
        view.clear();
        view = null;
    }

    public WeakReference<T> getView() {
        return view;
    }
}
