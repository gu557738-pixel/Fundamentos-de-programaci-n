Algoritmo ConsumoElectrico
	
    Definir lecturaAnterior, lecturaActual Como Real
    Definir consumo, costoConsumo Como Real
    Definir cargoFijo, costoAntesImpuesto Como Real
    Definir descuento, baseImponible, impuesto, total Como Real
    Definir tieneApoyo Como Logico
	
    Escribir "Ingrese la lectura anterior:"
    Leer lecturaAnterior
	
    Mientras lecturaAnterior < 0 Hacer
        Escribir "La lectura no puede ser negativa."
        Leer lecturaAnterior
    FinMientras
	
    Escribir "Ingrese la lectura actual:"
    Leer lecturaActual
	
    Mientras lecturaActual < lecturaAnterior Hacer
        Escribir "La lectura actual debe ser mayor o igual a la anterior."
        Leer lecturaActual
    FinMientras
	
    consumo <- CalcularConsumo(lecturaAnterior, lecturaActual)
	
    Mientras consumo > 10000 Hacer
        Escribir "El consumo maximo permitido es de 10,000 kWh."
        Escribir "Ingrese nuevamente la lectura actual:"
        Leer lecturaActual
		
        Mientras lecturaActual < lecturaAnterior Hacer
            Escribir "La lectura actual debe ser mayor o igual a la anterior."
            Leer lecturaActual
        FinMientras
		
        consumo <- CalcularConsumo(lecturaAnterior, lecturaActual)
    FinMientras
	
    Escribir "¿La vivienda pertenece al programa de apoyo?"
    Escribir "Escriba Verdadero o Falso:"
    Leer tieneApoyo
	
    costoConsumo <- CalcularCostoConsumo(consumo)
	
    cargoFijo <- 95
	
    costoAntesImpuesto <- costoConsumo + cargoFijo
	
    descuento <- CalcularDescuentoApoyo(consumo, costoAntesImpuesto, tieneApoyo)
	
    baseImponible <- costoAntesImpuesto - descuento
	
    impuesto <- CalcularImpuesto(baseImponible)
	
    total <- CalcularTotal(costoConsumo, cargoFijo, descuento, impuesto)
	
    MostrarRecibo(consumo, costoConsumo, descuento, impuesto, total)
	
FinAlgoritmo


Funcion resultado <- CalcularConsumo(lecturaAnterior, lecturaActual)
	
    Definir resultado Como Real
	
    resultado <- lecturaActual - lecturaAnterior
	
FinFuncion


Funcion resultado <- CalcularCostoConsumo(consumo)
	
    Definir resultado Como Real
	
    Si consumo <= 150 Entonces
		
        resultado <- consumo * 1.20
		
    Sino
		
        Si consumo <= 400 Entonces
			
            resultado <- (150 * 1.20) + ((consumo - 150) * 1.80)
			
        Sino
			
            resultado <- (150 * 1.20) + (250 * 1.80) + ((consumo - 400) * 2.75)
			
        FinSi
		
    FinSi
	
FinFuncion


Funcion resultado <- CalcularDescuentoApoyo(consumo, costoAntesImpuesto, tieneApoyo)
	
    Definir resultado Como Real
	
    Si tieneApoyo Y consumo <= 250 Entonces
		
        resultado <- costoAntesImpuesto * 0.30
		
    Sino
		
        resultado <- 0
		
    FinSi
	
FinFuncion


Funcion resultado <- CalcularImpuesto(baseImponible)
	
    Definir resultado Como Real
	
    resultado <- baseImponible * 0.16
	
FinFuncion


Funcion resultado <- CalcularTotal(costoConsumo, cargoFijo, descuento, impuesto)
	
    Definir resultado Como Real
	
    resultado <- costoConsumo + cargoFijo - descuento + impuesto
	
FinFuncion


SubProceso MostrarRecibo(consumo, costoConsumo, descuento, impuesto, total)
	
    Escribir "----- RECIBO DE ELECTRICIDAD -----"
    Escribir "Consumo: ", consumo, " kWh"
    Escribir "Costo del consumo: $", costoConsumo
    Escribir "Cargo fijo: $95"
    Escribir "Descuento: $", descuento
    Escribir "Impuesto: $", impuesto
    Escribir "Total a pagar: $", total
	
FinSubProceso