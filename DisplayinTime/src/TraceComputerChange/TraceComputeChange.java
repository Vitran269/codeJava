package TraceComputerChange;

public class TraceComputeChange {
    public static void main(String[] args) {
        double amount = 11.56d;
        int remainingAmount = (int)(amount * 100);
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        System.out.println("numberOfOneDollars    " + numberOfOneDollars);
        System.out.println("numberOfQuarters     " + numberOfQuarters);
        System.out.println("numberOfDimes      " + numberOfDimes);
        System.out.println("numberOfNickels      " + numberOfNickels);

    }
}
