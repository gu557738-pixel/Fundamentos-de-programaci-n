import java.util.Scanner;

public class MatrizMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        boolean rellenada = false;
        int opcion;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Suma de cada fila y columna");
            System.out.println("3. Suma de una fila");
            System.out.println("4. Suma de una columna");
            System.out.println("5. Mayor y menor con posición");
            System.out.println("6. Contar números pares");
            System.out.println("7. Contar números impares");
            System.out.println("8. Generar matriz con cuadrados");
            System.out.println("9. Sumar diagonal principal");
            System.out.println("10. Sumar diagonal inversa");
            System.out.println("11. Media de todos los valores");
            System.out.println("12. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            // Excepto rellenar y salir
            if (!rellenada && opcion != 1 && opcion != 12) {
                System.out.println("\nPrimero debes rellenar la matriz.");
                continue;
            }

            switch (opcion) {

                case 1:

                    System.out.println("\n--- RELLENAR MATRIZ ---");

                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 4; j++) {

                            boolean repetido;

                            do {

                                repetido = false;

                                System.out.print("Ingrese el valor para ["
                                        + i + "][" + j + "]: ");

                                int valor = sc.nextInt();

                                // Revisar si ya existe
                                for (int f = 0; f < 4; f++) {

                                    for (int c = 0; c < 4; c++) {

                                        if (matriz[f][c] == valor
                                                && !(f == i && c == j)) {
                                            repetido = true;
                                        }
                                    }
                                }

                                if (repetido) {
                                    System.out.println(
                                            "Ese valor ya existe. Introduzca otro.");
                                } else {
                                    matriz[i][j] = valor;
                                }

                            } while (repetido);
                        }
                    }

                    rellenada = true;

                    System.out.println("\nMatriz rellenada correctamente.");
                    break;

                case 2:

                    System.out.println("\n--- MATRIZ ORIGINAL ---");
                    mostrarMatriz(matriz);

                    System.out.println("\nSuma de cada fila:");

                    for (int i = 0; i < 4; i++) {

                        int suma = 0;

                        for (int j = 0; j < 4; j++) {
                            suma += matriz[i][j];
                        }

                        System.out.println("Fila " + (i + 1) + ": " + suma);
                    }

                    System.out.println("\nSuma de cada columna:");

                    for (int j = 0; j < 4; j++) {

                        int suma = 0;

                        for (int i = 0; i < 4; i++) {
                            suma += matriz[i][j];
                        }

                        System.out.println("Columna " + (j + 1) + ": " + suma);
                    }

                    break;

                case 3:

                    mostrarMatriz(matriz);

                    int fila;

                    do {
                        System.out.print("\nIngrese la fila (1-4): ");
                        fila = sc.nextInt();
                    } while (fila < 1 || fila > 4);

                    int sumaFila = 0;

                    for (int j = 0; j < 4; j++) {
                        sumaFila += matriz[fila - 1][j];
                    }

                    System.out.println("Suma de la fila " + fila
                            + ": " + sumaFila);

                    break;

                case 4:

                    mostrarMatriz(matriz);

                    int columna;

                    do {
                        System.out.print("\nIngrese la columna (1-4): ");
                        columna = sc.nextInt();
                    } while (columna < 1 || columna > 4);

                    int sumaColumna = 0;

                    for (int i = 0; i < 4; i++) {
                        sumaColumna += matriz[i][columna - 1];
                    }

                    System.out.println("Suma de la columna " + columna
                            + ": " + sumaColumna);

                    break;

                case 5:

                    mostrarMatriz(matriz);

                    int mayor = matriz[0][0];
                    int menor = matriz[0][0];

                    int filaMayor = 0;
                    int columnaMayor = 0;

                    int filaMenor = 0;
                    int columnaMenor = 0;

                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 4; j++) {

                            if (matriz[i][j] > mayor) {
                                mayor = matriz[i][j];
                                filaMayor = i;
                                columnaMayor = j;
                            }

                            if (matriz[i][j] < menor) {
                                menor = matriz[i][j];
                                filaMenor = i;
                                columnaMenor = j;
                            }
                        }
                    }

                    System.out.println("\nMayor: " + mayor);
                    System.out.println("Posición: ["
                            + filaMayor + "][" + columnaMayor + "]");

                    System.out.println("\nMenor: " + menor);
                    System.out.println("Posición: ["
                            + filaMenor + "][" + columnaMenor + "]");

                    break;

                case 6:

                    mostrarMatriz(matriz);

                    int pares = 0;

                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 4; j++) {

                            if (matriz[i][j] % 2 == 0) {
                                pares++;
                            }
                        }
                    }

                    System.out.println("\nCantidad de números pares: " + pares);

                    break;

                case 7:

                    mostrarMatriz(matriz);

                    int impares = 0;

                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 4; j++) {

                            if (matriz[i][j] % 2 != 0) {
                                impares++;
                            }
                        }
                    }

                    System.out.println("\nCantidad de números impares: "
                            + impares);

                    break;

                case 8:

                    mostrarMatriz(matriz);

                    int[][] cuadrados = new int[4][4];

                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 4; j++) {

                            cuadrados[i][j] =
                                    matriz[i][j] * matriz[i][j];
                        }
                    }

                    System.out.println("\nMatriz con los cuadrados:");

                    mostrarMatriz(cuadrados);

                    break;

                case 9:

                    mostrarMatriz(matriz);

                    int diagonalPrincipal = 0;

                    for (int i = 0; i < 4; i++) {
                        diagonalPrincipal += matriz[i][i];
                    }

                    System.out.println("\nSuma de la diagonal principal: "
                            + diagonalPrincipal);

                    break;

                case 10:

                    mostrarMatriz(matriz);

                    int diagonalInversa = 0;

                    for (int i = 0; i < 4; i++) {
                        diagonalInversa += matriz[i][3 - i];
                    }

                    System.out.println("\nSuma de la diagonal inversa: "
                            + diagonalInversa);

                    break;

                case 11:

                    mostrarMatriz(matriz);

                    int sumaTotal = 0;

                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 4; j++) {
                            sumaTotal += matriz[i][j];
                        }
                    }

                    double media = (double) sumaTotal / 16;

                    System.out.println("\nMedia de todos los valores: "
                            + media);

                    break;

                case 12:

                    System.out.println("\nPrograma terminado.");

                    break;

                default:

                    System.out.println("\nOpción no válida.");
            }

        } while (opcion != 12);

        sc.close();
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {

        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }
} 
