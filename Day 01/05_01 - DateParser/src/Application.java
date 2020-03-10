import java.util.Scanner;


public class Application {

    public static void main(String[] args) {

        System.out.println("Enter a date in format MM/DD/YYYY:");

        String date = new Scanner(System.in).nextLine();

        String regex = "(^(([0]?[1-9])|([1][0-2])))/(([0]?[1-9])|([1-2][0-9])|([3][0-1]))/[0-9]{4}$";

        if (date.matches(regex)) {
            String[] splitted = date.split("/");

            String month = splitted[0];
            String day = splitted[1];
            String year = splitted[2];

            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println("Year: " + year);
        } else {
            System.out.println("Invalid date format.");
        }


    }
}
