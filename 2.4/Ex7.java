import java.util.Scanner;

public class Ex7    {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        boolean right = false;
        int guess = 0;
        double i;
        int tries = 0;
        i = Math.random() * 100;
        int num = (int)i;
        while(right == false)   {
            System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
            System.out.print("What is your guess? ");
            tries++;
            guess = sc.nextInt();
            if(guess == num)    {
                System.out.println("You've guessed my number! Good job! It only took you " + tries + " tries.");
                right = true;
            }   else if(guess < num)   {
                System.out.println("Too low ...");
                System.out.println("");
                right = false;
            }   else if(guess > num)    {
                System.out.println("Too high ...");
                System.out.println("");
                right = false;
            }
        }
    }
}
