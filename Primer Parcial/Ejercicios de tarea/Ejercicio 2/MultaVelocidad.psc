Algoritmo MultaVelocidad
    Definir velocidad, limite1, limite2, resultado Como Entero
    Definir cumpleanos Como Logico
	
    Escribir "Ingrese la velocidad:"
    Leer velocidad
	
    Escribir "¿Es tu cumpleaños? (Verdadero/Falso):"
    Leer cumpleanos
	
    Si cumpleanos Entonces
        limite1 <- 65
        limite2 <- 85
    SiNo
        limite1 <- 60
        limite2 <- 80
    FinSi
	
    Si velocidad <= limite1 Entonces
        resultado <- 0
    SiNo
        Si velocidad <= limite2 Entonces
            resultado <- 1
        SiNo
            resultado <- 2
        FinSi
    FinSi
	
    Escribir "Resultado: ", resultado
FinAlgoritmo
