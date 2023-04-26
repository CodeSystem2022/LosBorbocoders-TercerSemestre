let counter = 0;

// while
while(counter > 3) {
    console.log(counter);
    counter++;
}
console.log('End of while loop');

// do while
counter = 0;
do{
    console.log(counter);
    counter++;
}while (counter < 3);
console.log('End of do while loop');

// for
for(counter = 0; counter < 3; counter++) {
    console.log(counter);
}
console.log('End of for loop');

// break
for(counter=0; counter <= 10; counter++) {
    if(counter % 2 == 0) {
        console.log(counter);
        break;
    }
}
console.log('The loop ends when the first even number is found.');

// continue & labels
start:
for(counter = 0; counter <= 10; counter++) {
    if(counter % 2 !== 0) {
        continue start;        
    }
    console.log(counter);
}
console.log('End of loop.');


