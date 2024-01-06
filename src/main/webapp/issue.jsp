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
background-image:url("images/xy.jpeg");
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
	background-color:transparent;
	width:900px;
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

<span class="SubHead">Available Books Requests</span>
<br />
<br />

<table border="0" class="table" cellpadding="10" cellspacing="10">
<tr class="labels" style="text-decoration:underline;"><th>Book Name</th><th>Author</th><th>Issued For<br>Student ID</th><th>Date</th><th>Status</th></tr>
<!-- <?php
$x=mysqli_query($set,"SELECT * FROM issue");
while($y=mysqli_fetch_array($x))
{
	?>  -->
<tr class="labels" style="font-size:14px;"><td><?php echo $y['name'];?></td><td><?php echo $y['author'];?></td><td><?php echo $y['sid'];?></td>
<td><?php echo $y['date'];?></td><td><a href="return.php?r=<?php echo urlencode($y['id']);?>&r1=<?php echo urlencode($y['sid']);?>&r2=<?php echo urlencode($y['name']);?>&r3=<?php echo urlencode($y['author']);?>" class="link">Return</a></td>
</tr>
<?php
#print_r($y);
}

?>
</table><br />
<br />
<a href="adminhome.jsp" class="link">Go Back</a>
<br />
<br />

</div>
</div>
</body>
</html>