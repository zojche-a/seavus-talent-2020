import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Please enter the numbers as words separated each other by a space:");
        String digitsAsWords = new Scanner(System.in).nextLine();

        int number = makeANumber(digitsAsWords);
        System.out.println(number);
    }

    public static int makeANumber(String digitsAsWords) {

        String[] singleDigits = digitsAsWords.split(" ");
        String numberString = "";

        for (String string : singleDigits) {
            switch (string.toLowerCase()) {
                case "zero":
                    numberString += "0";
                    break;
                case "one":
                    numberString += "1";
                    break;
                case "two":
                    numberString += "2";
                    break;
                case "three":
                    numberString += "3";
                    break;
                case "four":
                    numberString += "4";
                    break;
                case "five":
                    numberString += "5";
                    break;
                case "six":
                    numberString += "6";
                    break;
                case "seven":
                    numberString += "7";
                    break;
                case "eight":
                    numberString += "8";
                    break;
                case "nine":
                    numberString += "9";
                    break;
            }
        }

        int number = Integer.parseInt(numberString);
        return number;
    }
}