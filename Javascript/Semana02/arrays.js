// let cars = new Array('Lamborghini', 'Tesla', 'Ferrari'); old syntax
const cars = ['Lamborghini', 'Tesla', 'Ferrari'];
console.log(cars);

for (let i = 0; i < cars.length; i++) {
    console.log(i + ':' + cars[i]);
    
}
// Changing values
cars[2] = 'Mercedes Benz';
console.log(cars[2]);

// Adding values
cars.push('BMW');
console.log(cars);

cars[cars.length] = 'Ford';
console.log(cars);

// Object type
console.log(Array.isArray(cars));
console.log(cars instanceof Array);