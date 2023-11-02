
public class Mage extends Character {
    // --- Variables
    private String RPGClass;
    private int life = 70;
    private int agility = 3;
    private int strength = 10;
    private int wit = 10;
    private int magnetism = this.capacity;

    // --- Constructor
    public Mage(String name){
        super(name, "Mage");
        System.out.println(this.name + ": May the gods be with me.");
    }
    public Mage(String name, int magnetism){
        super(name, "Mage", magnetism);
        System.out.println(this.name + ": May the gods be with me.");
    }

    // --- Methods
    @Override
    public void attack(String weapon){
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