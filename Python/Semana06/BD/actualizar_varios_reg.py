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
            sentencia = 'UPDATE persona SET nombre = %s, apellido = %s, email = %s WHERE id_persona = %s'
            valores = (
                        ('Romina', 'Ayala', 'rayala@mail.com', 4),
                        ('Juan Carlos', 'Roldan', 'rjcarlos@mail.com', 5)
                    )
            cursor.executemany(sentencia, valores)#de esta manera ejecutamos la sentencia
            registros_actualizados = cursor.rowcount
            print(f'los registros actualizados son {registros_actualizados}')

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()
