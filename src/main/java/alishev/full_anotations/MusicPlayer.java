package alishev.full_anotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music;
    private Music music1;

    public MusicPlayer(@Qualifier("rockMusic") Music music,
                       @Qualifier("classicalMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
        System.out.println("Playing: " + music1.getSong());
    }
}

