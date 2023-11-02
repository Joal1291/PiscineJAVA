package Composite;
import java.util.List;
import java.util.ArrayList;

public class SentenceComposite implements Sentence{

    // --- VARIABLES ---
    private List<Sentence> childSentence = new ArrayList<>();

    // --- CONSTRUCTOR ---
    public SentenceComposite(){

    }
    // --- METHODS ---
    @Override
    public void print() {
        for (Sentence sentence : childSentence) {
            sentence.print();
        }
    }
    public void add(Sentence sentence){
        childSentence.add(sentence);
    }
    public void remove(Sentence sentence){
        childSentence.remove(sentence);
    }
}
