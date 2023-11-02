import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

//    public static void main(String[] args) {
//        Solo <String> strSolo = new Solo< >("toto");
//        String strValue = strSolo.getValue();
//        strSolo.setValue("tata");
//        Solo <Integer> intSolo = new Solo< >(Integer.valueOf(42));
//        Integer intValue = intSolo.getValue();
//        intSolo.setValue(Integer.valueOf(1337));
//        System.out.println(strValue);
//        System.out.println(intValue);
//    }
//    public static void main(String[] args){
//        Pair <Integer, Integer> pair = new Pair<>(123, 25);
//
//        System.out.println(pair.getFirst());
//        System.out.println(pair.getSecond());
//
//        pair.display();
//        Integer a = pair.getFirst();
//        Integer b = pair.getSecond();
//        System.out.println("test : " + Duet.min(a, b));
//    }
//    public static void main ( String args []) {
//        List <Mage> mages = new ArrayList< >();
//        mages.add(new Mage("Merlin"));
//        mages.add(new Mage("Mandrake"));
//        List <Warrior> warriors = new ArrayList<>();
//        warriors.add(new Warrior("Spartacus"));
//        warriors.add(new Warrior("Clovis"));
//        Battalion battalion = new Battalion();
//        battalion.add(mages);
//        battalion.add(warriors);
//        battalion.display();
//    }
    public static void main(String[] args){
        Character merlin = new Mage ( " Merlin " , 12) ;
        Character gandalf = new Mage ( " Gandalf " , 12) ;
        Character mandrake = new Mage ( " Mandrake " , 9) ;
        Character achilles = new Warrior ( " Achilles " , 240) ;
        System.out.println(merlin . compareTo ( mandrake )) ; // Should return a positive value
        System.out.println(merlin . compareTo ( achilles ) ); // Should return a negative value
        System.out.println(gandalf . compareTo ( merlin )) ; // Should return 0
    }
}
