package alishev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean(MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
//        ApplicationContext context = new AnnotationConfigApplicationContext(MusicConfiguration.class);
//        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
//        musicPlayer.playMusic();
    }
}
