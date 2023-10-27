package Main;

public class PowerFist extends Weapon{
    // --- Variable
    public static String output = "SBAM";

    // --- Constructor
    protected PowerFist(){
        super("Power Fist", 50, 2, true);
    }

    // --- Methods
    @Override
    public void attack() {
        System.out.println(output);
    }
}
