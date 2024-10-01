public class Main {
    public static void main(String[] args) {
        int creditCardBalance = 5000;
        double interestRate = 0.17;
        double interestMonthOne;
        double interestMonthTwo;
        double finalBalanceMonthOne;
        double finalBalanceMonthTwo;
        interestMonthOne = creditCardBalance * interestRate;
        finalBalanceMonthOne = creditCardBalance + interestMonthOne;
        System.out.println("The final balance is" + " " + finalBalanceMonthOne);
        interestMonthTwo = creditCardBalance * interestRate * 2;
        finalBalanceMonthTwo = finalBalanceMonthOne + interestMonthTwo;
        System.out.println("The final balance is" + " " + finalBalanceMonthTwo);
    }
}