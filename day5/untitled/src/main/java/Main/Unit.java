package Main;

import java.util.Objects;

abstract class Unit implements Fighter{

    protected static int lastId = -1;
    protected int id = -1;
    protected final String name;
    protected int hp;
    protected int ap;
    protected Fighter target;
    protected boolean isDead;

    // --- Constructor
    protected Unit(String name, int hp, int ap){
        this.id = ++lastId;
        this.name = name;
        this.hp = hp;
        this.ap = ap;

    }

    // --- Getter followed by its own Setter

    // --- Methods
    public int getId(){return id;}
    @Override
    public String getName(){return name;}
    @Override
    public int getHp(){return hp;}
    @Override
    public int getAp(){return ap;}
    public Fighter getTarget(){
        return target;
    }
    @Override
    public void receiveDamage(int receiveDamage) {
        if(!isDead){
            this.hp = hp - receiveDamage;
            if(hp <= 0){
                isDead = true;
                hp = 0;
            }
        }
    }
    @Override
    public boolean moveCloseTo(Fighter fighter) {
        if(isDead || fighter.getId() == this.id){
            return false;
        }else if(Objects.equals(fighter.getId(), this.target.getId())){
            return false;
        }else{
            this.target = fighter;
            System.out.println(name + " is moving closer to " + fighter.getName() + ".");
            return true;
        }
    }
    @Override
    public void recoverAP() {
        if(!isDead){
            this.ap = ap + 7;
            if(this.ap >= 50){
                ap = 50;
            }
        }
    }
}
