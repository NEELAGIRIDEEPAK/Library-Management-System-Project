<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");
    String adminID = (String) session.getAttribute("adminID");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Library Management System</title>
<style>
body{
background-image:url("images/xy.jpeg");
background-size:cover;
}
.clg{
padding-top:10px;
font-size:0.5cm;
color:gold;
}
.head{
padding-left:500px;
font-size:1.5cm;
color:#FFF;
opacity:1;
}
#banner{
width:99.5%;
background-color:blue;
opacity:0.6;
}
#wrapper
{
width:80%;
border-radius:10px;
background-color:gray;
border-style:solid;
border-color:blue;
border-width:5px;
opacity:;
}
.SubHead{
font-size:1cm;
font-weight:bold;
color:#FFF;
}
.Command{
margin:20px;
width:600px;
}
.but{
width:300px;
height:50px;
border-radius:25px;
background-color:skyblue;
border:black;
font-size:0.5cm;
padding:10px;
text-decoration:none;
}

a.link:link{font-family:"Segoe UI";font-size:16px;color:#FFF;text-decoration:none;}
a.link:active{font-family:"Segoe UI";font-size:16px;color:#FFF;text-decoration:none;}
a.link:visited{font-family:"Segoe UI";font-size:16px;color:#FFF;text-decoration:none;}
a.link:hover{font-family:"Segoe UI";font-size:16px;color:#F6F;text-decoration:none;}

a.Command:link{text-decoration:none;font-family:"Segoe UI";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #FF0;border-radius:5px;}
a.Command:active{text-decoration:none;font-family:"Segoe UI";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #FF0;border-radius:5px;}
a.Command:visited{text-decoration:none;font-family:"Segoe UI";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #FF0;border-radius:0px;}
a.Command:hover{text-decoration:none;font-family:"Segoe UI";color:#CFC;font-size:16px;padding:5px 7px;border:2px solid #F60;border-radius:5px;box-shadow:0px 0px 10px #FFFFFF;}
</style>
</head>

<body>
<div id="banner">
<span class="head">Library Management System</span><br />
<marquee class="clg" direction="right" behavior="alternate" scrollamount="1">LAZY CODERS</marquee>
</div>
<br />

<div align="center">
<div id="wrapper">
<br />
<br />

<span class="SubHead">Welcome <%= adminID %></span>
<br />
<br /><br><br><br>
<a href="addBooks.jsp" class="Command">Add Books</a><a href="delBooks.jsp" class="Command">Delete Books</a>
<a href="bookRequests.jsp" class="Command">Books Requests</a><a href="issue.jsp" class="Command">Book Issue</a>
<a href="display1.jsp" class="Command">Display Books</a>
<a href="takebook.jsp" class="Command">Return Books</a>
<a href="changePasswordAdmin.jsp" class="Command">Change Password</a>
<br><br><br><br><br>
<span><a href="logout" class="but">Logout</a></span>
<br />
<br />

<br />
<br />

</div>
</div>
</body>
</html>