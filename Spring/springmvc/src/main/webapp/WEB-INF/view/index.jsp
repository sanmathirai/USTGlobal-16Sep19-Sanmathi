<%

String  s = (String)request.getAttribute("msg");
%>

<html>
<body>
<h2 style="color:red">${msg}</h2>
<h2 style="color:Green"><%= s %></h2>
<h2 style="color:red">${name}</h2>
<h2 style="color:red">${id}</h2>
</body>
</html>
