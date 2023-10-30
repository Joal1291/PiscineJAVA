package exceptions;

public class Mage extends Character {

    // --- Constructor
    public Mage(String name){
        super(name, "Mage", 70, 3, 10, 10);
        System.out.println(this.name + ": May the gods be with me.");
    }

    // --- Methods
    @Override
    public void attack(String weapon) throws WeaponException {
        if(weapon.isEmpty()) {
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands");
        }else if(!weapon.equals("magic") && !weapon.equals("wand")) {
            throw new WeaponException((this.name + ": I don't need this stupid " + weapon + "! Don't misjudge my power!"));
        }else{
            super.attack(weapon);
            switch(weapon){
                case "magic":
                    System.out.println(this.name + ": Feel the power of my magic!");
                    break;
                case "wand":
                    System.out.println(this.name + ": Feel the power of my wand!");
                    break;
                default:
                    break;
            }
        }
    }
    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right furtively.");
    }
    @Override
    public void moveLeft(){
        System.out.println(this.name + ": moves left furtively.");
    }
    @Override
    public void moveForward(){
        System.out.println(this.name + ": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back furtively.");
    }
}
//for a Mage:
//        – [name]: moves right furtively. ;
//        – [name]: moves left furtively. ;
//        – [name]: moves back furtively. ;
//        – [name]: moves forward furtively.