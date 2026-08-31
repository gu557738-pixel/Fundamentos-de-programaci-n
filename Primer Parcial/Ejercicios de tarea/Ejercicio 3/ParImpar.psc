Algoritmo ParImpar
    Definir numero Como Entero
	
    Escribir "Ingrese un numero:"
    Leer numero
	
    Si numero = 0 Entonces
        Escribir "El numero es neutro."
    SiNo
        Si numero MOD 2 = 0 Entonces
            Escribir "El numero es par."
        SiNo
            Escribir "El numero es impar."
        FinSi
    FinSi
FinAlgoritmo
