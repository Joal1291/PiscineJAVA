package Observer;
import java.util.List;
import java.util.ArrayList;

public class Order implements Observable{
    // --- VARIABLES ---
    private String position;
    private String destination;
    private int timeBeforeArrival;
    private List<Observer> observers= new ArrayList();

    // --- ORDER ---
    public Order(){}

    // --- GETTER, SETTER ---
    public String getPosition(){return this.position;}
    public String getDestination() {return destination;}
    public int getTimeBeforeArrival(){return this.timeBeforeArrival;}

    // --- METHODS ---
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public boolean notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
        return false;
    }
    public void setData(String position, String destination, int time){
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = time;
        this.notifyObservers();
    }
}
