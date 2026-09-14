Algoritmo CotizacionSeguro
	
    Definir valorVehiculo Como Real
    Definir tarifaBase Como Real
    Definir recargoEdad Como Real
    Definir recargoAccidentes Como Real
    Definir subtotal Como Real
    Definir descuento Como Real
    Definir costoFinal Como Real
	
    Definir edad Como Entero
    Definir accidentes Como Entero
    Definir tieneSeguridad Como Logico
	
    Escribir "======================================"
    Escribir "       COTIZACION DE SEGURO"
    Escribir "======================================"
	
    Repetir
        Escribir "Ingrese el valor del automovil:"
        Leer valorVehiculo
    Hasta Que valorVehiculo > 0
	
    Repetir
        Escribir "Ingrese la edad del conductor:"
        Leer edad
    Hasta Que edad >= 18 Y edad <= 100
	
    Repetir
        Escribir "Ingrese el numero de accidentes:"
        Leer accidentes
    Hasta Que accidentes >= 0
	
    Escribir "¿Cuenta con sistema de seguridad adicional?"
    Escribir "Escriba Verdadero para SI o Falso para NO:"
    Leer tieneSeguridad
	
    tarifaBase <- calcularTarifaBase(valorVehiculo)
    recargoEdad <- calcularRecargoPorEdad(tarifaBase, edad)
    recargoAccidentes <- calcularRecargoPorAccidentes(tarifaBase, accidentes)
	
    subtotal <- tarifaBase + recargoEdad + recargoAccidentes
	
    descuento <- calcularDescuentoSeguridad(subtotal, tieneSeguridad)
	
    costoFinal <- calcularCostoFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento)
	
    Escribir ""
    Escribir "======================================"
    Escribir "             RESULTADOS"
    Escribir "======================================"
	
    Escribir "Tarifa base: $", tarifaBase
    Escribir "Recargo por edad: $", recargoEdad
    Escribir "Recargo por accidentes: $", recargoAccidentes
    Escribir "Subtotal: $", subtotal
    Escribir "Descuento por seguridad: $", descuento
    Escribir "Costo final anual: $", costoFinal
	
FinAlgoritmo


Funcion tarifa <- calcularTarifaBase(valorVehiculo)
    tarifa <- valorVehiculo * 0.04
FinFuncion


Funcion recargo <- calcularRecargoPorEdad(tarifaBase, edad)
    Si edad < 25 Entonces
        recargo <- tarifaBase * 0.20
    SiNo
        Si edad > 60 Entonces
            recargo <- tarifaBase * 0.10
        SiNo
            recargo <- 0
        FinSi
    FinSi
FinFuncion


Funcion recargo <- calcularRecargoPorAccidentes(tarifaBase, accidentes)
    recargo <- tarifaBase * 0.08 * accidentes
FinFuncion


Funcion descuento <- calcularDescuentoSeguridad(subtotal, tieneSeguridad)
    Si tieneSeguridad Entonces
        descuento <- subtotal * 0.05
    SiNo
        descuento <- 0
    FinSi
FinFuncion


Funcion costo <- calcularCostoFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento)
    costo <- tarifaBase + recargoEdad + recargoAccidentes - descuento
FinFuncion