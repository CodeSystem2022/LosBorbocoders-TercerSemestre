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
