public class Pair<T, V>{

    // --- VARIABLES
    private T first;
    private V second;

    // --- CONSTRUCTOR
    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    // --- GETTERS, SETTERS
    //first
    public T getFirst() {return first;}
    //second
    public V getSecond() {return second;}


    // --- METHODS
    public void display(){
        System.out.println("first: " + this.first + ", second: " + this.second);
    }
}
