import psycopg2 #Esto es para conectarnos a Postgre

conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:

            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'
            valores = (
                        ('carlos', 'lara', 'clara@mail.com'),
                        ('Marcos','Canto','mcanto@mail.com'),
                        ('Marcelo','Cuenca','mcuenca@mail.com')
                    ) #es una tupla de tuplas
            cursor.executemany(sentencia, valores)#de esta manera ejecutamos la sentencia
            #conexion.commit()
            registros_insertador = cursor.rowcount
            print(f'los registros insertados son {registros_insertador}')

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()
