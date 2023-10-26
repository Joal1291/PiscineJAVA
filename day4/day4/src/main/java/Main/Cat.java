package Main;

class Cat extends Animal{

    // --- Variable
    private String color = "grey";

    // --- Contructor
    public Cat(String name){
        super(name, 4, Type.MAMMAL);
        this.name = name;
        System.out.println(getName() + ": MEEEOOWWWW.");
    }
    public Cat(String name, String color){
        super(name, 4, Type.MAMMAL);
        this.name = name;
        this.color = color;
        System.out.println(getName() + ": MEEEOOWWWW.");
    }

    // --- Getter, Setter
    public String getColor(){
        return color;
    }
    // --- Methods
    public void meow(){
        System.out.println(getName() + " the " + getColor() + " kitty is meowing.");
    }
}
