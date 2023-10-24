public class Gecko {
    private String name;

    Gecko(){
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    
    Gecko(String name){
        this.name = name;
        System.out.println("Hello " + name + "!"); 
    }

    public String getName(){
        return name;
    }
}