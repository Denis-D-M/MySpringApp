package alishev.full_anotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Пьязолла Либертанго";
    }
    @PostConstruct
    public void initMethod(){
        System.out.println("Initializing");
    }
    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroying");
    }
}
