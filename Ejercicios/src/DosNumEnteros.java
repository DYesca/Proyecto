
/**
 *
 * @author Dariem Yesca
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class DosNumEnteros {

    public static int enteros(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        if (num1 == 1) {
            return num2;
        }
        if (num2 == 1) {
            return num1;
        }
        return num1 + enteros(num1, num2 - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        // Solicitar el primer número
        while (true) {
            try {
                System.out.print("Ingrese el primer número entero: ");
                num1 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
                scanner.nextLine();
            }
        }

        // Solicitar el segundo número
        while (true) {
            try {
                System.out.print("Ingrese el segundo número entero: ");
                num2 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
                scanner.nextLine();
            }
        }

        scanner.close();

        int result = enteros(num1, num2);
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + result);
    }
}
