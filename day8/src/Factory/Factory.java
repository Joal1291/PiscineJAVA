package Factory;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Factory {

    // --- METHODS
    public List<GiftPaper> getPapers(int nbr) {
        List<GiftPaper> papers = new ArrayList<>();
        for(int i = 1; i <= nbr; i++){
            papers.add(new GiftPaper());
        }
        return papers;
    }

    public Toy create(String toy) throws NoSuchToyException{
        String toyToCreate = toy.toLowerCase();
        if(!toyToCreate.equals("teddy") && !toyToCreate.equals("gameboy")){
            throw new NoSuchToyException("No such toy : " + toy);
        }else if(toyToCreate.equals("teddy")){
            return new TeddyBear();
        }else return new Gameboy();
    }
}
