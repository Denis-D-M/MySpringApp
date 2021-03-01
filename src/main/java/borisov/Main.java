package borisov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("quoterContext.xml").getBean(TerminatorQuoter.class).sayQuote();
    }
}
