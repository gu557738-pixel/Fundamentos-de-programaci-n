import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sabor;
        String chocolate;
        String snack;
        String nombre;
        int cantidadSnack;
        double precio = 0;
        double total;

        System.out.println("¿De que sabor quiere la tarta?");
        System.out.println("1. Manzana");
        System.out.println("2. Fresa");
        System.out.println("3. Chocolate");
        sabor = sc.next();

        // Precio de la tarta
        if (sabor.equalsIgnoreCase("manzana")) {
            precio = 200;
        } 
        else if (sabor.equalsIgnoreCase("fresa")) {
            precio = 250;
        } 
        else if (sabor.equalsIgnoreCase("chocolate")) {

            System.out.println("¿Que tipo de chocolate quiere?");
            System.out.println("1. Negro");
            System.out.println("2. Blanco");
            chocolate = sc.next();

            if (chocolate.equalsIgnoreCase("negro")) {
                precio = 280;
            } 
            else if (chocolate.equalsIgnoreCase("blanco")) {
                precio = 300;
            }
        }

        // Preguntar por snacks
        System.out.println("¿Desea agregar snack? (si/no)");
        snack = sc.next();

        if (snack.equalsIgnoreCase("si")) {
            System.out.println("¿Cuantos snacks desea agregar?");
            cantidadSnack = sc.nextInt();

            precio = precio + (cantidadSnack * 25);
        }

        // Preguntar por nombre
        System.out.println("¿Desea personalizar la tarta con un nombre? (si/no)");
        nombre = sc.next();

        if (nombre.equalsIgnoreCase("si")) {
            precio = precio + 30;
        }

        total = precio;

        System.out.println("El precio total de la tarta es: $" + total);

        sc.close();
    }
}
