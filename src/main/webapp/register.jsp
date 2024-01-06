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
color:#FFF;
padding-left:500px;
font-size:1.5cm;
opacity:1;
}
#banner{
background-color:blue;
opacity:0.6;
border:2px solid #FFF;
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
height:30px;
border-radius:25px;
font-weight:bold;
font-size:0.5cm;
color:black;
padding:4px 6px;
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
}
.nm{
font-size:0.6cm;
font-weight:bold;
margin:10px;
}
.table{
width:900px;
}
.link{
color:#FFF;
text-decoration:none;
font-size:0.5cm;
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

<span class="SubHead">Student Registration</span>
<br />
<br />
<form method="post" action="register">
<span class="nm">Name:</span><input type="text" name="name" class="fields" placeholder="Enter Full name" required="required" size="25" /><br><br>
<span class="nm">Email ID : </span></td><td><input type="email" name="email" class="fields" placeholder="Enter Email ID" required="required" size="25" /><br><br>
<span class="nm">Sem : </span>
<select name="sem" class="fields" required>
<option value="" disabled="disabled" selected="selected">- - Select Sem - -</option>
<option value="1">First Sem</option>
<option value="2">Second Sem</option>
<option value="3">Third Sem</option>
<option value="4">Fourth Sem</option>
<option value="5">Fifth Sem</option>
<option value="6">Sixth Sem</option>
<option value="7">Seventh Sem</option>
<option value="8">Eighth Sem</option>
</select>
<br><br>
<span class="nm">Branch : </span>
<select name="branch" class="fields" required>
<option value="" disabled="disabled" selected="selected">- - Select Branch - -</option>
<option value="Computer Science and Engineering">Computer Science and Engineering</option>
<option value="Electronics and Comunication Engineering">Electronics and Comunication Engineering</option>
<option value="Mechanical Engineering">Mechanical Engineering</option>
<option value="Civil Engineering">Civil Engineering</option>
<option value="Chemical Engineering">Chemical Engineering</option>
<option value="Metallurgical & Material Science Engineering">Metallurgical & Material Science Engineering</option>
<option value="Electrical & Electronics Engineering">Electrical & Electronics Engineering</option>
</select><br><br>
<span class="nm">User Type : </span>
<td>
<select name="User Type" class="fields" required>
<option value="" disabled="disabled" selected="selected">- - Select User Type - -</option>
<option value="Post Graduate">Post Graduate</option>
<option value="Under Graduate">Under Graduate</option>
<option value="Reaserch Scholor">Reasearch Scholor</option>
</select><br><br>
</td></tr>
<span class="nm">Student ID : </span></td><td><input type="text" name="sid" class="fields" placeholder="Enter Student ID" required="required" size="25" /></td></tr>
<br><br><span class="nm">Password : </span></td><td><input type="password" name="pass" class="fields" placeholder="Enter Password" required="required" size="25" /></td></tr>
<br><br>
<tr><td colspan="2" align="center"><input type="submit" value="Register" class="but" /></td></tr><br><br><br>
<tr><td colspan="2" align="center" class="msg" style="color:white; font-size:0.6cm;"><?php echo $msg;?></td></tr>
</form><br />
<br />
<a href="index.jsp" class="link">Go Back</a>
<br />
<br />

</div>
</div>
</body>
</html>