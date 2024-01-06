<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="in.books.Book" %>
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
padding-left:500px;
font-size:1.5cm;
opacity:1;
color:#FFF;
}
#banner{
background-color:blue;
opacity:0.6;
width:99.5%;
height:100px;
border:2px solid #FFF;
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
border:1px solid #FF3;
}
.but{
width:300px;
height:50px;
border-radius:25px;
background-color:skyblue;
border:black;
font-size:0.5cm;
margin-left:50px;
}
.SubHead{
font-size:1cm;
font-weight:bold;
color:#FFF;
}
.nm{
font-size:0.6cm;
font-weight:bold;
margin:10px;
}
.link{
 color:#FFF;
 text-decoration:none;
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

<span class="SubHead">Ask for Books</span>
<br />
<br />
<form method="post" action="issueBook.php">
<br><br>
<span class="nm">Book : </span><select name="name" class="fields" required >
<option value="" disabled="disabled" selected="selected"> - - Select Book - - </option>
<%-- <?php
$x=mysqli_query($set,"SELECT * FROM books");
while($y=mysqli_fetch_array($x))
{
	?>
<option value="<?php echo $y['id'];?>"><?php echo $y['name']." ".$y['author'];?></option>
<?php
}
?> --%>

<%-- <%
	List<Book> books = (List<Book>) request.getAttribute("books");
	for (Book book : books) {
%>
<option value="<%= book.getId() %>"><%= book.getName() + " " + book.getAuthor() %></option>
<%
	}
%> --%>
</select></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="SUBMIT" class="but" /></td></tr>
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