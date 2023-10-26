package Main;

import java.util.Objects;

public class BlueShark extends Shark{
    protected BlueShark(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public boolean canEat(Animal animal) {
        if(animal.type != Type.FISH || Objects.equals(animal.getName(), name)){
            return false;
        }else{
            return true;
        }
    }
}