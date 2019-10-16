var todaysDate = new Date();
console.log('Todays date',todaysDate);
console.log('Day',todaysDate.getDay());
console.log('year',todaysDate.getFullYear());
console.log('month',todaysDate.getMonth());
console.log('date',todaysDate.getDate());
var constMilli = new Date(0);
console.log('Date :',constMilli);
var constString = new Date('oct 10 2019');
console.log('Date string constructor :',constString);
var constYear=new Date(2020,10);
console.log('Date year constructor :', constYear);

