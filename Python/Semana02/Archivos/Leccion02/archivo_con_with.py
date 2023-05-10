from ManejoArchivos import ManejoArchivos

# Manejo de contexto WITH: sintaxis simplificada, abre y cierra el archivo
#with open('prueba.txt','r', encoding='utf8') as archivo:
 #   print(archivo.read())
# No hace falta ni try, ni finally
# en el contexto with lo q se ejecuta de manera automatica
# Utiliza diferentes metodos: __enter__ este es el que abre
# Ahora el siguiente metodo es el que cierra: __exit__

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())