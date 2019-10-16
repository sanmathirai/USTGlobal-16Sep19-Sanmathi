console.log("============Using Named function================");
function arraySum(arr){
    var i,sum = 0;
    for(i = 0;i < arr.length;i++)
    {
        sum += arr[i];
    }
    return sum;
}
var arr = [10,20,30,40+20];
var result = arraySum(arr);
console.log("Arry is :"+arr)
console.log(result);

console.log("============Using function expression================");
var arraySum = function(arr){
    var i,sum = 0;
    for(i = 0;i < arr.length;i++)
    {
        sum += arr[i];
    }
    return sum;
}
var arr = [10,20,30,40];
var result = arraySum(arr);
console.log("Arry is :"+arr)
console.log(result);

console.log("============Self Invoke function================");

(function(){

    var i,sum = 0;
    var arr = [10,20,30,50,1];
    for(i = 0; i < arr.length ; i++)
    {
        sum += arr[i];
    }
    console.log("Arry is :"+arr)
   console.log('sum is',sum); 
})
()



console.log("============Fat arrow function================");
var arraySum = arr => {
    var i,sum = 0;
    for(i = 0; i < arr.length ; i++)
    {
        sum += arr[i];
    }
    return sum; 
}
var arr = [10,20,30,40,60];
var result = arraySum(arr);
console.log("Arry is :"+arr)
console.log(result);