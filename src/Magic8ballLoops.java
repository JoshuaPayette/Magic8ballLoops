import java.util.Random;
import java.util.Scanner;

public class Magic8ballLoops {
    public static void main(String[]args){
        Scanner board = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Welcome to the Magic 8 Ball.\nI am the all knowing entity ask me a yes or no question ");
        System.out.println("and your fate will be decided...\nor type (no) if you wish to not\nlearn your fate.");


        while(!board.nextLine().equals("no")){
            int randomNumber = generator.nextInt(10) + 1;
            if (randomNumber == 1) {
                System.out.println("I could see that happening");
            }
            if (randomNumber == 2) {
                System.out.println("Not good, not good at all");
            }
            if (randomNumber == 3) {
                System.out.println("Not anytime soon.");
            }
            if (randomNumber == 4) {
                System.out.println("It's looking promising");
            }
            if (randomNumber == 5) {
                System.out.println("N-0 which spells NO");
            }
            if (randomNumber == 6) {
                System.out.println("Results say yes");
            }
            if (randomNumber == 7) {
                System.out.println("It's looking in your favor");
            }
            if (randomNumber == 8) {
                System.out.println("You're usually lucky but not today! You are going down a slippery slope friend");
            }
            if (randomNumber == 9) {
                System.out.println("Indeed it will");
            }
            if (randomNumber == 10) {
                System.out.println("I checked in the back but couldn't see that happening. Ever");
            }
            System.out.println("If you want to ask another question go ahead if not type (no)");
        }
        System.out.println("HaHaHa thank you for playing this mystical game I hope you liked the answer....");
    }}
