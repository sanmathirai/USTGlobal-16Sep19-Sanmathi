console.log("\n== for in object ==\n\n")

console.log("\n== Chicken Items ==\n\n")
var chicken = [
                {name : 'Kebab',pice : 100,pieces : 4},
                {name : 'chicken 65',price : 150,pieces : 10},
                {name : 'lolypop',price : 150,pieces : 10}
            ]
for(var key in chicken){
    console.log("Chicken Item =",chicken[key]);
}

console.log("\n== Pizza Items ==\n\n")

var pizza = [
            {name : 'Margherita',type : 'veg',cost : 166.9, hasCheese : true},
            {name : 'Frutti di Mare',type : 'Non veg',cost : 186.9,hasCheese : false},
            {name : 'Quattro Formaggi',type : 'veg',cost : 156.9,hasCheese : true}
        ]
for(var key in pizza){
    console.log("Pizza =",pizza[key]);
}
console.log("\n== Burger ==\n\n")
var burgers = [
            {name:'Veggie Burgers',type:'veg',cost:166.9,hasCheese:true},
            {name:'The Black Rabbit',type:'veg',cost:166.9,hasCheese:true},
            {name:'Vegan BBQ Tofu Burger',type:'veg',cost:166.9,hasCheese:true},
            {name:'Portobello and Peach Burgers',type:'veg',cost:166.9,hasCheese:true}
        ]
for(var burger in burgers){
    console.log("Burger =",burgers[burger]);
}

console.log("\n== Meals types ==\n\n")

var meals=[
            {name:'breakfast',time:'7Am-7.30Am'},
            {name:'brunch',time:'9Am-9.30Am'},
            {name:'elevenses',time:'11Am-11.30Am'},
            {name:'lunch',time:'12.30Pm-1.30Pm'},
            {name:'tea',time:'4Pm-6.30Pm'},
            {name:'supper',time:'5Pm-6.30Pm'},
            {name:'dinner',time:'7Pm-8.30Am'}
        ]
for(var meal in meals){
    console.log("Meal type =",meals[meal]);
}

console.log("\n== South Indian ==\n\n")
var southIndian=[
                    {item :'VADA',Quantity:'2plates',cost:16.9,ischatnirequired:true},
                    {item :'BISIBELEBHATH',Quantity:'2plates',cost:16.9},
                    {item :'PULIYOGARE',Quantity:'1plate',cost:16.9},
                    {item :'IDLI',Quantity:'1/2plate',type :'set idli',cost:20.9,ischatnirequired:true},
                    {item :'Dosa',Quantity:'2plates',cost:16.9,ischatnirequired:true},
                    {item :'Rice',Quantity:'2plates',cost:166.9}
                ]
for(var food in southIndian){
    console.log("Item =",southIndian[food]);
}

console.log("\n== North Indian ==\n\n")
var northIndian=[
                    {name:'Awadhi Biryani',Quantity:'2plates',cost:16.9,ischatnirequired:true},
                    {name:'Naan/Rumali Roti',Quantity:'2plates',cost:16.9,ischatnirequired:true},
                    {name:'Litti Chokha',Quantity:'2plates',cost:16.9,ischatnirequired:true}]
for(var food in northIndian){
    console.log("Item =",northIndian[food]);
}

console.log("\n== Handbags ==\n\n");
var handBags=[
                {name:'Louis Vuitton',price:150000,offer:50},
                {name:'Mouawad',price:120000,offer:30},
                {name:'Hilde Palladino',price:100000,offer:25}
            ]
for(var handBag in handBags){
    console.log("Bag =",handBags[handBag]);
}

console.log("\n== Soap ==\n\n")
var soaps=[
            {name:'Dove',Quanlity:'175g (each 125g)',Item_Form: 'Solid',price:50},
            {name:'Pears',Quanlity:'275g (each 125g)',Item_Form: 'Solid',price:350},
            {name:'lyril',Quanlity:'300g (each 125g)',Item_Form: 'Solid',price:200},
            {name:'Lifeboy',Quanlity:'475g (each 125g)',Item_Form: 'liquid',price:150}
        ]
for(var soap in soaps){
    console.log("Soap =",soaps[soap]);
}

console.log('\n== Cheeses ==\n\n')
var cheeses=[
                {name:'Brie',cost:50},
                {name:'Camembert',cost:50},
                {name:'Mozzarella',cost:50},
                {name:'Gouda',cost:50},
                {name:'Gruyere',cost:50}
            ]
for(var cheese in cheeses){
    console.log("Cheese Item =",cheeses[cheese]);
}

console.log('\n== Spices ==\n\n')
var spices=[
            {name:'Black pepper',cost:50},
            {name:'Cumin',cost:50},
            {name:'Coriander',cost:50},
            {name:'Nutmeg and mace',cost:50}]
for(var spice in spices){
    console.log("Spice  =",spices[spice]);
}