import java.util.Scanner;

public class Ex4    {
    public static void main(String[] args)  {
        String symbol;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What character do you want your bar made of? ");
        symbol = sc.nextLine();
        System.out.println("");
        
        System.out.print("How long do you want your bar? ");
        num = sc.nextInt();
        System.out.println("");
        
        System.out.println("Here's your bar!");
        for(int i = 0; i < num; i++) {
            System.out.print(symbol);
        }
    }
}
