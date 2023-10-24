public class Ex02 {
    public static void getAngryDog(int nbr){
        String result = "";
        for(int i = 1; i <= nbr; i++){
            result += "woof";
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        getAngryDog(3);
    }
}