import java.util.Scanner;

public class Dollars {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in dollars:");

        int amount = input.nextInt();

        int twenties = amount/20;
        amount %= 20;

        int tens = amount/10;
        amount %= 10;

        int fives = amount/5;
        amount %= 5;

        int ones = amount/1;
        amount %= 1;

        


        System.out.println("20s:" +twenties);
        System.out.println("10s:"+tens);
        System.out.println("5s:"+fives);
        System.out.println("1s:"+ones);
        
    }
    
}
