package Number_Game;

import java.util.Scanner;

public class PlayMore {
     static void playAgain() {
        System.out.println("Play Again Y/N ??");
        Scanner sc =new Scanner(System.in);
        String x= sc.next();
        if(x.equalsIgnoreCase("y")) {
            Game.play();
        }
        else if (x.equalsIgnoreCase("n")){
            System.out.println("Exiting the Game....");
            System.exit(0);
        }
        else{
            System.out.println("Wrong choice entered..");
            playAgain();
        }
    }
}
