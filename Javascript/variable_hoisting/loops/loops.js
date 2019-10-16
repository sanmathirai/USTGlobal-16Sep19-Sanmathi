var laptops=['hp','dell','lenovo','acer'];

console.log('==========For of loop======');
    for(var element of laptops)
        console.log('laptops =',element);

console.log("==========for in loop===========");
for(var index in laptops){
    console.log('laptop =',laptops[index])
}
console.log("======for in loop with objects======");
var person={
    name: 'Sundari',
    age:33,
    color:'white'
}
for(var key in person){
    console.log("person",person[key]);
}
console.log("======for each======");
var movies=['kgf','titanic','sholay'];

movies.forEach(function(value,index){
    console.log("Index=",index);
    console.log("movies=",value);
})
var items=[
            {
                item:'bangle',
                id:1,
                price:100
            },
            {
                item:'Eyeliner',
                id:2,
                price:100
            },
            {
                item:'shoes',
                id:3,
                price:3000
            },
            {
                items:'bag',
                id:3,
                price:500
            }
          ];
    items.forEach(function(value,index){

        console.log("item=",value);
        console.log('Index of item :',index)
    })

    