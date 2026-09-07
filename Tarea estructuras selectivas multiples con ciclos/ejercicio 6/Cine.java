import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int personas;
        int dia;
        double total;
        char membresia;
        char continuar;

        do {

            System.out.print("Ingrese el numero de personas: ");
            personas = entrada.nextInt();

            System.out.println("\n1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miercoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Sabado");
            System.out.println("7. Domingo");

            System.out.print("Seleccione el dia: ");
            dia = entrada.nextInt();

            System.out.print("¿Tiene membresia? (S/N): ");
            membresia = entrada.next().charAt(0);

            if (dia == 3) {

                total = personas * 30;

            } else if (dia == 4) {

                total = (personas / 2) * 75;

                if (personas % 2 != 0) {
                    total = total + 50;
                }

            } else {

                total = personas * 50;
            }

            if (membresia == 'S' || membresia == 's') {
                total = total * 0.90;
            }

            System.out.println("Precio total: $" + total);

            System.out.print("\n¿Desea realizar otra compra? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");

        entrada.close();
    }
}