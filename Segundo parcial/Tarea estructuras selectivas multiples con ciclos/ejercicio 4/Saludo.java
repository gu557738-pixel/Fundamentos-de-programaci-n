import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hora;
        char continuar;

        do {

            System.out.print("Ingrese la hora (0-23): ");
            hora = entrada.nextInt();

            if (hora >= 6 && hora <= 12) {

                System.out.println("Buenos dias");

            } else if (hora >= 13 && hora <= 20) {

                System.out.println("Buenas tardes");

            } else if ((hora >= 21 && hora <= 23) ||
                       (hora >= 0 && hora <= 5)) {

                System.out.println("Buenas noches");

            } else {

                System.out.println("Hora no valida.");
            }

            System.out.print("\n¿Desea consultar otra hora? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");

        entrada.close();
    }
}