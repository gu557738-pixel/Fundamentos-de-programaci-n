Algoritmo VentasPorCategorias
    Definir venta, totalGlobal Como Real
    Definir contMas1000, cont500a1000, contMenos500 Como Entero
    Definir totalMas1000, total500a1000, totalMenos500 Como Real
    Definir continuar Como Caracter
	
    contMas1000 = 0
    cont500a1000 = 0
    contMenos500 = 0
    totalMas1000 = 0
    total500a1000 = 0
    totalMenos500 = 0
    totalGlobal = 0
	
    Escribir "¿Desea registrar una venta? (si / no):"
    Leer continuar
    continuar = Minusculas(continuar)
	
    Mientras continuar = "si" Hacer
        
        Escribir "Ingrese el monto de la venta:"
        Leer venta
        Mientras venta <= 0 Hacer
            Escribir "El monto debe ser positivo. Ingrese nuevamente:"
            Leer venta
        FinMientras
		
        Si venta > 1000 Entonces
            contMas1000 = contMas1000 + 1
            totalMas1000 = totalMas1000 + venta
        Sino
            Si venta > 500 Entonces
                cont500a1000 = cont500a1000 + 1
                total500a1000 = total500a1000 + venta
            Sino
                contMenos500 = contMenos500 + 1
                totalMenos500 = totalMenos500 + venta
            FinSi
        FinSi
		
        totalGlobal = totalGlobal + venta
		
        Escribir "¿Desea registrar otra venta? (si / no):"
        Leer continuar
        continuar = Minusculas(continuar)
    FinMientras
	
    Si totalGlobal > 0 Entonces
        Escribir "=============================="
        Escribir "      RESUMEN DE VENTAS"
        Escribir "=============================="
        Escribir "Ventas mayores a $1000: ", contMas1000
        Escribir "  Monto total: $", totalMas1000
        Escribir "Ventas entre $500 y $1000: ", cont500a1000
        Escribir "  Monto total: $", total500a1000
        Escribir "Ventas menores o iguales a $500: ", contMenos500
        Escribir "  Monto total: $", totalMenos500
        Escribir "------------------------------"
        Escribir "Monto global vendido: $", totalGlobal
        Escribir "Total de ventas: ", contMas1000 + cont500a1000 + contMenos500
        Escribir "=============================="
    Sino
        Escribir "No se registro ninguna venta. Fin del programa."
    FinSi
FinAlgoritmo