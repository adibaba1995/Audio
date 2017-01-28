package com.dupletstudios.audio.presentation.view.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dupletstudios.audio.R;
import com.dupletstudios.audio.domain.model.Data;
import com.dupletstudios.audio.domain.model.Ticket;
import com.dupletstudios.audio.presentation.application.AudioListenerApplication;
import com.dupletstudios.audio.presentation.presenter.base.AudioListenerPresenter;
import com.dupletstudios.audio.presentation.view.AudioListenerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.qraider.xt.XTUltrasonicsActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class AudioListenerActivity extends XTUltrasonicsActivity implements AudioListenerView{

    @Inject
    AudioListenerPresenter presenter;
    @BindView(R.id.placeName)
    TextView startplacename;
    @BindView(R.id.timeFrame)
    TextView starttime;
    @BindView(R.id.placeName)
    TextView placename;
    @BindView(R.id.place2Name)
    TextView endplacename;
    @BindView(R.id.time2Frame)
    TextView endtime;
    @BindView(R.id.yetToReach)
    LinearLayout yetoreach;
    @BindView(R.id.reachuiview)
    LinearLayout reachuiview;
    FirebaseDatabase database;
    DatabaseReference myRefuser;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_user_detail);
        ((AudioListenerApplication)getApplication()).createAudioListenerComponent().inject(this);
        ButterKnife.bind(this);
       FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
        database = FirebaseDatabase.getInstance();
        //DatabaseReference myRefuser = database.getReference("User").child(user_ID);
        myRefuser= database.getReference("user").child(user.getUid());



    }


    @Override
    protected void onStart() {
        super.onStart();

        // Read from the database
        myRefuser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.


                Ticket currentUser = dataSnapshot.getValue(Ticket.class);
                if (currentUser.isEntered()==true){

                    placename.setText(currentUser.getBoardingPoint());

                    starttime.setText((int) currentUser.getTimeStamp());
                    yetoreach.setVisibility(View.GONE);
                    reachuiview.setVisibility(View.VISIBLE);


                }else {
                    endplacename.setText(currentUser.getDestination());
                    endtime.setText((int) currentUser.getTimeStamp());
                    yetoreach.setVisibility(View.VISIBLE);
                    reachuiview.setVisibility(View.GONE);
                }










            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });



    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.attachView(this);
    }

    @Override
    public void didHearTriggerWithTitle(String title, double amplitude) {
        super.didHearTriggerWithTitle(title, amplitude);

        if(title.equals("C-96-300")) {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
            presenter.updateTicket(new Ticket(System.currentTimeMillis(), "Thane", "Charkop", true));
        }

    }
}
