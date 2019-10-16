//named functions
function add1(numm1,numm2){
    console.log('the Sum is  :',numm1+numm2);
}

add1(10,20,30);


//Function expressions
var add1=function(num1,num2){
    console.log('Sum is  :',num1+num2);
}
add1(10,20);

var add3=function(num1,num2){
   return num1+num2;
}

var res=add3(10,20);
console.log('Sum is :',res);

var sub=function(num1,num2){
    console.log("diff is:",num1-num2);
}
sub(20,10);

console.log("=======================")
function add6(num1,num2,num3)
{
    console.log(num1+num2+num3);
}
add6(10,20,20);

// function(num3,num4)
// {
// console.log(num1,num2);

// }
// (10,20);
console.log("==========fat arrow functions=============");

var div1 =(num1,num2) =>{
console.log('value=',num1/num2);
}
div1(10,20);
console.log("==========1 arguement without =============");


var number1 =num1 =>console.log('number is :',num1);
number1(60);
var add4=(num1,num2)=>num1+num2;
res=add4(10,20)
console.log(res);

console.log("==========function call before defination =============");

mult(10,100);
function mult(num1,num2)
{
console.log(num1*num2);
}


var mult1=(num1,num2)=>num1*num2;

res1=mult1(30,300);
const hobbies=[10,20,30]
hobbies[1]=200
console.log(hobbies)