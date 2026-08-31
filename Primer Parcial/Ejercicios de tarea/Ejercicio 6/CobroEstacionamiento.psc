Algoritmo CobroEstacionamiento
	Definir horas Como Entero
	Definir totalPagar Como Real
	
	Escribir "Ingrese la cantidad de horas estacionado:"
	Leer horas
	
	Si horas <= 0 Entonces
		Escribir "Error: La cantidad de horas debe ser mayor a 0."
	Sino
		Si horas <= 2 Entonces
			totalPagar <- horas * 30.00
		Sino
			Si horas <= 5 Entonces
				totalPagar <- (2 * 30.00) + ((horas - 2) * 25.00)
			Sino
				Si horas <= 10 Entonces
					totalPagar <- (2 * 30.00) + (3 * 25.00) + ((horas - 5) * 20.00)
				Sino
					totalPagar <- 380.00
				FinSi
			FinSi
		FinSi
		Escribir "El total a pagar es: $", totalPagar
	FinSi
FinAlgoritmo