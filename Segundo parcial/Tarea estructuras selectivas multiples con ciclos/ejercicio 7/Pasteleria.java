import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int chocolate;
        int snack;
        double precio;
        char personalizar;
        char continuar;

        do {

            precio = 0;

            System.out.println("\n===== PASTELERIA =====");
            System.out.println("1. Manzana - $200");
            System.out.println("2. Fresa - $250");
            System.out.println("3. Chocolate");

            System.out.print("Seleccione el sabor: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    precio = 200;
                    break;

                case 2:
                    precio = 250;
                    break;

                case 3:
                    System.out.println("\n1. Chocolate negro - $280");
                    System.out.println("2. Chocolate blanco - $300");

                    System.out.print("Seleccione el tipo de chocolate: ");
                    chocolate = entrada.nextInt();

                    if (chocolate == 1) {
                        precio = 280;
                    } else if (chocolate == 2) {
                        precio = 300;
                    } else {
                        System.out.println("Opcion no valida.");
                    }
                    break;

                default:
                    System.out.println("Sabor no valido.");
            }

            if (precio > 0) {

                System.out.println("\n¿Desea agregar snack?");
                System.out.println("1. Si");
                System.out.println("2. No");

                System.out.print("Seleccione: ");
                snack = entrada.nextInt();

                if (snack == 1) {
                    precio = precio + 25;
                }

                System.out.print("¿Desea personalizar con un nombre? (S/N): ");
                personalizar = entrada.next().charAt(0);

                if (personalizar == 'S' || personalizar == 's') {
                    precio = precio + 30;
                }

                System.out.println("\n===== PRESUPUESTO =====");
                System.out.println("Precio total: $" + precio);
            }

            System.out.print("\n¿Desea realizar otro presupuesto? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
