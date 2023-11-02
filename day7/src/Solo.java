public class Solo<T>{
    // --- VARIABLES
    private T value;

    // --- CONSTRUCTOR
    public Solo(T value){
        this.value = value;

    }

    // --- GETTERS, SETTERS
    //value
    public T getValue(){return this.value;}
    public void setValue(T value){this.value = value;}
}
