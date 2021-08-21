import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a, b;
        String result;
        System.out.println("Enter num 1");
        a=in.nextInt();
        System.out.println("Enter num 2");
        b=in.nextInt();
        //ternary operator
        result=(a>b)?"num 1["+a+" ]is greater than num2 [" +b+"]":"num 1["+a+" ]is less than num2 [" +b+"]";
        System.out.println(result);
    }
}
