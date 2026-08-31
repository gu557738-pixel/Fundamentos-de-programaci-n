Algoritmo AsignacionBecas
	Definir edad Como Entero
	Definir promedio Como Real
	
	Escribir "Ingrese la edad del estudiante:"
	Leer edad
	Escribir "Ingrese el promedio del estudiante (0 a 10):"
	Leer promedio
	
	Si edad < 0 O promedio < 0 O promedio > 10 Entonces
		Escribir "Error: Datos ingresados no válidos."
	Sino
		Si edad > 18 Entonces
			// Alumnos mayores de 18 años
			Si promedio >= 9.0 Entonces
				Escribir "Se le asigna una beca mensual de: $10,000.00"
			Sino
				Si promedio >= 7.5 Entonces
					Escribir "Se le asigna una beca mensual de: $8,000.00"
				Sino
					Si promedio >= 6.0 Entonces
						Escribir "Se le asigna una beca mensual de: $5,000.00"
					Sino
						Escribir "Se le enviará una carta de invitación para estudiar más en el próximo ciclo escolar."
					FinSi
				FinSi
			FinSi
		Sino
			// Alumnos de 18 años o menores
			Si promedio >= 9.0 Entonces
				Escribir "Se le asigna una beca mensual de: $8,000.00"
			Sino
				Si promedio >= 8.0 Entonces
					Escribir "Se le asigna una beca mensual de: $6,000.00"
				Sino
					Si promedio >= 6.0 Entonces
						Escribir "Se le asigna una beca mensual de: $4,000.00"
					Sino
						Escribir "Se le enviará una carta de invitación para estudiar más en el próximo ciclo escolar."
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo