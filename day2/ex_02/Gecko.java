public class Gecko {
    String name;

    Gecko(){
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    
    Gecko(String name){
        this.name = name;
        System.out.println("Hello " + name + "!"); 
    }
}