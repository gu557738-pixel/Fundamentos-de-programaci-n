Algoritmo CobroConsultorio
	Definir nc Como Entero
	Definir cc, tot Como Real
	
	Escribir "Ingrese el número de la cita actual:"
	Leer nc
	
	Si nc <= 3 Entonces
		cc <- 900
		tot <- nc * 900
	Sino
		Si nc <= 5 Entonces
			cc <- 800
			tot <- (3 * 900) + ((nc - 3) * 800)
		Sino
			Si nc <= 8 Entonces
				cc <- 600
				tot <- (3 * 900) + (2 * 800) + ((nc - 5) * 600)
			Sino
				cc <- 500
				tot <- (3 * 900) + (2 * 800) + (3 * 600) + ((nc - 8) * 500)
			FinSi
		FinSi
	FinSi
	
	Escribir "Monto a pagar por la cita actual: $", cc
	Escribir "Monto total pagado hasta la cita ", nc, ": $", tot
FinAlgoritmo
