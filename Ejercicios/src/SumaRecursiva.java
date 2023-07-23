
/**
 *
 * @author Dariem Yesca
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaRecursiva {

    public static void main(String[] args) {
        int numeroEntero = obtenerNumeroEnteroPositivo();
        int resultado = sumaRecursiva(numeroEntero);
        System.out.println("La suma de los números enteros entre 0 y " + numeroEntero + " es: " + resultado);
    }

    public static int obtenerNumeroEnteroPositivo() {
        Scanner scanner = new Scanner(System.in);
        int numeroEntero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingresa un número entero positivo: ");
            try {
                numeroEntero = scanner.nextInt();
                if (numeroEntero >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("El número debe ser positivo. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero válido. Intenta de nuevo.");
                scanner.nextLine(); // Limpiar el búfer después de una entrada no válida
            }
        }
        scanner.close();
        return numeroEntero;
    }

    public static int sumaRecursiva(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }
}
