Algoritmo Tablas_Multiplicar
	
    Definir n, i Como Entero
	
    Escribir "Ingrese un numero (0 para terminar): "
    Leer n
	
    Mientras n <> 0 Hacer
		
        Para i <- 1 Hasta 10 Hacer
            Escribir n, " x ", i, " = ", n * i
        FinPara
		
        Escribir ""
        Escribir "Ingrese otro numero (0 para terminar): "
        Leer n
		
    FinMientras
	
    Escribir "Programa terminado."
	
FinAlgoritmo
