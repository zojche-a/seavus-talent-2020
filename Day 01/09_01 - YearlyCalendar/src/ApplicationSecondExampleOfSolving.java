import java.util.Scanner;

public class ApplicationSecondExampleOfSolving {

    public static void main(String[] args) {

        System.out.println("Enter a year: ");

        int year = new Scanner(System.in).nextInt();

        String[] calendar;

        if (year % 4 == 0) {
            calendar = new String[378];
        } else {
            calendar = new String[377];
        }

        int days = 0;
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    for (int day = 1; day <= 31; day++) {
                        calendar[days++] = year + "-" + month + "-" + day;
                    }
                    calendar[days++] = "==================";
                    break;

                case 2:
                    if (year % 4 == 0) {
                        for (int day = 1; day <= 29; day++) {
                            calendar[days++] = year + "-" + month + "-" + day;
                        }
                        calendar[days++] = "===================";
                    } else {
                        for (int day = 1; day <= 28; day++) {
                            calendar[days++] = year + "-" + month + "-" + day;
                        }
                        calendar[days++] = "===================";
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    for (int day = 1; day <= 30; day++) {
                        calendar[days++] = year + "-" + month + "-" + day;
                    }
                    calendar[days++] = "===================";
                    break;
            }
        }
        printCalendar(calendar);
    }

    public static void printCalendar(String[] calendar){
        for (String day : calendar) {
            System.out.println(day);
        }
    }
}
