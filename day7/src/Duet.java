public class Duet<T extends Comparable<T>> {

    // --- METHODS
    public static <T extends Comparable <T>> T min(T first, T second){
        if(first.compareTo(second) < 0){
            return first;
        }else{
            return second;
        }
    }
    public static <T extends Comparable<T>> T max(T first, T second){
        if(first.compareTo(second) > 0){
            return first;
        }else{
            return second;
        }
    }
}
