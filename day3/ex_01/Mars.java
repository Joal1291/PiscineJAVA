package ex_01;

public class Mars {
    // -----Variable-----
    private static int lastId = - 1;
    private int id ;

    // ------Constructor-----
    public Mars(){
        this.id = ++lastId;
    }

    // ------Getter, Setter-----

    public int getId() {
        return id;
    }

    // ------Methods-----

}