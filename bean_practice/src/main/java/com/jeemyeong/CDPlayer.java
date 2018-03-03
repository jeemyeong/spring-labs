package com.jeemyeong;

import com.jeemyeong.annotation.Disc;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by Jeemyeong.
 * User: jeemyeonglee
 * Date: 25/02/2018
 * Time: 7:23 PM
 */
public class CDPlayer implements MediaPlayer {

    CompactDisc compactDisc;

    public CDPlayer(@Autowired @Disc("compactDisc") CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
    @Override
    public void play() {
        compactDisc.play();
    }
}
