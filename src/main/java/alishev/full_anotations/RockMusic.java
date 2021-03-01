package alishev.full_anotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Lonely Day";
    }
}
