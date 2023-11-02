package Composite;

public class Word implements Sentence{
    // --- VARIABLES ---
    private String word;

    // --- Constructor ---
    public Word(String word){
        this.word = word;
    }

    // --- METHODS ---
    @Override
    public void print() {
        System.out.println(word);
    }
}
