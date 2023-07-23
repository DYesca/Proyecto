
/**
 *
 * @author Dariem Yesca
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

    // Excepción personalizada para números inválidos
    static class NumeroInvalidoException extends Exception {
        public NumeroInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    // Función recursiva para obtener el valor en la sucesión de Fibonacci para un número dado
    public static int fibonacciRecursivo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor que cero.");
        } else if (n == 1) {
            return 0; 
        } else if (n == 2) {
            return 1; 
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el número de Fibonacci deseado (mayor o igual a 0): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                throw new NumeroInvalidoException("El número debe ser mayor o igual a 0.");
            }

            int resultado = fibonacciRecursivo(numero);
            System.out.println("El valor en la sucesión de Fibonacci para " + numero + " es: " + resultado);
        } catch (NumeroInvalidoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Ingrese un número válido.");
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

