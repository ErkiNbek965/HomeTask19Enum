public class Main {
    public static void main(String[] args) {
        Planet [] planets = Planet.values();
        for (Planet plan:planets) {
            System.out.println(plan+ " " + plan.getFactsAboutThePlanets()+" " +plan.getRadius());

        Planet planet = Planet.SUN;
        System.out.println(planet.getFactsAboutThePlanets()+" "+planet.getRadius());
            
         }
    }
}
