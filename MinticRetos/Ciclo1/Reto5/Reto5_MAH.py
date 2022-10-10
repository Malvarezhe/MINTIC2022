
import csv
import json


def clima(data):
     diccionario = {}
     #print(data.read())
   
     #creación del archivo data_nuevo.csv
     encabezados = ["id", "location", "temperature", "pressure", "above_avg_temp", "above_avg_pres"]
     with open('data_nuevo.csv', "w", newline='') as csvfile:
          escribir = csv.DictWriter(csvfile, fieldnames = encabezados, delimiter = ",") #DictWriter me permite escribir como un diccionario los datos que quiera ingresar al archivo
          escribir.writeheader() #escribo en el archivo los encabezados
     
     #     #apertura del archivo data original 
     with open("data.csv", "r") as f:
          reader = csv.reader(f)#, delimiter = ",")
          next(reader) #elimino encabezados del archivo
      
          #creo listas vacias que almacenaran mis datos de temperatura y presión
          temp1 = []
          pres1 = []
          temp2 = []
          pres2 = []
          temp3 = []
          pres3 = []
          temp4 = []
          pres4 = []
          temp5 = []
          pres5 = []

     #    #itero reader que contiene la data sin encabezados para poder armas las listas por locación
          for linea in reader:
               if linea[1] == "1":
                    temp1.append(int(linea[2]))
                    pres1.append(int(linea[3]))

               elif linea[1] == "2":
                    temp2.append(int(linea[2]))
                    pres2.append(int(linea[3]))

               elif linea[1] == "3":
                    temp3.append(int(linea[2]))
                    pres3.append(int(linea[3]))

               elif linea[1] == "4":
                    temp4.append(int(linea[2]))
                    pres4.append(int(linea[3]))

               elif linea[1] == "5":
                    temp5.append(int(linea[2]))
                    pres5.append(int(linea[3]))

     #    #Creo listas vacías que almacenaran los promerios de temperatura y presión de cada lista anteriormente creada
          prom1 = []
          prom2 = []
          prom3 = []
          prom4 = []
          prom5 = []

     #      #Saco promedios de cada locación de temperaturas y presión
          prom1.append(round(sum(temp1)/len(temp1), 1)) #con sum hago la suma de todos los valores enteros 
          prom1.append(round(sum(pres1)/len(pres1), 1))

          prom2.append(round(sum(temp2)/len(temp2), 1))
          prom2.append(round(sum(pres2)/len(pres2), 1))
          
          prom3.append(round(sum(temp3)/len(temp3), 1))
          prom3.append(round(sum(pres3)/len(pres3), 1))
          
          prom4.append(round(sum(temp4)/len(temp4), 1))
          prom4.append(round(sum(pres4)/len(pres4), 1))
          
          prom5.append(round(sum(temp5)/len(temp5), 1))
          prom5.append(round(sum(pres5)/len(pres5), 1))

          #Creación diccionario json punto 1 del Reto.
          #En la variable diccionario creada al inicio voy guardando en caada llave los valores de promedio
          diccionario["1"] = prom1
          diccionario["2"] = prom2
          diccionario["3"] = prom3
          diccionario["4"] = prom4
          diccionario["5"] = prom5
          print(diccionario)

          #creación de archivo json
          datos = json.dumps(diccionario) #Variable a retornar en Vpl /#dumps me convierte a cadena de caracteres
          with open("promedios.json", "w") as jsonfile:
               json.dump(diccionario, jsonfile, indent=1) #dump es para escribir el archivo. Aqui le indico al programa que coja el 
               #diccionario, me lo convierta a archivo json y me lo guarde en jsonfile. 
               #indent me identa el archivo los espacios q le indique.

          # with open("promedios.json", "r") as jsonprom:
          #      print(jsonprom.read())
          
          #print(data.read())

     #Función para generar cálculos:
     def comparar(a, b, c, d):
          temp = ""
          press = ""

          #Comparo si temp es mayor a temp promedio
          if a > b: 
               temp = "SI"
          elif a < b: 
               temp = "NO"
          elif a == b:
               temp = "IGUAL"
          
          #Comparo si presión es mayor a presión promedio
          if c > d: 
               press = "SI"
          elif c < d: 
               press = "NO"
          elif c == d:
               press = "IGUAL"

          return temp, press

     #Escribimos el nuevo archivo csv con las columnas nuevas
     with open("data.csv", "r") as f:
          reader = csv.reader(f, delimiter = ",")
          next(reader) #elimino encabezados del archivo

          with open('data_nuevo.csv', "a", newline="") as f:
               writer = csv.writer(f, delimiter = ",")

               for linea in reader:
                    print(linea)
                    if linea[1] == '1':  #accedo a la llave 1
                         #llamo la función y envío 4 parametros. Pos de columna de temp, valor en diccionario posición 0, pos columna pres, posición de valor
                         #presión en diccionario.
                         above_temp,above_press = comparar(int(linea[2]),diccionario['1'][0],int(linea[3]),diccionario['1'][1])
                    elif linea[1] == '2': #accedo a la llave 2
                         above_temp,above_press = comparar(int(linea[2]),diccionario['2'][0],int(linea[3]),diccionario['2'][1])
                    elif linea[1] == '3': #accedo a la llave 3
                         above_temp,above_press = comparar(int(linea[2]),diccionario['3'][0],int(linea[3]),diccionario['3'][1])
                    elif linea[1] == '4': #accedo a la llave 4
                         above_temp,above_press = comparar(int(linea[2]),diccionario['4'][0],int(linea[3]),diccionario['4'][1])
                    elif linea[1] == '5': #accedo a la llave 5
                         above_temp,above_press = comparar(int(linea[2]),diccionario['5'][0],int(linea[3]),diccionario['5'][1])

                    writer.writerow([linea[0], linea[1], linea[2], linea[3], above_temp, above_press]) #Sobre escribo linea a linea el archivo con los elementos
                    #de cada columna. 

                    #Forma anbigua ya que tocaria linea por linea 
                    # if linea[1] == "1":
                    #      if int(linea[2]) > diccionario["1"][0]:
                    #           above_avg_temp = "SI"
                    #      if int(linea[2]) < diccionario["1"][[0]]:
                    #           above_avg_temp = "NO"
                    #      if int(linea[2]) == diccionario["1"][[0]]:
                    #           above_avg_temp = "IGUAL"
                         
                    #      if int(linea[3]) > diccionario["1"][1]:
                    #           above_avg_pres = "SI"
                    #      if int(linea[3]) < diccionario["1"][[1]]:
                    #           above_avg_pres = "NO"
                    #      if int(linea[3]) == diccionario["1"][[1]]:
                    #           above_avg_pres = "IGUAL"

     return datos


data = clima(open("./data.csv", "r"))  #llamado de la función principal con envío de archivo de datos.
#Validar ruta al correr