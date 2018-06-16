package com.example.android.musicalstructure;

import java.io.Serializable;

public class Song implements Serializable {

    private String mSongTitle;
    private String mComposer;
    private String mLength;

    public Song(String songTitle, String composer, String length){
        mSongTitle = songTitle;
        mComposer = composer;
        mLength = length;
    }

    public String getSongTitle(){
        return mSongTitle;
    }
    public String getComposer(){
        return mComposer;
    }
    public String getLength(){return mLength;}
}