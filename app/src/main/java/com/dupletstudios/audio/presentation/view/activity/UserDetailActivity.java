package com.dupletstudios.audio.presentation.view.activity;

import android.support.v4.app.Fragment;

import com.dupletstudios.audio.presentation.view.fragment.UserDetailFragment;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class UserDetailActivity extends FragmentContainerActivity {
    @Override
    public Fragment newInstance() {
        return new UserDetailFragment();
    }
}
