import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var){
        ArrayList<String> liste = new ArrayList<String>();
        for(int i = 0; i < var.length; i++){
            liste.add(var[i]);
        }
        return liste;
    }
    public static void main(String[] args){

        System.out.println(myGetArgs("je", "suis", "la", "et", "toi"));
    }
}