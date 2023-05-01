function sum(a, b) {
    //console.log('Sum: ' + (a+b));
    return a+b;
}

let result = sum(2, 3);
console.log(result);

// function expression or anonymous
let f = function(a, b) {return a+b};
result = f(1,2);
console.log(result);

// self-invoking function 
(function(a, b) {
    console.log('result of the sum: ' + (a+b))              ;
})(3, 7);   

console.log(typeof sum);
function arg(a, b) {
    console.log(arguments);
}
arg(1,2)

// toString
var myFunctionToString = arg.toString();
console.log(myFunctionToString);

// Arrow function
const arrowFunctionSum = (a, b) => a+b;
console.log(arrowFunctionSum(4,5));

// Expression
let sum2 = function(a = 7, b = 3) {
    console.log(arguments[0]);
    console.log(arguments[1]);
    return a + b + arguments[2];
}
result = sum2(1, 2, 3);
console.log(result);

// Hoisting
let answer = sumAll(2, 4, 6, 8);
console.log(answer);

function sumAll() {
    let sum = 0;
    for (let i = 0; i < arguments.length; i++) {
     sum += arguments[i];
    }
    return sum
}

// primitives types
let y = 10;
function changeValue(x) { // pass by value
    x = 20;
}

changeValue(y);
console.log(y);

// Pass by reference    
const person = {
    name: 'Michael',
    lastname: 'Jordan'
}

function changeObjectValue(p1) {
    p1.name = 'Shaq';
    p1.lastname = 'O`neal';
}
changeObjectValue(person)
console.log(person);