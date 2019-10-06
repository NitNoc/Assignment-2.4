import java.util.Scanner;

public class Ex6  {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        double rng = 0;
        int out = 0;
        String ask = "y";
        while(ask.equals("y"))   {
            //for(int i = 0; i >= 0; i++) {
                n = 0;
                out = 0;
                System.out.print("How many D6's do you want to roll? ");
                n = sc.nextInt();
                System.out.println("");
                System.out.print("You rolled ");
                for(int j = 1; j <= n; j++ )    {
                    rng = Math.random();
                    if(rng <= 0.16)   rng = 1;
                    if(rng > 0.16 && rng <= 0.32)   rng = 2;
                    if(rng > 0.32 && rng <= 0.48)   rng = 3;
                    if(rng > 0.48 && rng <= 0.64)   rng = 4;
                    if(rng > 0.64 && rng <= 0.8)   rng = 5;
                    if(rng > 0.8 && rng <= 1)   rng = 6;
                    int f = (int) rng;
                    System.out.print(f + " ");
                    out = f + out;
                }
                System.out.println("");
                System.out.println(out + " ");
                System.out.println("");
                System.out.print("Again ? [y,n] ");
                ask = sc.next();
            //}
        }
    }
}
