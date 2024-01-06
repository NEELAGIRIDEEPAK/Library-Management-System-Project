<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
opacity:1;
color:#FFF;
}
#banner{
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
.fields{
border:1px solid #FF3;
background-color:white;
width:300px;
height:50px;
border-radius:25px;
margin:40px;
padding:0px 0px;
font-weight:bold;
font-size:0.5cm;
color:black;
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
color:#FFF;
}
.link{
font-size:0.5cm;
color:white;
text-decoration:none;
}
.nm{
font-weight:bold;
font-size:0.6cm;
}
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

<span class="SubHead">Admin Sign In</span>
<br />
<br />
<form method="post" action="adminlogin">
<tr><td colspan="2" align="center" class="msg"></td></tr>
<span class="nm">Admin ID :</span> <input type="text" name="aid" class="fields" size="25" placeholder="Enter Admin ID" required="required" /><br>
<span class="nm">Password :</span> <input type="password" name="pass" class="fields" size="25" placeholder="Enter Password" required="required" /><br>
<input type="submit" value="Sign In" class="but" />
</form>
<br />
<br />
<a href="index.jsp" class="link" style="color:skyblue;"><h2>Main Page</h2></a>
<br />
<br />

</div>
</div>
</body>
</html>