import java.util.Scanner;

/**
 *
 * @author Dariem Yesca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        int ancho, altura;
        boolean inputValido = false;

        do {
            try {
                System.out.print("Ingrese el ancho del rectángulo: ");
                ancho = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la altura del rectángulo: ");
                altura = Integer.parseInt(scanner.nextLine());

                rectangulo.setAncho(ancho);
                rectangulo.setAltura(altura);

                inputValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            } catch (RectanguloException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!inputValido);

        int area = rectangulo.calcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }
}

