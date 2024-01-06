<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Library Management System</title>
<link href="stylesheet.css" rel="stylesheet" type="text/css" />
<style>
body{
background-image: url("images/xyz.jpeg");
background-size:cover;
}
.clg{
padding-top:10px;
font-size:0.5cm;
}
.head{
padding-left:500px;
font-size:1.5cm;
opacity:1;
}
#banner{
background-color:blue;
opacity:0.6;
}
#wrapper
{
background-color:gray;
border-style:solid;
border-color:gray;
border-width:5px;
opacity:70%;
}
.table{
background-color:skyblue;
opacity:09;
font-weight:bold;
border-style:groove;
border-width:10px;
padding:10px;
}
.fields{
background-color:white;
width:300px;
height:50px;
border-radius:25px;
margin:40px;
padding:0px 50px;
font-weight:bold;
color:black;
font-size:0.5cm;

}
.but{
width:300px;
height:50px;
border-radius:25px;
background-color:skyblue;
border:black;
font-size:0.5cm;
}
.SubHead{
font-size:1cm;
font-weight:bold;
}
.link{
font-size:1cm;
}
</style>
</head>

<body>
<div id="banner">
<span class="head">Library Management System</span><br />
<marquee class="clg" direction="right" behavior="alternate" scrollamount="5" style="color:gold; padding:-top:50px">LAZY CODERS</marquee>
</div>
<br />

<div align="center">
<div id="wrapper">
<br />
<br />

<span class="SubHead">Student Sign In</span>
<br />
<br />
<form method="post" action="studentlogin">
<!--<table border="0" cellpadding="4" cellspacing="4" class="table">-->
Student ID : <input type="text" name="sid" class="fields" size="25" placeholder="Enter Student ID" required="required" />
Password : <input type="password" name="pass" class="fields" size="25" placeholder="Enter Password" required="required" />
<input type="submit" value="Sign In" class="but">
</form>
<br />
<br /><br /><br />
<a href="register.jsp" class="link">Sign Up</a>
<br />
<a href="admin.jsp" class="link">Admin Sign In</a>

<br />
<br />

</div>
</div>
</body>
</html>