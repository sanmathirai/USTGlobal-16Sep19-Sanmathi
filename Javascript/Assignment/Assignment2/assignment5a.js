
console.log("============Using Named function================")
function prime(num){
    var i, flag = true, num;
		 
		for(i = 2; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
                flag = false;
              
				break;
            }
           
        }
       return flag;   
    }
    number1 = 3;
    result = prime(number1)
    if(result == true)
    console.log(number1 + " is a prime number");
    else
    console.log(number1 + " is n ot Prime number");

console.log("============Using function expression================");
var prime = function(num)
{
    var i, flag = true, num;
		 
    for(i = 2; i <= num/ 2; i++)
    {
        if(num % i == 0)
        {
            flag = false;
          
            break;
        }
       
    }
   return flag; 
}
number2 = 4;
result = prime(number2);
if(result == true)
    console.log(number2 + " is a prime number");
    else
    console.log(number2 + " is not Prime number");

console.log("============Self Invoke function================");
(function(num)
{
    var i, flag = true, num;
		 
    for(i = 2; i <= num/ 2; i++)
    {
        if(num % i == 0)
        {
            flag = false;
          
            break;
        }
       
    }
    if(flag == true)
    console.log(num + " is a prime number");
    else
    console.log(num + " is n ot Prime number");
})
(11)

console.log("============Fat arrow function================");

var prime = num => {
    var i, flag = true, num;
		 
    for(i = 2; i <= num/ 2; i++)
    {
        if(num % i == 0)
        {
            flag = false;
          
            break;
        }
       
    }
    if(flag == true)
    console.log(num + " is a prime number");
    else
    console.log(num + " is n ot Prime number"); 
}
prime(71);
