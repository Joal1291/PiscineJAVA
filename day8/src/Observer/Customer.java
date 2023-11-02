package Observer;

public class Customer implements Observer{

    // --- VARIABLES ---

    // --- CONSTRUCTOR ---
    public Customer(){}

    // --- METHODS ---
    @Override
    public void update(Observable observable) {
        if(observable instanceof Order){
            System.out.println("Position (" + ((Order) observable).getPosition() + "), " + ((Order) observable).getTimeBeforeArrival() + " minutes before arrival at " + ((Order) observable).getDestination());
        }

    }
}
