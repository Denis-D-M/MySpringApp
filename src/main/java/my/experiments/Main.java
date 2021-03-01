package my.experiments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        Car car = context.getBean(Car.class);
        System.out.println(car.getEngine().getLabel());
    }
}
