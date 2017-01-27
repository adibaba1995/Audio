package com.dupletstudios.audio.view.activity;

import android.widget.Toast;

import com.qraider.xt.XTUltrasonicsActivity;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class MainActivity extends XTUltrasonicsActivity{

    @Override
    public void didHearTriggerWithTitle(String title, double amplitude) {
        super.didHearTriggerWithTitle(title, amplitude);

            Toast.makeText(this,"Detected "+title + " " + amplitude, Toast.LENGTH_LONG).show();


    }
}
