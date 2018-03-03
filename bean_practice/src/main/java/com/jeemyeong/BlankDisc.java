package com.jeemyeong;

/**
 * Created by Jeemyeong.
 * User: jeemyeonglee
 * Date: 25/02/2018
 * Time: 8:17 PM
 */
public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
