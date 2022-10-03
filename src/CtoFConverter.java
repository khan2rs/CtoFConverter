import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        double celsius;
        double fahrenheit;
        String trash;

        Scanner in = new Scanner(System.in);
        System.out.println("Input the celsius value:");

        if (in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();

            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Your value in Fahrenheit is: " + fahrenheit);


        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);
        }

    }
}