import java.util.Scanner;
public class InterestEarned {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double p = 0;
        double ir = 0;
        double c = 0;
        System.out.println("What is the principal amount?");
        p = input.nextDouble();
        System.out.println("What is the annual interest rate as a decimal?");
        ir = input.nextDouble();
        System.out.println("How many times is the interest compounded during the year?");
        c = input.nextDouble();
        double FA =p*Math.pow(1+ir/c, c);
        double IE = FA-p;
        System.out.println("Interest rate:   " + ir + "\nTimes compounded:   " + c + "\nPrincipal amount:   " + p + "\nInterest earned:   " + IE + "\nFinal amount:   " + FA);
    }//ends main
}//ends class
