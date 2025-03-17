import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        Random rn = new Random();
        int result = rn.nextInt(max - min + 1) + min;
        System.out.println("Random number between " + min + " and " + max + ": " + result);
    }
}
