import planet.Mars;

class Astronaut{
    private String name;
    private int snack = 0;
    private String destination = null;
    private static int lastId = -1;
    private int id;

    // --- Constructor
    Astronaut(String name){
        this.name = name;
        this.id = ++lastId;
//        System.out.println(name + " ready for lunch!");
    }

    // --- Getter, Setter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDestination(){
        return destination;
    }
    public int getSnack(){
        return snack;
    }
    // --- Methods
    public void doAction(){
        System.out.println(getName() + ": Nothing to do.");
        if (this.destination == null) {
            this.snack++;
            System.out.println(getName() + ": I may have done nothing but have " + this.snack + " Mars to eat at least!");
        }
    }
    public void doAction(Mars params){
        this.destination = params.getLandingSite();
        System.out.println(getName() + ": Started a mission!");
    }
    public void doAction(chocolate.Mars params) {
        System.out.println(getName() + ": Thanks for this Mars number " + params.getId());
        if (this.destination == null) {
            this.snack++;
            System.out.println(getName() + ": I may have done nothing but have " + this.snack + " Mars to eat at least!");
        }
    }

}