Algoritmo Calculadora
	
    Definir num1, num2, resultado Como Real
    Definir operacion Como Caracter
	
    Escribir "Ingrese el primer numero:"
    Leer num1
	
    Escribir "Ingrese el segundo numero:"
    Leer num2
	
    Escribir "Ingrese la operacion (+, -, *, /):"
    Leer operacion
	
    Segun operacion Hacer
		
        "+":
            resultado <- num1 + num2
            Escribir "Resultado: ", resultado
			
        "-":
            resultado <- num1 - num2
            Escribir "Resultado: ", resultado
			
        "*":
            resultado <- num1 * num2
            Escribir "Resultado: ", resultado
			
        "/":
            Si num2 = 0 Entonces
                Escribir "Error: division por cero"
            Sino
                resultado <- num1 / num2
                Escribir "Resultado: ", resultado
            FinSi
			
        De Otro Modo:
            Escribir "Error: operacion no valida"
			
    FinSegun
	
FinAlgoritmo