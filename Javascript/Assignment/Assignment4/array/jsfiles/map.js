const items = [
    {
        name : 'Earring',
        id : 1,
        price : 5000
    },
    {
        name : 'Kajal',
        id : 2,
        price : 1000
    },
    {
        name : 'Trimmer',
        id : 3,
        price : 5000
    },
    {
        name : 'Beardo',
        id : 3,
        price : 5000
    }
]
const newarry = items.map(function(value,index){
   let num = value.price+=350
    return value
})
console.log(newarry)
const items1 = [
    {
        name : 'Earring',
        id : 1,
        price : 5000
    },
    {
        name : 'Kajal',
        id : 2,
        price : 1000
    },
    {
        name : 'Trimmer',
        id : 3,
        price : 5000
    },
    {
        name : 'Beardo',
        id : 3,
        price : 5000
    }
]
newarry2 = items1.map(value => {
        value.price+=350;
        return num1 = value
    })


console.log(newarry2)

    newarray3 = items.filter(function(value,index){
        if(value.price > 3000)
        return true;
        else
        return false;
    })
    
    console.log(newarray3)
    newarray4 = items.filter(value=> value.price > 3000)
    
    console.log(newarray4)

    