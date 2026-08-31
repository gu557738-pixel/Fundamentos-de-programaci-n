import java.util.Scanner;

public class Llamadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los minutos de su llamada: ");
        int minutos = scanner.nextInt();

        double costo = minutos * 0.5;

        System.out.println("El costo de la llamada es: $" + costo);

        scanner.close();
    }
}
    
}
