import java.util.Scanner;

public class CompoundInterest {
    //main method
    public static void main(String[] args) {
        //instance of scanner class
        Scanner in=new Scanner(System.in);
        //declaring variables
        float p, r, n;
        String result;//variable intialization
        System.out.println("Enter the principal amount");
        p=in.nextFloat();//variable intialization
        System.out.println("Enter the interest rate");
        r=in.nextFloat();//variable intialization
        System.out.println("Enter the number of times that interest is compounded per unit t");
        n=in.nextFloat();
        in.close();

        //compound interest calculation
        double amount = p * Math.pow(1 + (r / n), n * r);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + n + " years: "+cinterest);
        System.out.println("Amount after " + n + " years: "+amount);

    }
}
