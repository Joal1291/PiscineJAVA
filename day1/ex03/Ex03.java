import java.util.ArrayList;

public class Ex03 {
    public static void printArray(ArrayList<String> myArray){
        
        for(int i = 0; i < myArray.size(); i++){
           System.out.println(myArray.get(i));
        }
    };

    public static void main(String[] args){
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Volvo");
        liste.add("Mercedes");
        liste.add("Peugeot");
        liste.add("Ctroën");
        liste.add("Audi");

        printArray(liste);
    }
}