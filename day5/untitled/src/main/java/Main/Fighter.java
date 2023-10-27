package Main;

public interface Fighter {
    public boolean equip(Weapon weapon);
    public boolean attack(Fighter fighter);
    public void receiveDamage(int receiveDamage);
    public boolean moveCloseTo(Fighter fighter);
    public void recoverAP();
    public String getName();
    public int getAp();
    public int getHp();
    public int getId();

//  boolean equip(Weapon)
//  boolean attack(Fighter)
//  void receiveDamage(int)
//  boolean moveCloseTo(Fighter)
//  void recoverAP()
//  string getName()
//  int getAp()
//  int getHp()
}
