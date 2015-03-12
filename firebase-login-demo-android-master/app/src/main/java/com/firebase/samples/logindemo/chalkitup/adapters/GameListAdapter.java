package com.firebase.samples.logindemo.chalkitup.adapters;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.Query;
import com.firebase.samples.logindemo.R;
import com.firebase.samples.logindemo.chalkitup.models.Game;

/**
 * This class is an example of how to use FirebaseListAdapter. It uses the <code>Game</code> class to encapsulate the
 * data for each individual Game message
 */
public class GameListAdapter extends FirebaseListAdapter<Game> {

    // The mUsername for this client. We use this to indicate which messages originated from this user
    private String mUsername;

    public GameListAdapter(Query ref, Activity activity, int layout, String mUsername) {
        super(ref, Game.class, layout, activity);
        this.mUsername = mUsername;
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>FirebaseListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     *
     * @param view A view instance corresponding to the layout we passed to the constructor.
     * @param game An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(View view, Game game) {
        // Map a Chat object to an entry in our listview
        String gameName = game.getName();
        TextView gameText = (TextView) view.findViewById(R.id.name);
        gameText.setText(gameName);
    }
}
