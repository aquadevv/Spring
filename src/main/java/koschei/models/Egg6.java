package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private final String needleToString;

    @Autowired
    public Egg6(Needle7 needle7) {
        this.needleToString = needle7.toString();
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needleToString;
    }
}
