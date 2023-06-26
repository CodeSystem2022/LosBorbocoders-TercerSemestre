let persona3 = new Persona ('Carla', 'Ponce') // No se puede crear un objeto antes de definir la clase

class Persona  {  // Clase Padre
    static contadorPersonas = 0; // Atributo  estático
    //email= 'Valor default email'; // Atributo no estático

    static get MAX_OBJ(){ //Este método simula una constante
        return 5 ;
    }


    constructor (nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido; 
        if (Persona.contadorPersonas < Persona MAX_OBJ) {
            this._Persona = ++Persona.contadorPersonas;
        }
        else{
            console.log('Se ha superado el máximo de objetos permitidos')
        }
    // console.log('Se incrementa el contador: +Persona.contadorObjetosPersona');
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

 nombre completo() {
    return this._idPersona+ ' ' + this._nombre +  " " + this._apellido; 
 }

 toString() {
    return this._nombreCompleto();

 }

 static saludar(){
    console.log('Saludos desde este método Static');
 }

 static saludar2(persona){
    console.log(persona.nombre + ' '+ persona.apellido);
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
     // Sobreescritura
     nombreCompleto() {
         return super.nombreCompleto() + ' , ' + this.departamento;
        
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

//Object prototype toString esta es la manera de acceder a métodos y atributos de forma dinámica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar(persona1);

Empleado.saludar()
Empleado.saludar2(persona1);

//console.log(persona1.contadorObjetosPersona);
 console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); no se puede acceder desde la clase 
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; no se puede modificar ni alterar

let persona4 = new ('Franco', 'Díaz');
console.log(persona4.toString());
