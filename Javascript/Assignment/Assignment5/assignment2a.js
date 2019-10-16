let password = document.getElementById("paswd");
let username = document.getElementById("username");

function showPassword() {
   
    if (password.type === "password") {
      password.type = "text";
    } else {
      password.type = "password";
    }
  }

document.getElementById("button1").disabled = true;
function validation(){
   
let len1 = (username.value.trim()).length;
let len2 =(password.value.trim()).length;
if(len1 > 5 && len2 > 6)
document.getElementById("button1").disabled = false;
else
document.getElementById("button1").disabled = true;

}