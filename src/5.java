import java.util.Random;

public class MySchoolProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println("The randomly generated number is: " + randomNumber);
    }
}
