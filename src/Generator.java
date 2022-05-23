import java.util.Random;

public class Generator {
    public static Random GetSeed(){
        Random seed = new Random(System.currentTimeMillis());
        return seed;
    }
    public static void main(String[] args) {
        System.out.println(GetSeed());
    }
}
