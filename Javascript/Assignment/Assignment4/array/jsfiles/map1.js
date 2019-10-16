console.log('==== 1 ===')
const number1 = [100,200,300,400,500]
console.log("Array ",number1)
const newarry = number1.map(function(value,index){
    let num1 = value+50
    return num1
})
console.log(" using map ",newarry)

newarry2 = number1.map(vale => vale+50)
console.log("map using fat arrow",newarry2)


newarray3 = number1.filter(function(value,index){
    if(value>200)
    return true;
    else
    return false;
})

console.log("filter :",newarray3)

newarray4 = number1.filter(value=> value>200)
console.log("filter fat arrow",newarray4)

console.log('==== 2 ===')
const number2 = [20,300,400,40,500]
console.log("Array ",number1)

const newarry5 = number2.map(function(value,index){
    let num1 = value+150
    return num1
})
console.log(" Using map",newarry5)

newarry6 = number2.map(vale => vale+150)
console.log("map using fat arrow",newarry6)

console.log('==== 3 ===')
const number3 = [20,30,40,50,60,70,]
console.log("Array ",number1)

const newarry7 = number3.map(function(value,index){
    let num1 = value-10;
    return num1
})
console.log(" Using map",newarry7)

newarry8 = number3.map(vale => vale-10)
console.log("map using fat arrow",newarry8)

console.log('==== 4 ===')
const number4 = [20,30,40,50,60,70,]
console.log("Array ",number4)

const newarry9 = number4.map(function(value,index){
    let num1 = value*10;
    return num1
})
console.log(" Using map",newarry9)

newarry10 = number4.map(vale => vale*10)
console.log("map using fat arrow",newarry10)

console.log('==== 5 ===')
const number5 = [20,30,40,50,60,70,]
console.log("Array ",number5)

const newarry11 = number5.map(function(value,index){
    let num1 = value/5;
    return num1
})
console.log(" Using map",newarry11)

newarry12 = number5.map(vale => vale/5)
console.log("map using fat arrow",newarry12)

console.log('==== 6 ===')
const number6 = [20,30,4,5,6,70,]
console.log("Array ",number6)

const newarry13 = number6.map(function(value,index){
    let num1 = value%2;
    return num1
})
console.log(" Using map",newarry13)

newarry14 = number6.map(vale => vale%2)
console.log("map using fat arrow",newarry14)

console.log('==== 7 ===')
const number7 = [200,3000,400,500,60,70,]
console.log("Array ",number7)

const newarry15 = number7.map(function(value,index){
    let num1 = value*2;
    return num1
})
console.log(" Using map",newarry15)

newarry16 = number7.map(vale => vale*2)
console.log("map using fat arrow",newarry16)

console.log('==== 8 ===')
const number8 = [200,3000,400,500,60,70,]
console.log("Array ",number8)

const newarry17 = number8.map(function(value,index){
    let num1 = value*10;
    return num1
})
console.log(" Using map",newarry17)

newarry18 = number8.map(vale => vale*10)
console.log("map using fat arrow",newarry18)

console.log('==== 9 ===')
const number9 = [0,1,2,3,4]
console.log("Array ",number9)

const newarry19 = number9.map(function(value,index){
    let num1 = value-1;
    return num1
})
console.log(" Using map",newarry19)

newarry20 = number9.map(vale => vale-1)
console.log("map using fat arrow",newarry20)

console.log('==== 9 ===')
const number10 = [0,1,2,3,4]
console.log("Array ",number10)

const newarry21 = number10.map(function(value,index){
    let num1 = value/1;
    return num1
})
console.log(" Using map",newarry21)

newarry22 = number10.map(vale => vale/1)
console.log("map using fat arrow",newarry22)





 