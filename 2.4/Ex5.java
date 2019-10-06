import java.util.Scanner;

public class Ex5    {
    public static void main(String[] args)  {
        String symbol;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What character do you want your triangle made of? ");
        symbol = sc.nextLine();
        System.out.println("");
        
        System.out.print("How tall do you want your triangle? ");
        num = sc.nextInt();
        System.out.println("");
        
        System.out.println("Here's your triangle!");
        for(int y = 0; y < num; y++) {
            for(int x = 0; x <= y; x++)  {
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
}
