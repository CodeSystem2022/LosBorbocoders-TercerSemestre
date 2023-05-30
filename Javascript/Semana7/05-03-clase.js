class Persona { //Clase padre
  constructor(nombre, apellido) {
    //Creamos el método constructor.
    this._nombre = nombre; 
    this._apellido = apellido; 
  }

  //Método get: NO puede llamarse igual que la propiedad
  get nombre() {
    return this._nombre;
  }
  //6.2 Parte Set (Modificamos el atributo)

  set nombre(nombre) {
    this._nombre = nombre;
  }

  get apellido() {
    return this._apellido;
  }
  set apellido(apellido) {
    this._apellido = apellido;
  }

  nombreCompleto() {
    return this._nombre + " " + this._apellido;
  }

  //sobreescribiendo el método dela clase padre (Object)
  toString() {
    //Regresa un string
    //se aplica el polimorfismo que significa = múltiples formas en tiempo de ejecución.
    //El método que se ejecuta depende si es una referencia de tipo padre o hija 
    return this.nombreCompleto();
  }
}

class Empleado extends Persona {//Clase hija
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido);
    this._departamento = departamento;
  }

  get departamento() {
    return this._departamento;
  }

  set departamento(departamento) {
    this._departamento = this.departamento;
  }

  //7.2 Sobreescritura:
  //La clase hija aplica el concepto de sobreescritura
  //Modifica el comportamiento definido del metodo de la clase padre.
  nombreCompleto() {
    return super.nombreCompleto() + ", " + this._departamento;
  }
}

let persona1 = new Persona("Martín", "Perez"); 
console.log(persona1.nombre); 
persona1.nombre = "Juan Carlos";
//console.log(persona1);

let persona2 = new Persona("Carlos", "Lara"); 
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2); 

let empleado1 = new Empleado("Maria", "Gimenez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString Esta es la manenera de acceder a metodos y atributos de forma dinamica
console.log(empleado1.toString());
console.log(persona1.toString()); 
