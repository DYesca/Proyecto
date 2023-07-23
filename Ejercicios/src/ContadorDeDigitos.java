
/**
 *
 * @author Dariem Yesca
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContadorDeDigitos {

    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while (true) {
            try {
                System.out.print("Ingrese un número entero: ");
                numero = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Limpiar el buffer de entrada
            }
        }

        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
    }
}
