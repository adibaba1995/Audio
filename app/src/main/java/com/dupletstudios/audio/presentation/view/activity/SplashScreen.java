package com.dupletstudios.audio.presentation.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


import com.dupletstudios.audio.R;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.ui.ResultCodes;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;

/**
 * Created by adityathanekar on 08/01/17.
 */

public class SplashScreen extends AppCompatActivity {
    private static final String TAG = "SplashActivity";



    static final int RC_SIGN_IN = 100;
    private FirebaseAuth mAuth;

    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_splash);
        super.onCreate(savedInstanceState);

        mHandler = new Handler();
    }


    @Override
    protected void onResume() {
        super.onResume();


        mHandler.post(new Runnable() {
            @Override
            public void run() {
                FirebaseAuth auth = FirebaseAuth.getInstance();


                if (auth.getCurrentUser() != null) {

// already signed in
                    Intent intent = new Intent(getApplicationContext(), AudioListenerActivity.class);
                    startActivity(intent);
                    finish();

                } else {
                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder()
                                    .setProviders(Arrays.asList(
                                            new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
                                            new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build()))
                                    .setLogo(R.mipmap.ic_launcher)
                                    .setIsSmartLockEnabled(false)
                                    .build(),
                            RC_SIGN_IN);

                }
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {

            startActivity(new Intent(this, AudioListenerActivity.class));
            finish();
            return;

        }

// Sign in canceled
        if (resultCode == RESULT_CANCELED) {
//            showSnackbar(R.string.sign_in_cancelled);
            return;
        }

// No network
        if (resultCode == ResultCodes.RESULT_NO_NETWORK) {
//            showSnackbar(R.string.no_internet_connection);
            return;
        }

// Ticket is not signed in. Maybe just wait for the user to press
// "sign in" again, or show a message.
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}