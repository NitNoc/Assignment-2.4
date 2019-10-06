import java.util.Scanner;

public class Ex3    {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int input = 0;

        while(input >= 0)   {
            System.out.print("Add ");
            input = sc.nextInt();
            if(input >= 0)  {
                num = num + input;
            }
        }
        System.out.print("");
        System.out.println("Your total is " + num);
    }
}
