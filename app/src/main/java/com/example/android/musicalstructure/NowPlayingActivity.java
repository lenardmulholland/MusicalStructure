package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    public static final String SONG_INFO = "songInfo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Song currentSong = (Song) getIntent().getExtras().getSerializable(SONG_INFO);
        displaySong(currentSong);
    }

    public void displaySong(Song currentSong){
        TextView currentSongTitleText = (TextView) findViewById(R.id.song_title_text_view);
        currentSongTitleText.setText(currentSong.getSongTitle());

        TextView currentComposerText = (TextView) findViewById(R.id.composer_name_text_view);
        currentComposerText.setText(currentSong.getComposer());

        TextView currentLengthText = (TextView) findViewById(R.id.song_length_text_view);
        currentLengthText.setText(currentSong.getLength());
    }
}
