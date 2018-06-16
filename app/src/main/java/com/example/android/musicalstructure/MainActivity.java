package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Moonlight Sonata", "Ludwig van Beethoven", "7:27"));
        songs.add(new Song("Für Elise", "Ludwig van Beethoven", "3:04"));
        songs.add(new Song("5th Symphony", "Ludwig van Beethoven", "7:43"));
        songs.add(new Song("Eine Kleine Nachtmusik", "Wolfgang Amadeus Mozzart", "5:42"));
        songs.add(new Song("Turkish March", "Wolfgang Amadeus Mozzart", "2:21"));
        songs.add(new Song("Requiem: Lacrimosa", "Wolfgang Amadeus Mozzart", "3:18"));
        songs.add(new Song("Le Nozze di Figaro", "Wolfgang Amadeus Mozzart", "4:28"));
        songs.add(new Song("Toccata and Fugue in D Minor", "Johann Sebastian Bach", "2:59"));
        songs.add(new Song("Jesu, Joy of Man's Desiring", "Johann Sebastian Bach", "3:29"));
        songs.add(new Song("Goldberg Variations BMV 988: 1. Aria", "Johann Sebastian Bach", "4:41"));
        songs.add(new Song("Air on the G String", "Johann Sebastian Bach", "2:36"));
        songs.add(new Song("Largo from Xerxes", "Georg Friedrich Händel", "5:50"));
        songs.add(new Song("Organ Concerto Op. 7, No: 4: 1. Adagio", "Georg Friedrich Händel", "6:29"));
        songs.add(new Song("Hallelujah Chorus", "Georg Friedrich Händel", "4:23"));
        songs.add(new Song("Swan Lake", "Pyotr Ilyich Tchaikovsky", "3:15"));
        songs.add(new Song("Waltz of the Flowers", "Pyotr Ilyich Tchaikovsky", "7:01"));
        songs.add(new Song("Serenade for Strings in C, Op.48 - 2. Valse", "Pyotr Ilyich Tchaikovsky", "3:52"));
        songs.add(new Song("Minute Waltz", "Frédéric Chopin", "2:37"));
        songs.add(new Song("Grande Valse Brillante", "Frédéric Chopin", "5:29"));
        songs.add(new Song("Nocturne No.2 in E Flat, Op. 9 No. 2", "Frédéric Chopin", "3:57"));
        songs.add(new Song("Raindrop Prélude", "Frédéric Chopin", "4:57"));

        SongAdapter adapter = new SongAdapter(this, songs);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song selectedItem = (Song) listView.getItemAtPosition(position);
                final Bundle extra = new Bundle();
                extra.putSerializable(NowPlayingActivity.SONG_INFO, selectedItem);
                Intent nowPlayingIntent = new Intent (view.getContext(), NowPlayingActivity.class);
                nowPlayingIntent.putExtras(extra);
                view.getContext().startActivity(nowPlayingIntent);
            }
        });
    }
}
