console.log('Window object :',window);
console.log('This keyword  :',this);
console.log(this===window)

/* window.alert('Welcome to JavaScript')
alert('Welcome to UST')
let confirmDelete = confirm("Are you sure you want to delete")
console.log('Confirm delete',confirmDelete) */

/* let username = prompt('What is your name ?','Sanmathi')
console.log('User name is :',username) */

const person = {
    firstName : 'Sanmathi',
    lastname : 'Rai',
    age :26,
    getname : function(){
        console.log('This keyword :',this)
        return this.firstName + ' ' + this.lastname;
    }
}
let fullname=person.getname()

console.log('FUll name :' ,fullname)