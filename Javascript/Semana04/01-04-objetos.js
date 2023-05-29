//Objetos
let x = 10;//variable de tipo primitiva
console.log(x.length);
console.log('Tipos Primitivos');

//objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,

    nombreCompleto: function(){
        return this.nombre+' '+this.apellido;
    }
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.edad);
console.log(persona.email);
console.log(persona.nombreCompleto());

let persona2 = new Object();//Debe crear un objeto en memoria
persona2.nombre = 'juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '123456';
console.log(persona2);
console.log(persona2.nombre);
console.log(persona2.telefono);
console.log('Creamos Un Nuevo Objeto');
console.log(persona['apellido']);//Accedemos como si fuera un arreglo

//for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log('Cambiamos y Eliminamos Un Error');
//agregar y eleminar propiedades de los objetos
persona.apellido = 'Bentacud';//cambiamos dinamicamente el valor del objeto
persona.apellida = 'Bentacud';//cambiamos dinamicamente el valor del objeto
delete persona.apellida
console.log(persona);


//Distinatas formas de imprimir un objeto 
//Nro 1: la mas sencilla concatenar cada valor de cada propiedad
console.log('Distinatas formas de imprimir un objeto');
console.log('Nro 1: la mas sencilla concatenar cada valor de cada propiedad');
console.log(persona.nombre+', '+persona.apellido+', '+persona.edad+', '+persona.email);

//Nro2: con un ciclo for in
console.log('Nro2: con un ciclo for in');
for(prop in persona){
    console.log(persona[prop]);
}

//Nro3: La funcion Objet.values()
console.log('Nro3: La funcion Objet.values()');
let personaArray = Object.values(persona);
console.log(personaArray);

//Nro4: Utilizaremos el metodo JSON.stringifi
console.log('Nro4: Utilizaremos el metodo JSON.stringifi');
let personaString = JSON.stringify(persona);
console.log(personaString);
