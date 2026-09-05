import java.util.Scanner;
public class Horoscopo {
    public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ingrese la fecha de su cumpleaños, dia y mes en numeros");
    int dia=sc.nextInt();
    int mes=sc.nextInt();
    if (mes==12 && dia>=22 || mes==1 && dia<=19){
        System.out.println("Su signo es Capricornio");
    }else if (mes==1 && dia>=20 || mes==2 && dia<=18){
                System.out.println("Su signo es Acuario");
            } else if (mes==2 && dia>=19 || mes==3 && dia<=20){
                System.out.println("Su signo es Piscis");
            } else if (mes==3 && dia>=21 || mes==4 && dia<=19){
                System.out.println("Su signo es Aries");
            } else if (mes==4 && dia>=20 || mes==5 && dia<=20){
                System.out.println("Su signo es Tauro");
            } else if (mes==5 && dia>=21 || mes==6 && dia<=20){
                System.out.println("Su signo es Geminis");
            } else if (mes==6 && dia>=21 || mes==7 && dia<=22){
                System.out.println("Su signo es Cancer");
            } else if (mes==7 && dia>=23 || mes==8 && dia<=22){
                System.out.println("Su signo es Leo");
            } else if (mes==8 && dia>=23 || mes==9 && dia<=22){
                System.out.println("Su signo es Virgo");
            } else if (mes==9 && dia>=23 || mes==10 && dia<=22){
                System.out.println("Su signo es Libra");
            } else if (mes==10 && dia>=23 || mes==11 && dia<=21){
                System.out.println("Su signo es Escorpio");
            } else if (mes==11 && dia>=22 || mes==12 && dia<=21){
                System.out.println("Su signo es Sagitario");
            }
            
            }
                }