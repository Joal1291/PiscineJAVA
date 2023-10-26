package Main;

import java.util.Objects;

public class Shark extends Animal{

    // --- Variable
    private boolean frenzy = false;
    // --- Constructor

    protected Shark(String name) {
        super(name, 0, Type.FISH);
        this.name = name;

        System.out.println("A KILLER IS BORN!");
    }

    // --- Getter, Setter
    public boolean getStatus(){
        return frenzy;
    }
    // --- Methods
    public void smellBlood(boolean params){
        this.frenzy = params;
    }
    public void status(){
        if(frenzy){
            System.out.println(getName() + " is smelling blood and wants to kill.");
        }else{
            System.out.println(getName() + " is swimming peacefully.");
        }
    }
    public boolean canEat(Animal animal){
        return !Objects.equals(animal.getName(), name);
    }
    public void eat(Animal animal){
        if(canEat(animal)){
            System.out.println(name + " ate a " + animal.getType() + " named " + animal.getName() + ".");
            this.frenzy = false;
        }else{
            System.out.println(name + ": It's not worth my time.");
        }
    }
}
