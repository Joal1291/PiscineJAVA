package Main;

import java.util.Objects;

public abstract class Monster extends Unit{
    // --- Variable

    protected int damage;
    protected int apcost;


    // --- Constructor
    protected Monster(String monsterName, int monsterHp, int monsterAp, int damage, int apcost) {
        super(monsterName, monsterHp, monsterAp);
        this.damage = damage;
        this.apcost = apcost;
    }
    // --- Getter, Setter

    public int getDamage(){
        return damage;
    }
    public int getApcost(){
        return apcost;
    }

    // --- Methods

    @Override
    public boolean equip(Weapon weapon){
        System.out.println("Monsters are proud and fight with their own bodies");
        return false;
    }

    @Override
    public boolean attack(Fighter fighter){
        if(!Objects.equals(fighter.getId(), getTarget().getId())){
            System.out.println(this.name + ": I'm to far from " + fighter.getName());
            return false;
        }else if(Objects.equals(fighter.getId(), this.id)){
            return false;
        }else{
            if(apcost <= this.getAp()){
                this.ap = this.ap - this.getApcost();
                System.out.println(this.name + " attacks " + getTarget().getName());
                getTarget().receiveDamage(this.getDamage());
                return true;
            }else{
                return false;
            }
        }
    }
}
