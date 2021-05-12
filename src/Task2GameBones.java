import java.util.Random;
import java.util.Scanner;

public class Task2GameBones {
    public static void main(String[] args) {
        int playerStats = 0, choice = 0;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int i = 0;
        while (i <=5){
            System.out.println("Do next step:\n" +
                    "1 - throw bones\n" +
                    "2 - restart game\n" +
                    "0 - finish game \n\n" +
                    "the current step is " + (i+1) + " from " + " 6 steps. There are last " + (6 - (i+1)) + " steps\n" +
                            " The value of player stats is " + playerStats + "\n\n");
            choice = scanner.nextInt();
            if(choice == 1){
                ++i;
                playerStats += (int) Math.round((Math.random() * 7));

            } if(choice == 2){
                i = 0;
                playerStats = 0;
                continue;
            } if (choice == 0){
                System.out.println("The game is over " + "the current step is " + (i+1) + " value of player stats is " + playerStats);
                break;
            }if (i == 5 & playerStats < 20) {
                System.out.println("The game is over " + "the current step is " + (i+1) + " value of player stats is " + playerStats +
                        ". The score is too low");
                break;

            } if (i == 5 & playerStats > 20) {
                System.out.println("The game is over " + "the current step is " + (i + 1) + " value of player stats is " + playerStats +
                        ". The score is too height");
                break;
            } if (i == 5 & playerStats ==  20) {
                System.out.println("The game is over " + "the current step is " + (i + 1) + " value of player stats is " + playerStats +
                        ". You WIN");
                break;
            }else{
                System.out.println("Incorrect input");
            }
        }
    }
}
