package Main;

public class Canary extends Animal{
    // --- Varriable
    private int eggs = 0;
    // --- Construtor
    protected Canary(String name) {
        super(name, 2, Type.BIRD);
        this.name = name;
        System.out.println("Yellow and smart? Here I am!");
    }

    // --- Getter, Setter
    public int getEggsCount(){
        return eggs;
    }
    // --- Methods
    public void layEgg(){
        eggs++;
    }
}
