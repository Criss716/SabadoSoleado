import java.util.Scanner;

public class ejercicioNumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a la calculadora de números primos!");
        System.out.print("Por favor, introduce un número entero positivo: ");
        
        try {
            int numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Error: El número debe ser entero y positivo.");
            } else {
                if (esPrimo(numero)) {
                    System.out.println("El número " + numero + " es primo.");
                } else {
                    System.out.println("El número " + numero + " no es primo.");
                    System.out.println("Sus divisores son: " + obtenerDivisores(numero));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } finally {
            scanner.close();
        }
    }

 
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String obtenerDivisores(int numero) {
        StringBuilder divisores = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.append(i).append(" ");
            }
        }
        return divisores.toString();
    }
}
