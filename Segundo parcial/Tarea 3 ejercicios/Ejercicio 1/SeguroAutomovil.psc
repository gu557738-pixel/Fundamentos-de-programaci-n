Algoritmo SeguroAutomovil
	
    Definir valorVehiculo, tarifaBase, recargoEdad Como Real
    Definir recargoAccidentes, subtotal, descuento, costoFinal Como Real
    Definir edad, accidentes Como Entero
    Definir tieneSeguridad Como Logico
	
    Escribir "Ingrese el valor del vehiculo:"
    Leer valorVehiculo
	
    Mientras valorVehiculo <= 0 Hacer
        Escribir "El valor debe ser mayor que cero."
        Escribir "Ingrese nuevamente el valor:"
        Leer valorVehiculo
    FinMientras
	
    Escribir "Ingrese la edad del conductor:"
    Leer edad
	
    Mientras edad < 18 O edad > 100 Hacer
        Escribir "La edad debe estar entre 18 y 100 años."
        Leer edad
    FinMientras
	
    Escribir "Ingrese la cantidad de accidentes:"
    Leer accidentes
	
    Mientras accidentes < 0 Hacer
        Escribir "Los accidentes no pueden ser negativos."
        Leer accidentes
    FinMientras
	
    Escribir "¿Cuenta con sistema de seguridad adicional? (Verdadero/Falso):"
    Leer tieneSeguridad
	
    tarifaBase <- CalcularTarifaBase(valorVehiculo)
    recargoEdad <- CalcularRecargoEdad(tarifaBase, edad)
    recargoAccidentes <- CalcularRecargoAccidentes(tarifaBase, accidentes)
	
    subtotal <- tarifaBase + recargoEdad + recargoAccidentes
	
    descuento <- CalcularDescuento(subtotal, tieneSeguridad)
	
    costoFinal <- CalcularCostoFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento)
	
    Escribir "----- COTIZACION DEL SEGURO -----"
    Escribir "Tarifa base: $", tarifaBase
    Escribir "Recargo por edad: $", recargoEdad
    Escribir "Recargo por accidentes: $", recargoAccidentes
    Escribir "Descuento por seguridad: $", descuento
    Escribir "Costo final: $", costoFinal
	
FinAlgoritmo


Funcion resultado <- CalcularTarifaBase(valorVehiculo)
    Definir resultado Como Real
    resultado <- valorVehiculo * 0.04
FinFuncion


Funcion resultado <- CalcularRecargoEdad(tarifaBase, edad)
    Definir resultado Como Real
	
    Si edad < 25 Entonces
        resultado <- tarifaBase * 0.20
    Sino
        Si edad > 60 Entonces
            resultado <- tarifaBase * 0.10
        Sino
            resultado <- 0
        FinSi
    FinSi
FinFuncion


Funcion resultado <- CalcularRecargoAccidentes(tarifaBase, accidentes)
    Definir resultado Como Real
    resultado <- tarifaBase * 0.08 * accidentes
FinFuncion


Funcion resultado <- CalcularDescuento(subtotal, tieneSeguridad)
    Definir resultado Como Real
	
    Si tieneSeguridad Entonces
        resultado <- subtotal * 0.05
    Sino
        resultado <- 0
    FinSi
FinFuncion


Funcion resultado <- CalcularCostoFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento)
    Definir resultado Como Real
    resultado <- tarifaBase + recargoEdad + recargoAccidentes - descuento
FinFuncion