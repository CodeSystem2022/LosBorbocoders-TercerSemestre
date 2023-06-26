from Leccion07.capa_datos_persona.conexion import Conexion
from Leccion07.capa_datos_persona.persona import Persona
from loger_base import log

class PersonaDAO:
    """
    DAO sifgnifica: Data Access Object
    CRUD significa:
                   Create -> Insertar
                   Read   -> Seleccionar
                   Update -> Actualizar
                   Delete -> Eliminar
    """
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona ASC  '
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    # Metodos de clase
    @classmethod
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = []
                for registro in registros:
                    persona = Persona(registro[0],registro[1],registro[2],registro[3])
                    personas.append(persona)
                return personas

    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f'Persona insertada: {persona}')
                return  cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                return cursor.rowcount

    @classmethod
    def eliminar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.id_persona,)
                cursor.execute(cls._ELIMINAR, valores)
                log.debug(f'Persona eliminada: {persona}')
                return cursor.rowcount

if __name__ == '__main__':

    # Eliminar un registro
    #persona1 = Persona(id_persona=5)
    #personas_eliminadas = PersonaDAO.eliminar(persona1)
    #log.debug(f'Personas eliminadas: {personas_eliminadas}')

    # Actualiza un registro
    # persona1 = Persona(1, nombre='Nuevo1', apellido='Actualizado1', email='actual@mail.com')
    # personas_actualizadas = PersonaDAO.actualizar(persona1)
    # log.debug(f'Personas actualizadas: {personas_actualizadas}')

    #Inserta un registro
    #persona1 = Persona(nombre='Homero', apellido='Simpsons', email='homero@mail.com')
    #personas_insertadas = PersonaDAO.insertar(persona1)
    #log.debug(f'Personas insertadas: {personas_insertadas}')

    #Seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)