import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.next();
        LocalDate date = LocalDate.parse(input);

        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Updated Date: " + newDate.format(format));
    }
}
