Algoritmo CobroPaqueteria
	Definir zona Como Entero
	Definir pesoKg, pesoG, costoGramo, cobro Como Real
	
	Escribir "Ingrese el peso del paquete en Kilogramos (kg):"
	Leer pesoKg
	
	// Validación de peso máximo (5 kg)
	Si pesoKg > 5 O pesoKg <= 0 Entonces
		Escribir "EL PAQUETE HA SIDO RECHAZADO: No se transportan paquetes mayores a 5 kg o de peso invalido."
	Sino
		Escribir "Seleccione la zona de destino:"
		Escribir "1. América del Norte"
		Escribir "2. América Central"
		Escribir "3. América del Sur"
		Escribir "4. Europa"
		Escribir "5. Asia"
		Leer zona
		
		// Convertir peso a gramos
		pesoG <- pesoKg * 1000
		
		Segun zona Hacer
			1:
				costoGramo <- 11
			2:
				costoGramo <- 10
			3:
				costoGramo <- 12
			4:
				costoGramo <- 25
			5:
				costoGramo <- 30
			De Otro Modo:
				costoGramo <- 0
				Escribir "Zona no válida."
		FinSegun
		
		Si costoGramo > 0 Entonces
			cobro <- pesoG * costoGramo
			Escribir "El cobro total por la entrega es: $", cobro
		FinSi
	FinSi
FinAlgoritmo