package Factory;
import java.util.List;
import java.util.ArrayList;

public class GiftPaper {
    // --- VARIABLES
    private Toy gift;

    // --- METHODS
    public void wrap(Toy gift){
        this.gift = gift;
    }

    public Toy unwrap(){
        Toy unwrapping = this.gift;
        this.gift = null;
        return unwrapping;
    }
}
