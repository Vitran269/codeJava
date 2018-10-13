package SwitchCase;
import java.util.Scanner;
public class SwitchCaseE {
    public static boolean LeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int monthNumber;
        monthNumber = in.nextInt();
        System.out.println("Enter a year :");
        int year;

        year = in.nextInt();


        switch (monthNumber) {

            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:

                System.out.println("Number of days: 31");

                break;

            case 4:

            case 6:

            case 9:

            case 11:

                System.out.println("Number of days: 30");

                break;

            case 2:
//                if (LeapYear(year) )
//
//                    System.out.println("Number of days: 29");
//                else
//                    System.out.println("28 days");
                System.out.println((LeapYear(year) )? "Number of days: 29":"28 days");

                break;

            default:

                System.out.println("Invalid month.");

                break;



        }

    }

}

