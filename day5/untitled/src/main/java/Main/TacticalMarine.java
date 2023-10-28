package Main;

public class TacticalMarine extends SpaceMarine{

    // ---Constructor
    public TacticalMarine(){
        super("Stallone", 100, 20);
        System.out.println(this.getName() + " on duty.");
        this.equip(new PlasmaRifle());
    }
    // --- Methods
    @Override
    public void recoverAP() {
        if(!isDead){
            this.ap = ap + 12;
            if(this.ap >= 50){
                ap = 50;
            }
        }
    }
}
