from string import ascii_uppercase as alfabeto

def encriptador(mensaje):
    mensaje = list(mensaje) 
    c_unicos = set(mensaje)
    clave = dict(zip(c_unicos, alfabeto))
    print(clave)
    #print(clave,'clave')
    encriptado = ""
    for letra in mensaje:
        encriptado = encriptado+clave[letra]

    return encriptado , clave

def desencriptador(encriptado, clave):
    desencriptado = ""
    clave_inv = dict((v, k) for k, v in clave.items())
    for letras in encriptado:
        desencriptado = desencriptado + clave_inv[letras]
    return desencriptado

e,c = encriptador('¡Hola mundo!')

print(desencriptador(e,c))