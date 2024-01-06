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
}
.head{
color:#FFF;
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
width:80%;
background-color:gray;
border-style:solid;
border-color:blue;
border-width:5px;
border-radius:10px;
opacity:;
}
.fields{
background-color:white;
width:300px;
height:30px;
border-radius:25px;
font-weight:bold;
color:black;
font-size:0.5cm;
color:#FF3;
padding:4px 6px;
border:1px solid #FF3;

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
font-size:1cm;
color:#FFF;
text-decoration:none;
}
.nm{
font-size:0.6cm;
font-weight:bold;
margin:10px;
}
.table{
width:900px;
border-radius:5px;
padding:0px 5px;
border:1px solid #FF3;
}
.labels
{
	font-family:"Trebuchet MS";
	font-size:16px;
	color:#FF3;
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

<span class="SubHead">Request for Unavailable Book</span>
<br />
<br />
<form method="post" action="requestbook">
<table border="0" class="table" cellpadding="10" cellspacing="10">
<tr><td class="msg" align="center" colspan="2"></td></tr> 
<tr><td class="labels">Book : </td><td><input type="text" size="25" class="fields" required="required" name="name" placeholder="Enter Book Name" /></td></tr>
<tr><td class="labels">Author Name : </td><td><input type="text" size="25" class="fields" required="required" name="author" placeholder="Enter Author Name" /></td></tr>
<tr><td colspan="2" align="center"><input type="submit" class="but" value="Request" /></td></tr>
</table>
</form>

<br />
<br />
<a href="Home.jsp" class="link">Go Back</a>
<br />
<br />

</div>
</div>
</body>
</html>