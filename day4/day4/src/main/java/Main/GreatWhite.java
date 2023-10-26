package Main;

import java.util.Objects;

public class GreatWhite extends Shark{

    protected GreatWhite(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat(Animal animal) {
        if(animal instanceof Canary){
            System.out.println(name + ": Next time you try to give me that to eat, I'll eat you instead.");
        }else if(animal instanceof Shark){
            super.eat(animal);
            System.out.println(name + ": The best meal one could wish for.");
        }else{
            super.eat(animal);
        }
    }

    @Override
    public boolean canEat(Animal animal) {
        if(animal instanceof Canary || Objects.equals(animal.getName(), name)){
            return false;
        }else{
            return true;
        }
    }
}
