import java.util.HashSet;
import java.util.Scanner;

public class HashSetNumeros {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 números diferentes:");
        while (numeros.size() < 5) {
            System.out.print("Número: ");
            int num = scanner.nextInt();
            if (!numeros.add(num)) {
                System.out.println("Número duplicado, intente con otro.");
            }
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        
        System.out.println("La suma de los números es: " + suma);
        scanner.close();
    }
}
