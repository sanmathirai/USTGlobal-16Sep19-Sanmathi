/* OBSERVABLES */
const employees = new Promise(function(resolve,reject){
    if(3>10){
        resolve([
            {
                name : 'Billgates',
                age : 67
            },
            {
                name : 'Mark Zukerberg',
                age : 40
            },
            {
            name : 'Jeff Bezos',
                age : 45
            }
        ])
    }
    else{
        reject('Failed')
    }
})

employees.then(function(data){
    console.log('Employee data', data)
}).catch(function(error){
    console.log('Failiure message', error)
})

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count;
    }
    return innerFunction

}
let innerFunc = outerFunction(10)
let counter = innerFunc()
console.log('Counter Value',counter)