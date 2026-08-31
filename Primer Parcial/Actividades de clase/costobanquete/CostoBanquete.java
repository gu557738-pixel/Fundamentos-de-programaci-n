import java.util.Scanner;

public class CostoBanquete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de platillos: ");
        int cantidad = scanner.nextInt();

        double precioPorPlatillo;

        if (cantidad <= 200) {
            precioPorPlatillo = 95.0;
        } else if (cantidad <= 300) {
            precioPorPlatillo = 85.0;
        } else {
            precioPorPlatillo = 75.0;
        }

        double total = cantidad * precioPorPlatillo;

        System.out.println("El costo total del banquete es: $" + total);

        scanner.close();
    }
}