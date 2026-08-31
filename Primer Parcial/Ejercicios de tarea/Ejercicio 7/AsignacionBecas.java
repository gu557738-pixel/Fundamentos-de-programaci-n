import java.util.Scanner;

public class AsignacionBecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el promedio del estudiante (0 a 10): ");
        double promedio = scanner.nextDouble();

        if (edad < 0 || promedio < 0.0 || promedio > 10.0) {
            System.out.println("Error: Ingrese valores válidos para edad y promedio.");
        } else if (edad > 18) {
            // Evaluacion para mayores de 18 años
            if (promedio >= 9.0) {
                System.out.println("Beca asignada: $10,000.00 mensuales.");
            } else if (promedio >= 7.5) {
                System.out.println("Beca asignada: $8,000.00 mensuales.");
            } else if (promedio >= 6.0) {
                System.out.println("Beca asignada: $5,000.00 mensuales.");
            } else {
                System.out.println("Se le enviará una carta de invitación para estudiar más en el próximo ciclo escolar.");
            }
        } else {
            // Evaluacion para 18 años o menores
            if (promedio >= 9.0) {
                System.out.println("Beca asignada: $8,000.00 mensuales.");
            } else if (promedio >= 8.0) {
                System.out.println("Beca asignada: $6,000.00 mensuales.");
            } else if (promedio >= 6.0) {
                System.out.println("Beca asignada: $4,000.00 mensuales.");
            } else {
                System.out.println("Se le enviará una carta de invitación para estudiar más en el próximo ciclo escolar.");
            }
        }

        scanner.close();
    }
}
