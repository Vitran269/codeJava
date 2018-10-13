package SwitchCase;
import java.util.Scanner;
public class leapyear {





    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();

            System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ?  year + " is a leap year " : year + " is not a leap year");
    }
}