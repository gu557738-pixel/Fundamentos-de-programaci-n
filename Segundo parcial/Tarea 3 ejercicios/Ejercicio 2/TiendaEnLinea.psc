Algoritmo TiendaEnLinea
	
    Definir precio1, precio2, precio3 Como Real
    Definir subtotal1, subtotal2, subtotal3, subtotal Como Real
    Definir descuento, subtotalDescuento, envio, impuesto, total Como Real
    Definir cantidad1, cantidad2, cantidad3, tipoCliente Como Entero
    Definir codigoPostal Como Caracter
	
    Escribir "Precio del producto 1:"
    Leer precio1
	
    Mientras precio1 <= 0 Hacer
        Escribir "El precio debe ser mayor que cero."
        Leer precio1
    FinMientras
	
    Escribir "Cantidad del producto 1:"
    Leer cantidad1
	
    Mientras cantidad1 <= 0 Hacer
        Escribir "La cantidad debe ser mayor que cero."
        Leer cantidad1
    FinMientras
	
    Escribir "Precio del producto 2:"
    Leer precio2
	
    Mientras precio2 <= 0 Hacer
        Escribir "El precio debe ser mayor que cero."
        Leer precio2
    FinMientras
	
    Escribir "Cantidad del producto 2:"
    Leer cantidad2
	
    Mientras cantidad2 <= 0 Hacer
        Escribir "La cantidad debe ser mayor que cero."
        Leer cantidad2
    FinMientras
	
    Escribir "Precio del producto 3:"
    Leer precio3
	
    Mientras precio3 <= 0 Hacer
        Escribir "El precio debe ser mayor que cero."
        Leer precio3
    FinMientras
	
    Escribir "Cantidad del producto 3:"
    Leer cantidad3
	
    Mientras cantidad3 <= 0 Hacer
        Escribir "La cantidad debe ser mayor que cero."
        Leer cantidad3
    FinMientras
	
    Escribir "Tipo de cliente:"
    Escribir "1. Regular"
    Escribir "2. Frecuente"
    Leer tipoCliente
	
    Mientras tipoCliente <> 1 Y tipoCliente <> 2 Hacer
        Escribir "Tipo de cliente invalido."
        Leer tipoCliente
    FinMientras
	
    Escribir "Ingrese el codigo postal de 5 digitos:"
	Leer codigoPostal
	
	Mientras Longitud(codigoPostal) <> 5 Hacer
		Escribir "El codigo postal debe contener exactamente 5 digitos."
		Leer codigoPostal
	FinMientras
	
    subtotal1 <- CalcularSubtotalProducto(precio1, cantidad1)
    subtotal2 <- CalcularSubtotalProducto(precio2, cantidad2)
    subtotal3 <- CalcularSubtotalProducto(precio3, cantidad3)
	
    subtotal <- CalcularSubtotalGeneral(subtotal1, subtotal2, subtotal3)
	
    descuento <- CalcularDescuento(subtotal, tipoCliente)
	
    subtotalDescuento <- subtotal - descuento
	
    envio <- CalcularEnvio(subtotal, codigoPostal)
	
    impuesto <- CalcularImpuesto(subtotalDescuento)
	
    total <- CalcularTotal(subtotal, descuento, impuesto, envio)
	
    Escribir "----- TIENDA EN LINEA -----"
    Escribir "Subtotal producto 1: $", subtotal1
    Escribir "Subtotal producto 2: $", subtotal2
    Escribir "Subtotal producto 3: $", subtotal3
    Escribir "Subtotal general: $", subtotal
    Escribir "Descuento: $", descuento
    Escribir "Envio: $", envio
    Escribir "Impuesto: $", impuesto
    Escribir "Total a pagar: $", total
	
FinAlgoritmo


Funcion resultado <- CalcularSubtotalProducto(precio, cantidad)
    Definir resultado Como Real
    resultado <- precio * cantidad
FinFuncion


Funcion resultado <- CalcularSubtotalGeneral(subtotal1, subtotal2, subtotal3)
    Definir resultado Como Real
    resultado <- subtotal1 + subtotal2 + subtotal3
FinFuncion


Funcion resultado <- CalcularDescuento(subtotal, tipoCliente)
    Definir resultado Como Real
	
    Si tipoCliente = 2 Entonces
        resultado <- subtotal * 0.10
    Sino
        resultado <- 0
    FinSi
FinFuncion


Funcion resultado <- CalcularEnvio(subtotal, codigoPostal)
    Definir resultado Como Real
	
    Si subtotal < 1000 Entonces
        resultado <- 150
    Sino
        Si subtotal < 3000 Entonces
            resultado <- 80
        Sino
            resultado <- 0
        FinSi
    FinSi
FinFuncion


Funcion resultado <- CalcularImpuesto(subtotalConDescuento)
    Definir resultado Como Real
    resultado <- subtotalConDescuento * 0.16
FinFuncion


Funcion resultado <- CalcularTotal(subtotal, descuento, impuesto, envio)
    Definir resultado Como Real
    resultado <- subtotal - descuento + impuesto + envio
FinFuncion