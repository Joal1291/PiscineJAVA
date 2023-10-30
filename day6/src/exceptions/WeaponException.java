package exceptions;

public class WeaponException extends Exception {

    public WeaponException(){
        super();
    }
    public WeaponException(String chain){
        super(chain);
    }
}
