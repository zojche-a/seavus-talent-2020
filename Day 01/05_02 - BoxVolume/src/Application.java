import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Enter integer values for height, width and depth of box: ");

        System.out.print("height = ");
        int height = new Scanner(System.in).nextInt();

        System.out.print("width = ");
        int width = new Scanner(System.in).nextInt();

        System.out.print("depth = ");
        int depth = new Scanner(System.in).nextInt();


        Box box = new Box(height, width, depth);
        int volume = box.getVolume();

        System.out.println("Volume of this box is " + volume);
    }
}
