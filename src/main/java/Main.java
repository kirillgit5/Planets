import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlanetsBuilderAbstract planetsBuilder = new PlanetsBuilder();

        Scanner in = new Scanner(System.in);
        String planetName = in.nextLine();

        try {
            Planets planet = planetsBuilder.buildPlanet(planetName);
            System.out.println(planet);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
