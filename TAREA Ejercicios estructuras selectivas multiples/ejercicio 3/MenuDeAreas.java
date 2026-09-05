import java.util.Scanner;
public class MenuDeAreas {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la opcion deseada:");
        System.out.println("1. Calcular area de un cuadrado");
        System.out.println("2. Calcular area de un rectangulo");
        System.out.println("3. Calcular area de un triangulo");
        int opcion= sc.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado:");
                double lado= sc.nextDouble();
                System.out.println("El area del cuadrado es: " + (lado*lado));
                break;
            case 2:
                System.out.println("Ingrese la base del rectangulo:");
                double base= sc.nextDouble();
                System.out.println("Ingrese la altura del rectangulo:");
                double altura= sc.nextDouble();
                System.out.println("El area del rectangulo es: " + (base*altura));
                break;
            case 3:
                System.out.println("Ingrese la base del triangulo:");
                double baseTriangulo= sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo:");
                double alturaTriangulo= sc.nextDouble();
                System.out.println("El area del triangulo es: " + (0.5*baseTriangulo*alturaTriangulo));
                break;
            default:
                System.out.println("Error de captura");
                break;
        }
    }
}
