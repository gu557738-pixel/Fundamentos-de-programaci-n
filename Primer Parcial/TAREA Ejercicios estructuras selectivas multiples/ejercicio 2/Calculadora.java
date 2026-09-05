import java.util.Scanner;
public class Calculadora {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double num1= sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2= sc.nextDouble();
        System.out.println("Ingrese la operacion (+, -, *, /):");
        char operacion= sc.next().charAt(0);
        double resultado= 0;
        switch(operacion) {
            case '+':
                resultado= num1+num2;
                break;
            case '-':
                resultado= num1-num2;
                break;
            case '*':
                resultado= num1*num2;
                break;
            case '/':
                resultado= num1/num2;
                break;
            default:
                System.out.println("Error de captura");
                break;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
