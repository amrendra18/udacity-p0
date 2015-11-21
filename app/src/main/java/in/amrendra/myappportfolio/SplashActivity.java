package in.amrendra.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

@SuppressWarnings("unused")
public class SplashActivity extends AppCompatActivity {

    @OnClick(R.id.spotify_button)
    void launchSpotifyApp() {
        Toast.makeText(this, "This will launch Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.score_button)
    void launchScoresApp() {
        Toast.makeText(this, "This will launch Scores app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.library_button)
    void launchLibraryApp() {
        Toast.makeText(this, "This will launch Library app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.build_button)
    void launchBuildApp() {
        Toast.makeText(this, "This will launch Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.reader_button)
    void launchReaderApp() {
        Toast.makeText(this, "This will launch XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.capstone_button)
    void launchCapstoneApp() {
        Toast.makeText(this, "This will launch Capstone app!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        ButterKnife.bind(this);
    }

}
