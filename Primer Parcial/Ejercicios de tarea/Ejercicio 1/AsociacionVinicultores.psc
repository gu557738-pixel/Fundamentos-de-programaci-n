Algoritmo AsociacionVinicultores
    Definir kilos, tamano Como Entero
    Definir tipo Como Caracter
    Definir precioInicial, precioFinal, ganancia Como Real
	
    Escribir "Ingrese los kilos de uva:"
    Leer kilos
	
    Escribir "Ingrese el precio inicial por kilo:"
    Leer precioInicial
	
    Escribir "Ingrese el tipo de uva (A o B):"
    Leer tipo
	
    Escribir "Ingrese el tamaño de la uva (1 o 2):"
    Leer tamano
	
    Si tipo = "A" O tipo = "a" Entonces
        Si tamano = 1 Entonces
            precioFinal <- precioInicial + 0.20
        SiNo
            precioFinal <- precioInicial + 0.30
        FinSi
    SiNo
        Si tipo = "B" O tipo = "b" Entonces
            Si tamano = 1 Entonces
                precioFinal <- precioInicial - 0.30
            SiNo
                precioFinal <- precioInicial - 0.50
            FinSi
        FinSi
    FinSi
	
    ganancia <- precioFinal * kilos
	
    Escribir "Precio final por kilo: $", precioFinal
    Escribir "Ganancia total: $", ganancia
FinAlgoritmo