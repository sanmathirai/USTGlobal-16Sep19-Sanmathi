console.log("============Using Named function================")

function factorial(num){
    var fact = 1,i;
    for(i = 1 ; i <= num ; i++)
    {
       fact = fact * i;
      
    }
    return fact; 
}
result = factorial(0);
console.log("Factorial  0 is : ",result);

console.log("============Using function expression================");
var factorial=function(num){
    var fact = 1,i;
    for(i = 1 ; i <= num ; i++)
    {
       fact = fact * i;
      
    }
    return fact;  
}
result = factorial(6);
console.log("Factorial 6 is : ",result);

console.log("============Self Invoke function================");
( function ( num ) {
    var fact = 1,i;
    for(i = 1 ; i <= num ; i++)
    {
       fact = fact * i;
      
    }
    console.log("Factorial of 5 is : ",fact);
      
})
(5);


console.log("============Fat arrow function================");

var factorial = num => {
    var fact = 1,i;
    for(i = 1 ; i <= num ; i++)
    {
       fact = fact * i;
      
    }
    return fact;  
}
result = factorial(3);
console.log("Factorial of 3 is : ",result);
