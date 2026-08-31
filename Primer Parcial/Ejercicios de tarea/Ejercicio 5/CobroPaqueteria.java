import java.util.Scanner;

public class CobroPaqueteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en Kilogramos (kg): ");
        double pesoKg = scanner.nextDouble();

        // Validación de peso (máximo 5 kg)
        if (pesoKg > 5 || pesoKg <= 0) {
            System.out.println("EL PAQUETE HA SIDO RECHAZADO: No se transportan paquetes mayores a 5 kg o de peso inválido.");
        } else {
            System.out.println("\n--- ZONAS DE DESTINO ---");
            System.out.println("1. América del Norte");
            System.out.println("2. América Central");
            System.out.println("3. América del Sur");
            System.out.println("4. Europa");
            System.out.println("5. Asia");
            System.out.print("Seleccione el número de la zona: ");
            int zona = scanner.nextInt();

            // Convertir peso a gramos (1 kg = 1000 g)
            double pesoG = pesoKg * 1000;
            double costoGramo = 0;

            switch (zona) {
                case 1:
                    costoGramo = 11;
                    break;
                case 2:
                    costoGramo = 10;
                    break;
                case 3:
                    costoGramo = 12;
                    break;
                case 4:
                    costoGramo = 25;
                    break;
                case 5:
                    costoGramo = 30;
                    break;
                default:
                    System.out.println("Zona no válida.");
                    break;
            }

            if (costoGramo > 0) {
                double cobro = pesoG * costoGramo;
                System.out.println("\n--- RESUMEN DE ENVÍO ---");
                System.out.println("Peso del paquete: " + pesoG + " gramos (" + pesoKg + " kg)");
                System.out.println("Monto total a pagar: $" + cobro);
            }
        }

        scanner.close();
    }
}
