import java.util.Scanner;
    public class BoxOffice {


    public static void main (String[] args)
    {
        Scanner input =new Scanner(System.in);
        int ATP = 10;
        int CTP = 6;
        int ATS = 0;
        int CTS = 0;
        String movie = " ";
        System.out.println("What is the name of your movie?");
        movie = input.nextLine();
        System.out.println("How many adult tickets did you sell?");
        ATS = input.nextInt();
        System.out.println("How many Childrens tickets did you sell?");
        CTS = input.nextInt();
        int gross = ATS*ATP+CTS*CTP;
        double net = gross*.2;
        double distributor = gross-net;
        System.out.println(" Movie name:     " + movie + "\n Adult tickets sold:     " + ATS + "\n Childrens tickets sold:     " + CTS + "\n Gross box-office profit:     " + gross + "\n Net theatre profit:     " + net + "\n Amount paid to the distributor:     " + distributor);
    }//end main method
}//end class
