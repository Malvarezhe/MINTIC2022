# POR FAVOR LEA TODAS LAS INDICACIONES SUMINISTRADAS EN EL 
# ENUNCIADO ANTES DE EMPEZAR A IMPLEMENTAR SU SOLUCIÓN

def es_semestre_valido(p, s):
    # ESTA VEZ TU DEFINES TUS RETORNOS
    if s > 0 and s <= len(p):
        return True
    else:
        return False


def es_semestre_vacio(p, s):
    # ESTA VEZ TU DEFINES TUS RETORNOS
    s=s-1
    if len(p[s])==0:
        return True
    else: 
        return False


def es_materia_valida(p, s, m):
    # ESTA VEZ TU DEFINES TUS RETORNOS
    for key, value in p:
        if key ==m:
            return True
        else: 
            return False


def modificar_materia(pensum, semestre, materia, nombre, creditos):
    # ACÁ INICIA LA FUNCIÓN
    nuevo_pensum = 0
    es_semestre_valido(pensum, semestre)
    es_semestre_vacio(pensum, semestre)
    es_materia_valida(pensum, semestre, materia)

    if es_semestre_valido(pensum, semestre) and not es_semestre_vacio(pensum, semestre) and es_materia_valida(pensum, semestre, materia):
    
        nuevo_pensum = pensum[semestre -1]
        nuevo_pensum[materia]['nombre'] = nombre
        nuevo_pensum[materia]['créditos'] = creditos
  
    return nuevo_pensum
    
    # ACÁ TERMINA LA FUNCIÓN
    # ESTA VEZ TU DEFINES TUS RETORNOS

def eliminar_materia(pensum, semestre, materia):
    # ACÁ INICIA LA FUNCIÓN
    if es_semestre_valido(pensum, semestre) and not es_semestre_vacio(pensum, semestre) \
       and es_materia_valida(pensum, semestre, materia):
            del pensum[semestre - 1][materia]
    
    # ACÁ TERMINA LA FUNCIÓN
    # ESTA VEZ TU DEFINES TUS RETORNOS

pensum = [
{'0123': {'nombre': 'intro a la ing', 'créditos': 2}, '4567': {'nombre': 'inglés', 'créditos': 1}},
{}, 
{}       ]

semestre = 1
materia = '0123'
nombre = 'Carlos '
creditos = 3

print()
print("Resultado: " , modificar_materia(pensum, semestre, materia, nombre, creditos))

