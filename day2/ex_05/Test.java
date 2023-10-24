public class Test{
    public static void main(String[] args){
        Gecko arthur = new Gecko("Arthur", 32);

        arthur.hello(2);
        arthur.hello("Jean");

        Gecko jean = new Gecko("Jean", 10);

        jean.hello(2);
        jean.hello("Jordan");

    }   
}
