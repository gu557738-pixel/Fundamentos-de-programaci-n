import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int personas;
        int dia;
        double total;
        String membresia;

        System.out.println("Ingrese el numero de personas:");
        personas = sc.nextInt();

        System.out.println("Ingrese el dia de la semana:");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        dia = sc.nextInt();

        System.out.println("¿Cuenta con membresia? (si/no)");
        membresia = sc.next();

        // Calcular precio
        if (dia == 3) {
            // Miercoles: $30 por persona
            total = personas * 30;
        } 
        else if (dia == 4) {
            // Jueves: parejas de 2 por $75
            int parejas = personas / 2;
            int individual = personas % 2;

            total = (parejas * 75) + (individual * 50);
        } 
        else {
            // Resto de los dias: $50 por persona
            total = personas * 50;
        }

        // Descuento por membresia
        if (membresia.equalsIgnoreCase("si")) {
            total = total * 0.90;
        }

        System.out.println("El precio total es: $" + total);

        sc.close();
    }
}