package com.jeemyeong;

import com.jeemyeong.annotation.Player;
import org.springframework.stereotype.Component;

/**
 * Created by Jeemyeong.
 * User: jeemyeonglee
 * Date: 25/02/2018
 * Time: 7:23 PM
 */

public class DVDPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("DVDPlayer is working");
    }
}
