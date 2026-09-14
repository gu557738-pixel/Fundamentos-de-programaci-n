import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes;
        char continuar;

        do {

            System.out.print("Ingrese el dia de nacimiento: ");
            dia = entrada.nextInt();

            System.out.print("Ingrese el mes de nacimiento: ");
            mes = entrada.nextInt();

            if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                System.out.println("Aries");

            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                System.out.println("Tauro");

            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                System.out.println("Geminis");

            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                System.out.println("Cancer");

            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                System.out.println("Leo");

            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                System.out.println("Virgo");

            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                System.out.println("Libra");

            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                System.out.println("Escorpio");

            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                System.out.println("Sagitario");

            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                System.out.println("Capricornio");

            } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                System.out.println("Acuario");

            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                System.out.println("Piscis");

            } else {
                System.out.println("Fecha no valida.");
            }

            System.out.print("\n¿Desea consultar otro horoscopo? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");

        entrada.close();
    }
}