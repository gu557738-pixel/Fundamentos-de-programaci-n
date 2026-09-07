Algoritmo Pasteleria
	
    Definir sabor, chocolate, snack, nombre Como Caracter
    Definir cantidadSnack Como Entero
    Definir precio Como Real
	
    precio <- 0
	
    Escribir "¿De que sabor quiere la tarta?"
    Escribir "1. Manzana"
    Escribir "2. Fresa"
    Escribir "3. Chocolate"
    Leer sabor
	
    Si sabor = "manzana" Entonces
        precio <- 200
    Sino
        Si sabor = "fresa" Entonces
            precio <- 250
        Sino
            Si sabor = "chocolate" Entonces
				
                Escribir "¿Que tipo de chocolate quiere?"
                Escribir "1. Negro"
                Escribir "2. Blanco"
                Leer chocolate
				
                Si chocolate = "negro" Entonces
                    precio <- 280
                Sino
                    Si chocolate = "blanco" Entonces
                        precio <- 300
                    FinSi
                FinSi
				
            FinSi
        FinSi
    FinSi
	
    Escribir "¿Desea agregar snack? (si/no)"
    Leer snack
	
    Si snack = "si" Entonces
        Escribir "¿Cuantos snacks desea agregar?"
        Leer cantidadSnack
		
        precio <- precio + (cantidadSnack * 25)
    FinSi
	
    Escribir "¿Desea personalizar la tarta con un nombre? (si/no)"
    Leer nombre
	
    Si nombre = "si" Entonces
        precio <- precio + 30
    FinSi
	
    Escribir "El precio total de la tarta es: $", precio
	
FinAlgoritmo
