package Main;

public abstract class SpaceMarine extends Unit{
    // --- Variables
    private Weapon weapon;

    // --- Constructor
    protected SpaceMarine(String spaceMarineName, int spaceMarineHp, int spaceMarineAp, Weapon weapon){
            super(spaceMarineName, spaceMarineHp, spaceMarineAp);
            this.weapon = weapon;
    }

    // --- Getter, Setter
    public Weapon getWeapon(){return weapon;}
    // --- Methods

    @Override
    public boolean equip(Weapon weapon) {
        if(weapon.isUsed()){
            return false;
        }else{
            weapon.setUsed();
            this.weapon = weapon;
            System.out.println(this.getName() + " has been equipped with a " + weapon.getName());
            return true;
        }
    }

    @Override
    public boolean attack(Fighter fighter){
        if(weapon ==  null){
            System.out.println(this.name + ": Hey this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }else if(weapon.isMelee() && fighter.getId() != getTarget().getId()) {
            System.out.println(this.getId() + ": I'm to far from " + fighter.getId());
            return false;
        }else{
            if (weapon.getApcost() <= this.getAp()) {
                this.ap = this.ap - weapon.apcost;
                System.out.println(this.name + " attacks " + getTarget().getName() + " with a " + weapon.getName());
                weapon.attack();
                fighter.receiveDamage(weapon.getDamage());
                return true;
            } else return false;
        }
    }

    @Override
    public boolean moveCloseTo(Fighter fighter) {
        if(weapon.isMelee()){
            return super.moveCloseTo(fighter);
        }else{
            return false;
        }
    }
    @Override
    public void recoverAP() {
        if(!isDead){
            this.ap  = this.ap + 9;
            if(this.ap >= 50) {
                this.ap = 50;
            }
        }
    }
}

