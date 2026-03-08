import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mapsPoint = new ArrayList<>();

        mapsPoint.add(new UtilityLine("Vivo", UtilityType.FIBER_OPTIC));
        mapsPoint.add(new Building("Kremlin", UsageType.GOVERNMENT));

        for (Mappable points : mapsPoint){
            Mappable.mapIt(points);
        }
    }
}
