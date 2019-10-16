/* OBSERVABLES */
const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve("Success")
    }
    else{
        reject('Failed')
    }
})

message.then(function(msg){
    console.log('Success message', msg)
}).catch(function(err){
    console.log('Success message',err)
})
