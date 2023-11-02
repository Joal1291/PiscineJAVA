import Composite.SentenceComposite;
import Composite.Word;
import Observer.Customer;
import Observer.Order;

public class Main {

//    public static void main ( String [] args ) {
//        Word w1 = new Word("word1");
//        Word w2 = new Word("word2");
//        Word w3 = new Word("word3");
//        Word w4 = new Word("word4");
//        SentenceComposite sc1 = new SentenceComposite();
//        SentenceComposite sc2 = new SentenceComposite();
//        SentenceComposite sc3 = new SentenceComposite();
//        sc1.add(w1);
//        sc1.add(w2);
//        sc1.add(w3);
//        sc2.add(w4);
//        sc3.add(sc2);
//        sc3.add(sc1);
//        sc3.print();
//    }

    public static void main ( String [] args ) {
        Order order = new Order () ;
        Customer customer = new Customer () ;
        order . addObserver ( customer ) ;
        order . setData ( " 123.5326 , 237.9277 " , " 6 W 40 th Street , New York " , 10) ;
        order . notifyObservers () ;
    }
}