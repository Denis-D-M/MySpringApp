package alishev;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Пьязолла Либертанго";
    }

    public void doMyInit(){
        System.out.println("Initialization");
    }

    public void destroyMethod(){
        System.out.println("Destroy");
    }
    public static ClassicalMusic getInstance(){
        return new ClassicalMusic();
    }
    private ClassicalMusic(){}
}
