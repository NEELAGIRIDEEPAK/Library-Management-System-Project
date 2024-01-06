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
color:gold;
font-size:0.5cm;
}
.head{
padding-left:500px;
font-size:1.5cm;
opacity:1;
color:#FFF;
}
#banner{
height:100px;
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
font-size:0.5cm;
color:#FFF;
text-decoration:none;
}
.nm{
font-size:0.7cm;
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

<span class="SubHead">Add Books in Library</span>
<br />
<br />
<form method="post" action="">
<tr><td class="msg" align="center" colspan="2"></td></tr> 
<span class="nm">Book : </span><input type="text" name="name" placeholder="Enter Book Name" size="25" class="fields" required="required"  /><br>
<span class="nm">Author :</span> <input type="text" name="auth" placeholder="Enter Author Name" size="25" class="fields" required="required"  /><br>
<input type="submit" value="ADD BOOK" class="but" />
</form>
<br />
<br />
<a href="adminhome.jsp" class="link">Go Back</a>
<br />
<br />

</div>
</div>
</body>
</html>