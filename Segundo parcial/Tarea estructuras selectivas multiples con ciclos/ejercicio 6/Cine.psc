Algoritmo Cine
	
    Definir personas, dia, parejas, individual Como Entero
    Definir total Como Real
    Definir membresia Como Caracter
	
    Escribir "Ingrese el numero de personas:"
    Leer personas
	
    Escribir "Ingrese el dia de la semana:"
    Escribir "1. Lunes"
    Escribir "2. Martes"
    Escribir "3. Miercoles"
    Escribir "4. Jueves"
    Escribir "5. Viernes"
    Escribir "6. Sabado"
    Escribir "7. Domingo"
    Leer dia
	
    Escribir "¿Cuenta con membresia? (si/no)"
    Leer membresia
	
    Si dia = 3 Entonces
        total <- personas * 30
    Sino
        Si dia = 4 Entonces
            parejas <- Trunc(personas / 2)
            individual <- personas MOD 2
			
            total <- (parejas * 75) + (individual * 50)
        Sino
            total <- personas * 50
        FinSi
    FinSi
	
    Si membresia = "si" Entonces
        total <- total * 0.90
    FinSi
	
    Escribir "El precio total es: $", total
	
FinAlgoritmo
