console.log(hoist);
var hoist;

console.log(hoist);
var hoist=10;

function display(){
    console.log(hoist);
    var hoist;

}
display();
function display(){
    console.log(hoist);
    var hoist=10;
}
display();
