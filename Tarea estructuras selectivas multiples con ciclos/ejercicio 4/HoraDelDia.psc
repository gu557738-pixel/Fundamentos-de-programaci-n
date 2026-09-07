Algoritmo HoraDelDia
	
    Definir hora Como Entero
	
    Escribir "Ingrese la hora (0-23):"
    Leer hora
	
    Si hora >= 6 Y hora <= 12 Entonces
        Escribir "Buenos dias"
    Sino
        Si hora >= 13 Y hora <= 20 Entonces
            Escribir "Buenas tardes"
        Sino
            Si (hora >= 21 Y hora <= 23) O (hora >= 0 Y hora <= 5) Entonces
                Escribir "Buenas noches"
            Sino
                Escribir "Hora no valida"
            FinSi
        FinSi
    FinSi
	
FinAlgoritmo
