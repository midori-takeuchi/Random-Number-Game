/**
 * Created by midoritakeuchi on 15-04-11.
 */
import java.util.Scanner;

public class RandomNumber {

    static int random() {
        return (int)(Math.random() * 100);
    }
    static void begin_game() {
        int random_number = random();
        Scanner in = new Scanner(System.in);
        int guess = 0;
        while (guess != random_number) {
                System.out.println("Enter a guess between 1 and 100");
                guess = in.nextInt();
                if (guess > random_number) {
                    System.out.println("Guess lower!");
                } else if (guess < random_number) {
                    System.out.println("Guess higher!");
                }
        }
        if (guess == random_number) {
            System.out.println("You win!");
        }
    }
}
