import java.util.Scanner;
public class InterestEarned {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double p = 0;
        double ir = 0;
        int c = 0;
        System.out.println("What is the principal amount?");
        p = input.nextDouble();
        System.out.println("What is the annual interest rate as a decimal?");
        ir = input.nextDouble();
        System.out.println("How many times is the interest compounded during the year?");
        c = input.nextInt();
        double FA =p*Math.pow(1+ir/c, c);
        double IE = FA-p;
        ir = ir*100;
        System.out.printf("Interest Rate:      %.2f%%%nTimes Compounded:   %d%nPrincipal:         $%.2f%nInterest Earned:   $%.2f%nAmount in Savings: $%.2f", ir, c, p, IE, FA);
        //System.out.println("Interest rate:   " + ir + "\nTimes compounded:   " + c + "\nPrincipal amount:   " + p + "\nInterest earned:   " + IE + "\nAmount in Savings:   " + FA);
    }//ends main
}//ends class
