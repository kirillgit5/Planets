import java.util.Locale;

public class PlanetsBuilder implements PlanetsBuilderAbstract {
    public Planets buildPlanet(String name) {
        switch (name.toLowerCase()) {
            case "earth":
                return  Planets.EARTH;
            case "saturn":
                return  Planets.Saturn;
            case "mars":
                return  Planets.Mars;
            default:
                throw new IllegalStateException("Cannot define a planet by name: " + name);
        }
    }
}
