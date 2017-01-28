package com.dupletstudios.audio.presentation.dagger.modules;

import com.dupletstudios.audio.domain.interactors.base.TicketInteractor;
import com.dupletstudios.audio.domain.interactors.impl.TicketInteractorImpl;
import com.dupletstudios.audio.network.TicketService;
import com.dupletstudios.audio.network.TicketServiceImpl;
import com.dupletstudios.audio.presentation.dagger.scopes.FragmentScope;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by adityathanekar on 28/01/17.
 */

@Module
public class TicketModule {
    @Provides
    @Named("NODE_NAME")
    String provideNodeName() {
        return "user";
    }

    @FragmentScope
    @Provides
    DatabaseReference provideDatabaseReference(FirebaseDatabase firebaseDatabase, @Named("NODE_NAME")String nodeName) {
        return firebaseDatabase.getReference().child(nodeName);
    }

    @FragmentScope
    @Provides
    TicketService providePatientService(DatabaseReference databaseReference) {
        return new TicketServiceImpl(databaseReference);
    }

    @FragmentScope
    @Provides
    TicketInteractor provideTicketInteractor(TicketService service) {
        return new TicketInteractorImpl(service);
    }
}
