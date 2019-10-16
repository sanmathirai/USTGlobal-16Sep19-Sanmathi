console.log("============Using Named function================")

function fibonacci(num)
{   
    var firstNum = 0,secondNum = 1,next,i;
    console.log('fibbonacci series of ',num,' is')
    console.log(firstNum);
    console.log(secondNum);
    for(i = 2 ; i <= num ; i++)
    {
       next = firstNum+secondNum;
       firstNum = secondNum;
       secondNum = next;
       console.log(next);
      
    }
    
}
fibonacci(4)
console.log("============Using function expression================");
var fibonacci = function(num)
{
    var firstNum = 0,secondNum = 1,next,i;
    console.log('fibbonacci of ',num,' is')
    console.log(firstNum);
    console.log(secondNum);
    for(i = 2 ; i <= num ; i++)
    {
       next = firstNum + secondNum;
       firstNum = secondNum;
       secondNum = next;
       console.log(next);
      
    }

}
fibonacci(5)

console.log("============Self Invoke function================");
( function ( num ) {

    var firstNum = 0,secondNum=1,next,i;
    console.log('fibbonacci of ',num,' is')
    console.log(firstNum);
    console.log(secondNum);
    for(i = 2 ; i <= num ; i++)
    {
      next = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = next;
      console.log(next);
     
      
    }

})
fibonacci(7)

console.log("============Fat arrow function================");

var factorial = num => {

   var firstNum = 0,secondNum = 1,next,i;
   console.log('fibbonacci of ',num,' is')
    console.log(firstNum);
    console.log(secondNum);
    for(i = 2 ; i <= num ; i++)
    {
       next = firstNum + secondNum;
       firstNum = secondNum;
       secondNum = next;
       console.log(next);
      
    }

}
fibonacci(6)