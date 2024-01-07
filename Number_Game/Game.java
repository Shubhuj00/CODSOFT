package Number_Game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void play() {
        System.out.println("Guess the no between 0 to 100 you have a maximum of 10 attempts ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int r_no = r.nextInt(101);
        int maxAttempt = 10;

        while (maxAttempt > 0){

            int u_no = sc.nextInt();
            if(u_no == r_no){
                System.out.println("Congratulations you Guess the correct no.");
                break;
            }
            else if(u_no > r_no){
                System.out.println("Oops!! Too Far");
            }
            else {
                System.out.println("Oops!! Too Close");
            }
            maxAttempt--;
        }
        System.out.println("Your score : "+maxAttempt);
        PlayMore.playAgain();
    }


}
