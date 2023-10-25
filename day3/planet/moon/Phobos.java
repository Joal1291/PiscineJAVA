package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public Phobos(planet.Mars params, String landingSite){
        mars = params;
        this.landingSite = landingSite;

        System.out.println("Phobos placed in orbit.");
    }
    Phobos(String landingSite){
        this.landingSite = landingSite;

        System.out.println("No planet given.");
    }

    // --- getter, setter
    public planet.Mars getMars(){
        return mars;
    }
    public String getLandingSite(){
        return landingSite;
    }
}
