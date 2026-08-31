Algoritmo CostoBanquete
	Definir cantidad Como Entero
	Definir precioPorPlatillo, total Como Real
	
	Escribir "Ingrese la cantidad de platillos: "
	Leer cantidad
	
	Si cantidad <= 200 Entonces
		precioPorPlatillo <- 95.0
	Sino
		Si cantidad <= 300 Entonces
			precioPorPlatillo <- 85.0
		Sino
			precioPorPlatillo <- 75.0
		FinSi
	FinSi
	
	total <- cantidad * precioPorPlatillo
	
	Escribir "El costo total del banquete es: $", total
FinAlgoritmo
