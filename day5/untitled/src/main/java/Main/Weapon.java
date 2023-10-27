package Main;

public abstract class Weapon {
    // --- Variable
    protected final String name;
    protected final int apcost;
    protected final int damage;
    protected final boolean melee;
    protected boolean used = false;

    // --- Constructor
    protected Weapon(String name, int apcost, int damage, boolean melee){
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
        this.used = false;

    }
    // --- Getter, Setter

    public String getName() {
        return name;
    }
    public int getApcost() {
        return apcost;
    }
    public int getDamage() {
        return damage;
    }
    public boolean isMelee(){
        return melee;
    }
    public boolean isUsed(){
        return used;
    }
    public boolean setUsed(){
        if(!used){
            this.used = true;
            return true;
        }else{
            this.used = false;
            return true;
        }
    }
    // --- Methods
   public abstract void attack();
}
