package Factory;

public class NoSuchToyException extends Exception{

    // --- CONSTRUCTOR
    public NoSuchToyException(){
        super();
    }
    public NoSuchToyException(String chain){
        super(chain);
    }
}
