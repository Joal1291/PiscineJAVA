package Main;

public class Animal {
    // --- Variable
    protected enum Type{
        MAMMAL, FISH, BIRD
    }
    protected String name;
    protected int legs;
    protected Type type;
    private static int numberOfAnimal = 0;
    private static int numberOfMammal = 0;
    private static int numberOfFish = 0;
    private static int numberOfBird = 0;
    
    // --- Constructor
    protected Animal(String name, int legs, Type params){
        numberOfAnimal++;
        this.type = params;
//        Type newType = Type.valueOf(type.toString().toUpperCase());
        switch (params){
            case BIRD -> numberOfBird++;
            case FISH -> numberOfFish++;
            case MAMMAL -> numberOfMammal++;
        }
        this.name = name;
        this.legs = legs;
        System.out.println("My name is " + getName() + " and I am a " + getType() + "!");
        
    }
    
    // ---Getter, Setter
    public String getName(){
        return this.name;
    }
    public int getLegs(){
        return this.legs;
    }
    public String getType(){
        return type.toString().toLowerCase();
    };

    public void getNumberOfAnimal(){
        if(numberOfAnimal <0){
            System.out.println("Error");
        }else if(numberOfAnimal == 0){
            System.out.println("There are currently " + numberOfAnimal + " animal in our world.");
        }else if(numberOfAnimal == 1){
            System.out.println("There is currently " + numberOfAnimal + " animal in our world.");
        }else{
            System.out.println("There are currently " + numberOfAnimal + " animals in our world.");
        }
    }
    public void getNumberOfMammals(){
        if(numberOfMammal <0){
            System.out.println("Error");
        }else if(numberOfMammal == 0){
            System.out.println("There are currently " + numberOfMammal + " mammal in our world.");
        }else if(numberOfMammal == 1){
            System.out.println("There is currently " + numberOfMammal + " mammal in our world.");
        }else{
            System.out.println("There are currently " + numberOfMammal + " mammals in our world.");
        }
    }public void getNumberOfFish(){
        if(numberOfFish <0){
            System.out.println("Error");
        }else if(numberOfFish == 0){
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }else if(numberOfFish == 1){
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        }else{
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
    }public void getNumberOfBirds(){
        if(numberOfBird <0){
            System.out.println("Error");
        }else if(numberOfBird == 0){
            System.out.println("There are currently " + numberOfBird + " bird in our world.");
        }else if(numberOfBird == 1){
            System.out.println("There is currently " + numberOfBird + " bird in our world.");
        }else{
            System.out.println("There are currently " + numberOfBird + " birds in our world.");
        }
    }

    // --- Methods



}
