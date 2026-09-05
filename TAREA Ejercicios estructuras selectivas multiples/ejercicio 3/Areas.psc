Algoritmo Areas
	
    Definir opcion Como Entero
    Definir lado, base, altura, largo, ancho, radio, area Como Real
	
    Escribir "----- MENU DE AREAS -----"
    Escribir "1. Cuadrado"
    Escribir "2. Rectangulo"
    Escribir "3. Triangulo"
    Escribir "4. Circulo"
    Escribir "Seleccione una opcion:"
    Leer opcion
	
    Segun opcion Hacer
		
        1:
            Escribir "Ingrese el lado del cuadrado:"
            Leer lado
			
            area <- lado * lado
			
            Escribir "El area del cuadrado es: ", area
			
        2:
            Escribir "Ingrese el largo del rectangulo:"
            Leer largo
			
            Escribir "Ingrese el ancho del rectangulo:"
            Leer ancho
			
            area <- largo * ancho
			
            Escribir "El area del rectangulo es: ", area
			
        3:
            Escribir "Ingrese la base del triangulo:"
            Leer base
			
            Escribir "Ingrese la altura del triangulo:"
            Leer altura
			
            area <- (base * altura) / 2
			
            Escribir "El area del triangulo es: ", area
			
        4:
            Escribir "Ingrese el radio del circulo:"
            Leer radio
			
            area <- PI * radio * radio
			
            Escribir "El area del circulo es: ", area
			
        De Otro Modo:
            Escribir "Opcion no valida"
			
    FinSegun
	
FinAlgoritmo