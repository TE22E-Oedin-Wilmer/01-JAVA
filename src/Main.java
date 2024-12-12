import jdk.jshell.spi.ExecutionControlProvider;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        /*if (6 >= 3) {
            System.out.println("Hello, world!");
        }*/


        /*boolean correct = false;
        while (!correct) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();

            if (Objects.equals(username, "noname") && Objects.equals(password, "nopass")) {
                System.out.println("Welcome!");
                correct = true;
            } else {
                System.out.println("Wrong username or password!");
            }
        }*/

        /*for (int i = 32; i > 0; i--){
            System.out.println("Hello world!");
        }*/

        /*for (int i = 5; i > 0; i--)
        {
            try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Type a number");
            int num = scan.nextInt();
            if (num > 5) {
                System.out.println("högre än 5!");
            }
            }
            catch (InputMismatchException e) {
                System.out.println("A number moron....");
            }
        }*/


        /*boolean moron = true;
        Scanner sc = new Scanner(System.in);
        while (moron){
            try {
            System.out.println("Type a number:");
            int number = sc.nextInt();
            moron = false;

            }
            catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("dum....");
            }
        }*/


        boolean findnum = true;
        Scanner sc = new Scanner(System.in);
        Random randNum = new Random();
        int randis = randNum.nextInt(100);


        while (findnum){
            try {
                System.out.println("Guess what number im thinking of ;)");
                int guess = sc.nextInt();

                if (guess == randis){
                    findnum = false;
                }
                else if (guess < randis){
                    System.out.println("Try a higher number haha");
                }
                else if (guess > randis){
                    System.out.println("Try a lower number haha");
                }

            }
            catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("dum.... type number");
            }
        }







    }
}