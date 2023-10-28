package Main;

public class AssaultTerminator extends SpaceMarine{

    public AssaultTerminator(){
        super("Schwarzenegger", 150, 30);
        this.equip(new PowerFist());
        System.out.println(this.getName() + " has teleported fom space.");
    }

    @Override
    public void receiveDamage(int receiveDamage) {
        int newreceivedDamage = receiveDamage/3;
        if (newreceivedDamage <= 0){
            newreceivedDamage = 1;
        }
        if(!isDead){
            this.hp -= newreceivedDamage;
            if(hp <= 0){
                isDead = true;
                hp = 0;
            }
        }
    }

    @Override
    public void recoverAP() {
        if(!isDead){
            this.ap = ap + 12;
            if(this.ap >= 50){
                ap = 50;
            }
        }
    }
}
