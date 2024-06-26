// Java Program to implement
// parse() Method with Default Pattern
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Date{

    public static void main(String[] args) {
        String date = "2024-01-20";

        LocalDate localDate = LocalDate.parse(date);

        System.out.println(date.getClass().getName());
        System.out.println(localDate.getClass().getName());

        System.out.println(localDate);
    }
}
