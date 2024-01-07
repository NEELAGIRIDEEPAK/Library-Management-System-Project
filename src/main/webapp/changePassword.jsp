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
width:80%;

background-color:gray;
border-style:solid;
border-color:blue;
border-width:5px;
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
.nm{
font-size:0.6cm;
font-weight:bold;
margin:10px;
}
.table{
width:900px;
padding:30px;
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

<span class="SubHead">Change Password</span>
<br />
<br />
<form method="post" action="changepassword">
<table cellpadding="3" cellspacing="3" class="table" align="center">
<tr><td colspan="2" class="msg" align="center"><?php echo $msg;?></td></tr>
<tr><td class="labels">Old Password :</td><td><input type="password" name="old" size="25" class="fields" placeholder="Enter Old Password" required="required" /></td></tr>
<tr><td class="labels">New Password :</td><td><input type="password" name="p1" size="25" class="fields" placeholder="Enter New Password" required="required"  /></td></tr>
<tr><td class="labels">Re-Type Password :</td><td><input type="password" name="p2" size="25"  class="fields" placeholder="Re-Type New Password" required="required" /></td></tr><tr></tr>

</table><br><br>
<input type="submit" value="Change Password" class="but" />
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