
public class Gecko {
    private String name;
    private int age;
    private int energy = 100;

    Gecko(){
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    
    Gecko(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println("Hello " + name + "!");
    }

    // --------Getter, Setter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        if(energy > 100){
            this.energy = 100;
        }else if(energy < 0){
            this.energy = 0;
        }else{
            this.energy = energy;
        }
    }

    // --------Method
    public void status (){
        switch(this.age){
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
        }
    }

    public void hello(String params){
        System.out.println("Hello " + params +", I'm " + this.name);
    }
    public void hello(int params){
        for(int i = 1; i <= params; i++){
            System.out.println("Hello, I'm " + this.name);
        }
    }

    public void eat(String params){
        String newparams = params.toLowerCase();
        switch (newparams){
            case "meat":
                System.out.println("Yummy!");
                setEnergy(this.energy + 10);
                break;
            case "vegetable":
                System.out.println("Erk!");
                setEnergy(this.energy - 10);
                break;
            default:
                System.out.println("I can't eat this!");
        }
    }
}