import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Percentage Calculator:-");
        System.out.print("Your Total Number Out Of -- [100,80,70,Other]: ");


        double Total = sc.nextDouble();
        double store = Total*4;


        System.out.println("Enter Your Subject Numbers:");
        System.out.print("Maths: ");
        double a = sc.nextDouble();

        System.out.print("science: ");
        double b = sc.nextDouble();

        System.out.print("Social Science: ");
        double c = sc.nextDouble();

        System.out.print("English: ");
        double d = sc.nextDouble();

        double sum= a+b+c+d;
        System.out.print("Your Overall Percentage is: "+sum*100/store+"%");


    }
}