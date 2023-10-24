public class Test{
    public static void main(String[] args){
        Gecko arthur = new Gecko("Arthur", 32);

        arthur.eat("Meat");
        arthur.eat("vegetable");
        arthur.eat("vegetable");
        arthur.eat("vegetable");
        arthur.eat("Meatii");


        System.out.println(arthur.getEnergy());
    }   
}
