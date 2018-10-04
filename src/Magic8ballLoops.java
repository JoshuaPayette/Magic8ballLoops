import java.util.Random;
import java.util.Scanner;

public class Magic8ballLoops {
    public static void main(String[]args){
        Scanner board = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Welcome to the Magic 8 Ball.\nI am the all knowing entity ask me a yes or no question ");
        System.out.println("and your fate will be decided...\nor type (no) if you wish to not\nlearn your fate.");


        while(!board.nextLine().equals("no")){
            int randomNumber = generator.nextInt(20) + 1;
            if (randomNumber == 1) {
                System.out.println("It is certain.");
            }
            if (randomNumber == 2) {
                System.out.println("Not good, not good at all");
            }
            if (randomNumber == 3) {
                System.out.println("Without a doubt.");
            }
            if (randomNumber == 4) {
                System.out.println("Yes, definitely.");
            }
            if (randomNumber == 5) {
                System.out.println("You may rely on it.");
            }
            if (randomNumber == 6) {
                System.out.println("As I see it, yes.");
            }
            if (randomNumber == 7) {
                System.out.println("Most likely.");
            }
            if (randomNumber == 8) {
                System.out.println("The outlook is good");
            }
            if (randomNumber == 9) {
                System.out.println("Yes.");
            }
            if (randomNumber == 10) {
                System.out.println("Signs point to yes.");
            }
            if (randomNumber == 11) {
                System.out.println("Reply hazy.");
            }
            if (randomNumber == 12) {
                System.out.println("Ask again later.");
            }
            if (randomNumber == 13) {
                System.out.println("Better not tell you now.");
            }

            if (randomNumber == 14) {
                System.out.println("Cannot predict now.");
            }

            if (randomNumber == 15) {
                System.out.println("Concentrate and ask again.");
            }
            if (randomNumber == 16) {
                System.out.println("Don't count on it.");
            }
            if (randomNumber == 17) {
                System.out.println("My reply is no.");
            }
            if (randomNumber == 18) {
                System.out.println("My sources say no.");
            }
            if (randomNumber == 19) {
                System.out.println("Outlook does not look so good.");
            }
            if (randomNumber == 20) {
                System.out.println("Very doubtful.");
            }
            System.out.println("If you want to ask another question go ahead if not type (no)");
        }
        System.out.println("hahaha thank you for playing this mystical game I hope you liked the answer....");
    }}
