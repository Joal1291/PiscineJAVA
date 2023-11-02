import java.util.Objects;

public abstract class Character implements Movable {

    // --- Variables
    protected String name;
    protected final String RPGClass;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected Integer capacity = 0;

    //--- Constructor
    protected Character(String name, String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
    }
    protected Character(String name, String RPGClass, int capacity){
        this.name = name;
        this.RPGClass = RPGClass;
        this.capacity = capacity;
    }

    // --- Getter followed by Setter
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public String getRPGClass(){return this.RPGClass;}
    public int getLife() {return life;}
    public void setLife(int life){this.life = life;}
    public int getAgility(){return this.agility;}
    public void setAgility(int agility){this.agility = agility;}
    public int getStrength() {return strength;}
    public void setStrength(int strength) {this.strength = strength;}
    public int getWit() {return wit;}
    public void setWit(int wit) {this.wit = wit;}
    public int getCapacity() {return capacity;}
    // --- Methods

    public void attack(String params){
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }
    @Override
    public void moveLeft() {
        System.out.println(this.name + " moves left");
    }
    @Override
    public void moveForward() {
        System.out.println(this.name + "moves forward");
    }
    @Override
    public void moveBack() {
        System.out.println(this.name + "moves back");
    }
    public final void unsheathe(){
        System.out.println(this.name + ": unsheathes is weapon");
    }

    public Integer compareTo(Character character) {
        if (Objects.equals(this.getClass(), character.getClass())) {
           return this.capacity.compareTo(character.getCapacity());
        } else if (this instanceof Mage && character instanceof Warrior) {
            if (character.getCapacity() % this.capacity == 0) {
                return -1;
            } else return 1;
        } else if (this instanceof Warrior && character instanceof Mage) {
            if (this.capacity % character.getCapacity() == 0) {
                return 1;
            } else return -1;
        }else return 0;
    }
}

