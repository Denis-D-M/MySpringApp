package alishev.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
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
