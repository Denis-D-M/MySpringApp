package my.experiments;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String label;
    private int power;

    public Engine(String label, int power) {
        this.label = label;
        this.power = power;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
