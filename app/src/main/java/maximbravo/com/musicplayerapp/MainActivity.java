package maximbravo.com.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playlists = (TextView) findViewById(R.id.playlists);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        TextView trending = (TextView) findViewById(R.id.trending);

        // Set a click listener on that View
        trending.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent trendingIntent = new Intent(MainActivity.this, TrendingActivity.class);

                // Start the new activity
                startActivity(trendingIntent);
            }
        });
    }
}
