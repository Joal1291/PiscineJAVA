package exceptions;

public abstract class Character implements Movable {

    // --- Variables
    protected String name;
    protected final String RPGClass;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;

    //--- Constructor
    protected Character(String name, String RPGClass, int life, int agility, int strength, int wit){
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = life;
        this.agility = agility;
        this. strength = strength;
        this.wit = wit;
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

    // --- Methods

    public void attack(String params) throws WeaponException {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }
    public void tryToAttack(String params) throws WeaponException {
        try{
            attack(params);
        }catch (WeaponException e){
            System.out.println(e.getMessage());
        }
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
}

