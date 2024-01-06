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
background-color:white;
width:300px;
height:50px;
border-radius:25px;
margin:40px;
padding:0px 50px;
font-weight:bold;
color:black;
font-size:0.5cm;
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
text-decoration:none;
color:#FFF;
}
.nm{
font-size:0.6cm;
font-weight:bold;
}
.table
{
	border-radius:5px;
	padding:0px 5px;
	border:1px solid #FF3;
	width:900px;
	background-color:transparent;
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

<span class="SubHead">Books Request From Students</span>
<br />
<br />

<table border="0" class="table" cellpadding="10" cellspacing="10">
<tr class="labels" style="text-decoration:underline;"><th>Book Name</th><th>Author</th><th>Requested by<br>(Student ID) </th><th>Status</th></tr>
<!--   <?php
$x=mysqli_query($set,"SELECT * FROM request");
while($y=mysqli_fetch_array($x))
{
	?> -->
<tr class="labels" style="font-size:14px;"><td><?php echo $y['name'];?></td><td><?php echo $y['author'];?></td><td><?php echo $y['sid'];?></td>

<td><a href="returnBook.php?r=<?php echo $y['id'];?>&r2=<?php echo $y['name'];?>&r3=<?php echo $y['author'];?>" class="link">Accept</a></td>
<td><a href="decline.php?r=<?php echo $y['id'];?>" class="link">Decline</a></td></tr>

</table><br />
<br />
<a href="adminhome.jsp" class="link">Go Back</a>
<br />
<br />

</div>
</div>
</body>
</html>