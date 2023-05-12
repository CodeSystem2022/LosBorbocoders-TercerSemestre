console.log('Primitive type');
let x = 10;
console.log(x.length);


console.log('Object type');
let person = {
    name: 'Maisie',
    lastname: 'Williams',
    email: 'm.williams@gmai.com',
    age: 26,
    language: 'en',
    get lang() {
        return 'Language: ' + this.language.toUpperCase();
    },
    set lang(lang) {
        this.language = lang.toUpperCase();
    },
    completeName: function () {
        return this.name + ' ' + this.lastname;
    },
    get description() {
        return 'Name: ' + this.name + ' Age: ' + this.age
    }

    
}
console.log(person.name);
console.log(person);
console.log(person.completeName());


console.log('New object');
let person2 = new Object(); // New object in memory
person2.name = 'Emilia';
person2.lastname = 'Clarke';
person2.email = 'e.clarke@gmail.com';
person2.phone = 157424654;
console.log(person2);
console.log(person2['lastname']);

console.log('for in');
// for in
for (property in person) {
    console.log(property);
    console.log(person2[property]);
}

console.log('change & delete an error');
// dynamic value change & delete properties
person.lastnames = 'Fairley'; 
console.log(person);
delete person.lastnames;
console.log(person);

// Printing objects
console.log('Printing objects');
// 1.
console.log(person.name + ' ' + person.lastname);

// 2.
for( prop in person ) {
    console.log(prop);
}

// 3.
let personArray = Object.values(person);
console.log(personArray);

// 4.
let personString = JSON.stringify(person);
console.log(personString);

console.log('Lesson 5 - Setters & Getters');
console.log(person.description);

console.log('Language getter');
console.log(person.lang);
person.lang = 'ch';
console.log(person.lang);

function personCreator(name, lastname, email) { // Constructor
    this.name = name;
    this.lastname = lastname;
    this.email = email;
    this.fullName = function () {
        return this.name + ' ' + this.lastname;
    }
}

let father = new personCreator('Eddard', 'Stark', 'es@gmail.com');
father.phone = '1323465329';
console.log(father);
console.log(father.fullName());
let mother = new personCreator('Catelyn', 'Tuly', 'ct@gmail.com');
console.log(mother);
console.log(mother.fullName());

// protoype
personCreator.prototype.phone = '1578954324';
console.log(father);
console.log(mother.phone);

// call

let person4 = {
    name: 'Daenerys',
    lastname: 'Targaryen',
    fullDescription: function(degree, phone) {
        return 'Degree: ' + degree + ' ' + this.name + ' ' + this.lastname + ' Phone: ' + phone;
        //return this.name + ' ' + this.lastname;
    }
}

let person5 = {
    name: 'Khal',
    lastname: 'Drogo'
}

console.log(person4.fullDescription('Actress', '176334354'));
console.log(person4.fullDescription.call(person5, 'Actor', '19343458734'));

// apply
let array = ['Act.', '174300345'];
console.log(person4.fullDescription.apply(person5, array));
