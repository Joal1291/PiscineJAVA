public class Warrior extends Character {
    // --- Variables
    private int life = 100;
    private int agility = 10;
    private int strength = 8;
    private int wit = 3;
    private int power = this.capacity;
    // --- Constructor
    public Warrior(String name){
        super(name, "Warrior");
        System.out.println(this.name + ": My name will go down in history!");
    }
    public Warrior(String name, int power){
        super(name, "Warrior", power);
        System.out.println(this.name + ": My name will go down in history!");
    }

    // --- Methods

    @Override
    public void attack(String weapon){
        super.attack(weapon);
        switch (weapon) {
            case "hammer":
                System.out.println(this.name + ": I'll crush you with my hammer!");
                break;
            case "sword":
                System.out.println(this.name + ": I'll crush you with my sword!");
                break;
            default:
                break;
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right like a bad boy.");
    }
    @Override
    public void moveLeft(){
        System.out.println(this.name + ": moves left like a bad boy.");
    }
    @Override
    public void moveForward(){
        System.out.println(this.name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back like a bad boy.");
    }
}

