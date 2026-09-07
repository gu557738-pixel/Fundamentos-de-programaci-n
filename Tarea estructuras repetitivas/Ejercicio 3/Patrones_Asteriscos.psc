Algoritmo Patrones_Asteriscos
	
    Definir n, i, j Como Entero
	
    Escribir "Ingrese el numero de lineas: "
    Leer n
	
    Escribir ""
    Escribir "FIGURA 1"
	
    Para i <- 1 Hasta n Hacer
		
        Para j <- 1 Hasta n Hacer
            Escribir Sin Saltar "* "
        FinPara
		
        Escribir ""
		
    FinPara
	
	
    Escribir ""
    Escribir "FIGURA 2"
	
    Para i <- n Hasta 1 Con Paso -1 Hacer
		
        Para j <- 1 Hasta (2 * i - 1) Hacer
            Escribir Sin Saltar "*"
        FinPara
		
        Escribir ""
		
    FinPara
	
	
    Escribir ""
    Escribir "FIGURA 3"
	
    Para i <- 1 Hasta n Hacer
		
        Para j <- 1 Hasta (2 * i - 1) Hacer
            Escribir Sin Saltar "*"
        FinPara
		
        Escribir ""
		
    FinPara
	
FinAlgoritmo