const hobbies = ['Sleeping','Cricket','Eating','Coding','Roaming']
console.log(typeof hobbies)
const isArrayOrNot = Array.isArray(hobbies)
console.log('Hobbies array or not :',isArrayOrNot)
const isIncluded=hobbies.includes('eating')
console.log('Is Included eating :',isIncluded)
const pushoperation=hobbies.push('dancing','singing')
console.log('Push :',pushoperation)
console.log('Arry is after push :',hobbies)
const popoperation=hobbies.pop()
console.log('Pop :',popoperation)
console.log('Arary after pop is :',hobbies)

const unshifting=hobbies.unshift('numisMatics','swimming')
console.log('array unshift :',unshifting)
console.log('array after unshift ',hobbies)

const shifting=hobbies.shift()
console.log('array shift ',shifting)
console.log('array after shift ',hobbies)


const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming']
console.log("Array before splice :",hobbies1)
hobbies1.splice(0,3,'swimming','PUBG','Dancing')
console.log("Array after splice :",hobbies1)
console.log("Array before slice :",hobbies1)
console.log("Array after slice :",hobbies1.slice(1,4))
console.log("Original Array after slice :",hobbies1)

const hobbies2 = ['Sleeping','Cricket','Eating','Coding','Roaming']
const indexofCoding=hobbies2.indexOf('Eating',1)
console.log('Index of Eating',indexofCoding)

const seperater=hobbies2.join("_")
console.log('Join',seperater)

const number=[100,200,300,400]
const newarry=number.map(function(value,index){
    let num=value+50
    return num
})
console.log('new',newarry)
console.log("ori",number)

newarry2=number.map(vale => vale+150)
console.log(newarry2)
newarray3=number.filter(function(value,index){
    if(value>200)
    return true;
    else
    return false;
})

console.log(newarray3)
newarray4=number.filter(value=> value>200)

console.log(newarray4)

const items=[
            {
                name:'Earring',
                id:1,
                price:5000
            },
            {
                name:'Kajal',
                id:2,
                price:1000
            },
            {
                name:'Trimmer',
                id:3,
                price:5000
            },
            {
                name:'Beardo',
                id:3,
                price:5000
            }
]
const newitemarry=items.map(function(value,index){
  value=value.price+50
    return value
})
console.log('***',newitemarry)
console.log('***',items)