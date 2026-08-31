Algoritmo AhorroAnual
	Definir mes Como Entero
	Definir ahorroMes, ahorroTotal Como Real
	
	ahorroTotal <- 0
	
	Para mes <- 1 Hasta 12 Con Paso 1 Hacer
		Escribir "Ingrese la cantidad ahorrada en el mes ", mes, ":"
		Leer ahorroMes
		
		ahorroTotal <- ahorroTotal + ahorroMes
	FinPara
	
	Escribir "El total de ahorro acumulado en el año es: $", ahorroTotal
FinAlgoritmo
