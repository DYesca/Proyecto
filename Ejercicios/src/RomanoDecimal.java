
/**
 *
 * @author Dariem Yesca
 */
import java.util.HashMap;
import java.util.Scanner;

public class RomanoDecimal {

    private static HashMap<Character, Integer> romanValues;

    public static int romanDecimal(String romanNumber) {
        romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        return romanDecimalRecursivo(romanNumber, romanNumber.length() - 1, 0);
    }

    private static int romanDecimalRecursivo(String romanNumber, int index, int prevValue) {
        if (index < 0) {
            return 0;
        }

        char currentSymbol = romanNumber.charAt(index);
        int currentValue = romanValues.get(currentSymbol);

        int decimalNumber = (currentValue >= prevValue) ? currentValue : -currentValue;

        int restOfNumber = romanDecimalRecursivo(romanNumber, index - 1, currentValue);

        return decimalNumber + restOfNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroRomano = "";

        while (true) {
            System.out.print("Ingrese un número romano para convertir a decimal: ");
            numeroRomano = scanner.nextLine().toUpperCase();

            if (numeroRomano.matches("[IVXLCDM]+")) {
                break;
            } else {
                System.out.println("Caracter Inválido. Ingrese solo caracteres válidos de números romanos (I, V, X, L, C, D, M).");
            }
        }

        int numeroDecimal = romanDecimal(numeroRomano);
        System.out.println("El número romano '" + numeroRomano + "' es igual a " + numeroDecimal + " en decimal.");
    }
}
