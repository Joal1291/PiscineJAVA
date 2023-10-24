public class Ex06 {
    public static void sequence(int nbr){
        String current = "1";
        for (int i=0; i <= nbr ; i++){
            System.out.println(current);
            current = nextTerm(current);
        }
    }
    static String nextTerm(String current){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 1; i < current.length(); i++){
            if(current.charAt(i) == current.charAt(i-1)){
                count++;
            }else{
                result.append(count).append(current.charAt(i-1));
            }
        }
        result.append(count).append(current.charAt(current.length()-1));
        return result.toString();
    }
    public static void main(String[] args){
        sequence(0);
    }
}
