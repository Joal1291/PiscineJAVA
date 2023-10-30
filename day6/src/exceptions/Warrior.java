package exceptions;

public class Warrior extends Character {

    // --- Constructor
    public Warrior(String name){
        super(name, "Warrior", 100, 10, 8, 3);
        System.out.println(this.name + ": My name will go down history!");
    }

    // --- Methods

    @Override
    public void attack(String weapon) throws WeaponException {
        if (weapon.isEmpty()) {
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands");
        } else if (!weapon.equals("hammer") && !weapon.equals("sword")) {
            throw new WeaponException((this.name + ": A " + weapon + "?? What should i do with this?!"));
        } else {
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

