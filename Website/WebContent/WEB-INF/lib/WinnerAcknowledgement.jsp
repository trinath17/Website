<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="tshaga.*"%>
    <%@page import="java.util.HashMap"%>
    <%@page import=" java.util.Iterator"%>
    <%@page import=" java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="style.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WinnerAknowledgement</title>
</head>
<body>
<table align="center"  cellpadding="0" cellspacing="0" width="1000">
<tr> <td>
	<a href ="http://cs.gmu.edu"> <img  src="http://brand.gmu.edu/wp-content/uploads/assets/primarylogo/Mac/GMU_PLogo_RGB.jpg" alt="MasonLogo" width="200" height="100" / > </a> </td>    
       <td  align="center">
<p style ="font-size: 50px "; "width:500px" ;>George Mason University</p></td>
</table>
<hr/>
<center>
<p><strong>Thanks for filling out the form!!</strong></p><br>
	<p>
		<h1>Congratulations!!</h1> <br> <br> <br>
		<b> YOU WON TWO MOVIE TICKETS FOR FREE</b>
	</p>
	</center>
	
	<center>
	<table cellpadding="10" cellspacing="10" border="5">
		<tr> <td><strong>Mean : </strong>${data_bean1.getMean() }</td></tr><br>
		<tr> <td><strong>Standard Deviation :</strong>${data_bean1.getStandardDeviation() }</td> </tr>
		<tr> <td> <strong> Data is stored successfully.!!</strong></td> </tr>
	</table>
	<br>
	<br>
	</center>
	<center> <strong> Please select a student Id to view their details.!!</strong></center><br>
	<br>
	<center>
	<table>
		<%
		String[] idstring = (String[])request.getAttribute("id_jsp");
		
			for (int i=0;i<idstring.length;i++) {
			String stuid = idstring[i];
		%>
		<a href="/Assignment4_Shaga/ShowValues?id=<%=stuid%>"><%=stuid%></a>
		<br>
		<br />
		<%
			}
		%>


	</table>
	</center>
	
<hr>

</body>
</html>