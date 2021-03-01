package alishev.full_anotations;

import org.springframework.stereotype.Component;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "I'm not afraid";
    }
}
