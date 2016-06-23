package maximbravo.com.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by wendy on 6/23/2016.
 */
public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        TextView playlist1 = (TextView) findViewById(R.id.playlist_1);

        // Set a click listener on that View
        playlist1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistIntent = new Intent(PlaylistsActivity.this, MusicActivity.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });
    }
}
