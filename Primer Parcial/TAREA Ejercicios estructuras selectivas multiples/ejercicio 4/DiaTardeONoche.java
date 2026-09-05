import java.util.Scanner;
public class DiaTardeONoche {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese la hora(sin contar los minutos):");
    int hora= sc.nextInt();
    
    if (hora >= 6 && hora <= 12) {
    System.out.println("Buenos dias");

} else if (hora >= 13 && hora <= 20) {
    System.out.println("Buenas tardes");

} else {
    System.out.println("Buenas noches");
}
    }
}