let persona3 = new Persona ('Carla', 'Ponce') // No se puede crear un objeto antes de definir la clase

class Persona  {  // Clase Padre
    constructor (nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido; 
    }

    get nombre(){
        return this._nombre
    }

    set nombre(nombre){
        this._nombre = nombre ;
    }

    get apellido (){
        this._apellido = apellido ;
    }

    set apellido (apellido) {
        this._apellido = apellido ;
    }
}
class Empleado extends Persona { // Clase hija 
            constructor(nombre, apellido, departamento){
                super(nombre, apellido);
                this._departamento = departamento;
            }

            get departamento(){
                return this._departamento ;
            }

            set departamento(departamento){
                 return this._departamento = departamento;
            }
        }

let Persona1 = new Persona ('Martin',  'Perez') ;
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
persona2.apellido = 'Perez'
console.log(persona2.apellido);
//console.log (persona1);
let Persona 2 = new Persona ('Carlos', 'Lara');
console.log (persona2.nombre);
persona2.nombre = ('Maria Laura');
console.log(persona2.nombre);
persona2.apellido = ('Alvarez')
console.log(persona2.apellido)
//console.log (persona2);

Let empleado1 new = Empleado('Maria', 'Gimenez', 'Sistemas');
console.log (empleado1) ;
