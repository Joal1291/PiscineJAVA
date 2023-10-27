package Main;

public class PlasmaRifle extends Weapon{

    // --- Variable
    public static String output = "PIOU";


    // --- Constructor
    protected PlasmaRifle(){
        super("Plasma Rifle", 21, 5, false);
    }

    // --- Getter, Setter

    // --- Methods
    @Override
    public void attack() {
        System.out.println(output);
    }
}
