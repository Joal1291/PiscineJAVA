package Factory;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.ArrayList;

public class Elf {

    // --- VARIABLES
    private Toy toy;
    private List<GiftPaper> papers;
    private Factory factory;

    // --- CONSTRUCTOR
    public Elf(Factory factory){

    }
    // --- GETTER, SETTER

    // --- METHODS
    public boolean pickToy(String toyType) throws NoSuchToyException{
        if(toy != null){
            throw new NoSuchToyException("Minute please, I'm not that fast");
        }else{
            try{
                this.toy = factory.create(toyType);
                System.out.println("What a nice one! I would like to keep it ...");
            }catch (NoSuchToyException e){
                System.out.println("I didn't find any " + toyType);
            }
        }
        return true;
    }
    public boolean pickPapers(int nbr){
        this.papers = factory.getPapers(nbr);
        return true;
    }
    public GiftPaper pack(){
        if(papers.isEmpty()){
            System.out.println("Wait... I can't pack it with my shirt");
            return null;
        }else{
            GiftPaper paper = papers.get(papers.size() -1 );
            if(toy == null){
                System.out.println("I don't have any toy, but I have some paper!");
                return null;
            }else{
                System.out.println("And another kid will be happy!");
                paper.wrap(this.toy);
                return paper;
            }
        }
    }

}
