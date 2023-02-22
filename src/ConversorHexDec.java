import java.util.Scanner;

/**
 * This class contains a program that converts numbers from hexadecimal to decimal and vice versa.
 */
public class ConversorHexDec {

    /**
     * Main method that starts the program.
     *
     * @param args command line arguments. They are not used in this program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3-digit hexadecimal number:");
        String hex = sc.nextLine();

        // Convert from hexadecimal to decimal
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("The hexadecimal number is: " + decimal);

        System.out.println("Enter a 3-digit decimal number:");
        int dec = sc.nextInt();

        // Convert from decimal to hexadecimal
        String hexa = Integer.toHexString(dec);
        System.out.println("The equivalent hexadecimal number is: " + hexa.toUpperCase());
    }
}

