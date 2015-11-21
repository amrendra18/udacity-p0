package in.amrendra.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    Button spotifyAppButton;
    Button scoresAppButton;
    Button libraryAppButton;
    Button buildAppButton;
    Button readerAppButton;
    Button capstoneAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        initViews();
    }

    private void initViews() {
        spotifyAppButton = (Button) findViewById(R.id.spotify_button);
        scoresAppButton = (Button) findViewById(R.id.score_button);
        libraryAppButton = (Button) findViewById(R.id.library_button);
        buildAppButton = (Button) findViewById(R.id.build_button);
        readerAppButton = (Button) findViewById(R.id.reader_button);
        capstoneAppButton = (Button) findViewById(R.id.capstone_button);

        spotifyAppButton.setOnClickListener(this);
        scoresAppButton.setOnClickListener(this);
        libraryAppButton.setOnClickListener(this);
        buildAppButton.setOnClickListener(this);
        readerAppButton.setOnClickListener(this);
        capstoneAppButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.spotify_button:
                launchSpotifyApp();
                break;
            case R.id.score_button:
                launchScoresApp();
                break;
            case R.id.library_button:
                launchLibraryApp();
                break;
            case R.id.build_button:
                launchBuildApp();
                break;
            case R.id.reader_button:
                launchReaderApp();
                break;
            case R.id.capstone_button:
                launchCapstoneApp();
                break;
            default:
                break;
        }
    }

    private void launchReaderApp() {
        Toast.makeText(this, "This will launch XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    private void launchBuildApp() {
        Toast.makeText(this, "This will launch Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    private void launchLibraryApp() {
        Toast.makeText(this, "This will launch Library app!", Toast.LENGTH_SHORT).show();
    }

    private void launchScoresApp() {
        Toast.makeText(this, "This will launch Scores app!", Toast.LENGTH_SHORT).show();
    }

    private void launchSpotifyApp() {
        Toast.makeText(this, "This will launch Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    private void launchCapstoneApp() {
        Toast.makeText(this, "This will launch Capstone app!", Toast.LENGTH_SHORT).show();
    }
}
