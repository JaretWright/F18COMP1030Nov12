import java.security.SecureRandom;

public class RandomNumberExample {
    public static void main(String[] args)
    {
        SecureRandom rng = new SecureRandom();
        int randNum = rng.nextInt(10);

        System.out.printf("The random number is: %d%n", ++randNum);

        for (int i=1; i<=randNum; i++)
            System.out.println("My name is Jaret");
    }
}
