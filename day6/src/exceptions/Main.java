package exceptions;

public class Main {
//    public static void main(String[] args) {
//        Character joe = new Character("Joe", "Something");
//
//        System.out.println(joe.getName()) ;
//        System.out.println(joe.getLife());
//        System.out.println(joe.getAgility());
//        System.out.println(joe.getStrength());
//        System.out.println(joe.getWit());
//        System.out.println(joe.getRPGClass());
//
//        joe.attacks("yo");
//    }
//    public static void main(String[] args){
//        Character warrior = new Warrior("Jon");
//        Character mage = new Mage("Jodie");
//
//        warrior.attacks("hammer");
//        mage.attacks("wand");
//    }
//public static void main(String[] args){
//        Warrior warrior = new Warrior("Jean-Luc");
//        Mage mage = new Mage("Robert");
//
//        warrior.moveRight();
//        warrior.moveLeft();
//        warrior.moveBack();
//        warrior.moveForward();
//
//        mage.moveRight();
//        mage.moveLeft();
//        mage.moveBack();
//        mage.moveForward();
//    }
//}
public static void main ( String [] args ) throws WeaponException {
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");
        warrior.tryToAttack("screwdriver");
        mage.tryToAttack("hammer");
        warrior.tryToAttack("hammer");
                try {
                        mage.attack("");
                }
                catch(WeaponException e){
                        System.out.println(e.getMessage());
                }
        }
}

