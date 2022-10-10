
pc = "S"
x = 0

while pc == "S":
    valor_u = int(input("Ingrese un valor unitario: "))
    producto = input("El producto cuenta con IVA?: ")
    producto = producto.upper()
    if producto == "S":
        cant_producto =  int(input("Ingrese la cantidad que lleva el cliente del producto a registrar: "))
        print("IVA incluído")
        x += ((valor_u*cant_producto) + (valor_u*0.19)*cant_producto)
    
    else:
        cant_producto =  int(input("Ingrese la cantidad que lleva el cliente del producto a registrar: "))
        print("PRODUCTO SIN IVA")
        x += valor_u*cant_producto     

    print(f"SUBTOTAL: {x}")    
    pc = input("¿Faltan productos por cobrar? S/N ")
    pc = pc.upper()
    if pc == "N":
        print(f"TOTAL A COBRAR: {x}")

