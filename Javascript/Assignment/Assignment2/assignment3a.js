console.log("============Using Named function================")
function circumference(radius){
    return 2 * Math.PI * radius;
}
circum = circumference(2);
console.log("Circumference when Radius=2 ",circum);

console.log("============Using function expression================");
var circumference=function(radius){
    return 2 * Math.PI * radius;
}
circum = circumference(4);
console.log("Circumference when Radius=4 ",circum);

console.log("============Self Invoke function================");

(function(radius){
    circum = 2 * Math.PI * radius
    console.log("Circumference when Radius= 3",circum);
})
(3);

console.log("============Fat arrow function================");

var circumference= radius => {return 2 * Math.PI * radius;}
circum = circumference(6);
console.log("Circumference when Radius=6 ",circum);

 

