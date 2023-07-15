package InterfsceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydeny Town Hall", UsageType.GOVERMENT));
        mappables.add(new Building("Sydeny Opera House", UsageType.ENTERTAIMENT));
        mappables.add(new Building("Stadium arena", UsageType.SPORTS));

        for (var map : mappables){
            Mappable.mapIt(map);
        }
    }
}
