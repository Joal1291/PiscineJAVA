package Main;
import java.util.Objects;
public class RadScorpion extends Monster{

    public RadScorpion(String name){
        super(name, 80, 50, 25, 8);
        System.out.println(this.getName() + ": Grrr!");

    }

    @Override
    public boolean attack(Fighter fighter) {
        if(fighter instanceof AssaultTerminator){
            return super.attack(fighter);
        }else{
            if(!Objects.equals(fighter.getId(), getTarget().getId())){
                System.out.println(this.name + ": I'm to far from " + fighter.getName());
                return false;
            }else if(Objects.equals(fighter.getId(), this.id)){
                return false;
            }else{
                if(apcost <= this.ap){
                    this.ap = this.ap - this.apcost;
                    System.out.println(this.name + " attacks " + getTarget().getName());
                    int doubleDamage = this.damage * 2;
                    getTarget().receiveDamage(doubleDamage);
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
}
