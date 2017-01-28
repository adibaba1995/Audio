package com.dupletstudios.audio.network;

import android.util.Log;

import com.dupletstudios.audio.domain.model.Ticket;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import javax.inject.Inject;

/**
 * Created by adityathanekar on 15/01/17.
 */

public class TicketServiceImpl extends TicketService {

    private DatabaseReference databaseReference;
    private FirebaseUser user;

    @Inject
    public TicketServiceImpl(DatabaseReference databaseReference) {
        this.databaseReference = databaseReference;
        user = FirebaseAuth.getInstance().getCurrentUser();
        init();
    }

    private void init() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
//                if(getCallbacks() != null)
//                    getCallbacks().clear();
//                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
//                    Patient patient = postSnapshot.getValue(Patient.class);
//                    if(getCallbacks() != null)
//                        getCallbacks().dataChanged(patient);
//                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(getCallbacks() != null)
                    getCallbacks().dataAddedSuccessfully();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void updateTicket(Ticket ticket) {
        Log.d("Aditya", "Hello world");
        databaseReference.child(this.user.getUid()).child("timeStamp").setValue(ticket.getTimeStamp());
        databaseReference.child(this.user.getUid()).child("boardingPoint").setValue(ticket.getBoardingPoint());
        databaseReference.child(this.user.getUid()).child("destination").setValue(ticket.getDestination());
    }

}
