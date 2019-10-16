let element=document.getElementById('demo')
console.log(element)
console.log('Element text :',element.textContent)
element.textContent='Good Evening'
console.log('Element text :',element.textContent)
let buttonelement=document.createElement('button')
console.log(buttonelement)
buttonelement.textContent='Click here'
document.body.appendChild(buttonelement);

let ulElement=document.createElement('ul')
let li1Element=document.createElement('li')
let li2Element=document.createElement('li')
let li3Element=document.createElement('li')

li1Element.textContent='Java'
li2Element.textContent='J2EE'
li3Element.textContent='SQL'
ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)

document.body.appendChild(ulElement)

ulElement.style.color='orange'
element.style.fontSize='30px'

function showMessage()
{
   alert('Hello') 
}
function changeColor(){
over1 = document.getElementById('over')
over1.style.color = 'red';
}
function changeColorblack(){
    let changeColor = document.getElementById('over')
    changeColor.style.color='black'
}
function printHello(){

console.log('Key released')
let username=document.getElementById('username').value
document.getElementById('showusername').textContent=username;

}
let name='Sanmathi'
let age = 21
let phoneno= 789654458
//String Interpolation
console.log(`Name is ${name} age ${age} phoneno ${phoneno}`)
console.log(`2+2 = ${2+2}`)-