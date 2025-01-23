import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int sumUsingFormula = n * (n + 1) / 2;

            int sumUsingLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingLoop += i;
            }

            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using loop: " + sumUsingLoop);

            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a discrepancy in the computations.");
            }
        } else {
            System.out.println("The entered number is not a natural number.");
        }
    }
}
