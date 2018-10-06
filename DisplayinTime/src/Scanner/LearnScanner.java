package Scanner;
import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        int loanAmount, monthlyInterestRate;
        double Payment;
        int numberOfYears;
        Scanner input = new Scanner(System.in);
        System.out.println("Input loanAmount : ");
        loanAmount = input.nextInt();
        System.out.println("Input monthlyInterestRate : ");
        monthlyInterestRate = input.nextInt();
        System.out.println("Input numberofyears : ");
        numberOfYears = input.nextInt();
        Payment = (loanAmount * monthlyInterestRate) / (1 - (1/Math.pow((1 + monthlyInterestRate),(numberOfYears*12))));
        System.out.println(Payment);
    }
}
