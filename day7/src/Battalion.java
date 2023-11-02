import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Battalion <T extends Character>{
    // --- VARIABLES
    private List<T> characters;


    // --- CONSTRUCTOR
    public Battalion(){
        this.characters = new ArrayList<>();
    }
    // --- METHODS
    public void add(List<T> charactersList){
        characters.addAll(charactersList);
    }
    public void display(){
        for(Character character : characters){
            System.out.println(character.getName());
        }
    }
    public boolean fight(){
        if(characters.size() < 2){
            return false;
        }else{
            if(characters.get(0).compareTo(characters.get(1)) == 1){
                characters.remove(characters.get(1));
            }else if(characters.get(0).compareTo(characters.get(1)) ==- 1){
                characters.remove(characters.get(0));
            }else if(characters.get(0).compareTo(characters.get(1)) == 0) {
                characters.remove(characters.get(0));
                characters.remove(characters.get(1));
            }
            return true;
        }
    }
}
