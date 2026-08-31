import java.util.Scanner;

public class CobroEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas en el estacionamiento: ");
        int horas = scanner.nextInt();
        double totalPagar = 0.0;

        if (horas <= 0) {
            System.out.println("Error: Ingrese un número de horas mayor a cero.");
        } else if (horas <= 2) {
            totalPagar = horas * 30.0;
        } else if (horas <= 5) {
            // Primeras 2 horas ($60) + horas restantes a $25
            totalPagar = (2 * 30.0) + ((horas - 2) * 25.0);
        } else if (horas <= 10) {
            // Primeras 2 hrs ($60) + siguientes 3 hrs ($75) + horas restantes a $20
            totalPagar = (2 * 30.0) + (3 * 25.0) + ((horas - 5) * 20.0);
        } else {
            // Más de 10 horas: tarifa de día completo
            totalPagar = 380.0;
        }

        if (horas > 0) {
            System.out.printf("El total a pagar es: $%.2f%n", totalPagar);
        }

        scanner.close();
    }
}
