package com.dupletstudios.audio.view.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dupletstudios.audio.R;
import com.dupletstudios.audio.view.BaseView;

import org.w3c.dom.Text;

/**
 * Created by adityathanekar on 12/09/16.
 */

public abstract class FragmentContainerActivity extends AppCompatActivity implements BaseView {

    public abstract Fragment newInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        if (fragment == null) {
            fragment = newInstance();
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }

        TextView myCustomTextView = (TextView) findViewById(R.id.boardingTime);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/PamegaDemo.ttf");
        myCustomTextView.setTypeface(myCustomFont);
    }

}
