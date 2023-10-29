package Main;

public class SuperMutant extends Monster{

    // --- Variable

    // --- Constructor
    public SuperMutant(String name){
        super(name, 170, 20, 60, 20);
        System.out.println(this.name + ": Roaarrr");

    }
    // --- Getter followed by Setter.

    //  --- Method
    @Override
    public void recoverAP() {
        super.recoverAP();
        this.hp = this.hp + 10;
    }
}
