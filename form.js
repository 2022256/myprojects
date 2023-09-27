function validateuserdata()
{
const firstname = document.getElementById("firstname").value;
const lastname = document.getElementById("lastname").value;
const usertype = document.getElementById("usertype").value;
const password = document.getElementById("password").value;


if(!/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).+$/test(password))
{
    alert("password must contain one small one capital one number");
}

if(firstname && lastname)
{

    window.location.href = "home.html"
    
}
else
{
   alert("try again")
}
}