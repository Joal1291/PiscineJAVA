public class Test{
    public static void main(String[] args){
        Gecko arthur = new Gecko("Arthur", 10);
        Gecko jean = new Gecko("Jean", 5);
        Snake yo = new Snake();
        arthur.setEnergy(5);
        arthur.fraternize(yo);

        System.out.println("Energy Arhtur : " + arthur.getEnergy());
    }   
}
