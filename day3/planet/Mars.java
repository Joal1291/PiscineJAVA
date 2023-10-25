package planet;

public class Mars {
    // -----Variable-----
    private static int lastId = - 1;
    private int id ;
    private String landingSite;

    // ------Constructor-----

    public Mars(String landingSite){
        this.id = ++lastId;
        this.landingSite = landingSite;

    }

    // ------Getter, Setter-----

    public int getId() {return id;}
    public String getLandingSite(){return landingSite;}

    // ------Methods-----
}
