import java.util.Scanner;

/**
 * Esta clase contiene un programa que convierte números de hexadecimal a decimal y viceversa.
 */
public class ConversorHexDec {

    /**
     * Método principal que inicia el programa.
     *
     * @param args los argumentos de línea de comandos. No se utilizan en este programa.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número hexadecimal de 3 dígitos:");
        String hex = sc.nextLine();

        // Convertir de hexadecimal a decimal
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("El número decimal equivalente es: " + decimal);

        System.out.println("Ingrese un número decimal de 3 dígitos:");
        int dec = sc.nextInt();

        // Convertir de decimal a hexadecimal
        String hexa = Integer.toHexString(dec);
        System.out.println("El número hexadecimal equivalente es: " + hexa.toUpperCase());
    }
}

