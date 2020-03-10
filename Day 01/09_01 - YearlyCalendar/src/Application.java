import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Enter a year: ");
        int year = new Scanner(System.in).nextInt();

        String[] calendar = fillTheCalendar(year);

        System.out.println("Calendar for the year " + year + ":");
        printCalendar(calendar);
    }

    public static String[] fillTheCalendar(int year) {

        String[] calendar;

        if (isLeapYear(year)) {
            calendar = new String[378];
        } else {
            calendar = new String[377];
        }

        int days = 0;
        String eachDay = "";

        for (int month = 1; month <= 12; month++) {
            for (int day = 1; day <= 31; day++) {
                eachDay = year + "-" + month + "-" + day;
                if (month == 2 && day == 29) {
                    if (isLeapYear(year)) {
                        calendar[days++] = eachDay;
                        break;
                    } else {
                        break;
                    }
                }
                if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31) {
                    break;
                }
                calendar[days++] = eachDay;
            }
            calendar[days++] = "============";

        }
        return calendar;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void printCalendar(String[] calendar) {
        for (String day : calendar) {
            System.out.println(day);
        }
    }
}