<%-- This jsp file is used to display a message to a user.!! --%>
<%-- If the mean of the data entered by the user is less than 90 then this jsp page is invoked.! --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="tshaga.*"%>
<%@page import=" java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SimpleAcknowledgement</title>
<link href="/WEB-INF/style.css" type="text/css" rel="stylesheet" />
</head>
<body background="blue.jpg">
 <table  align="center" width="800" cellpadding="0" cellspacing="0">
<tr>
<td><a href="http://www.gmu.edu"><img src="logo.jpg" width="200" height="100"/></a></td>
<td  align=" right"><p class="swe"  >Thrinath Reddy Shaga</p></td>
</tr>
<tr>
<td width="800" height="10" colspan="2"><p><img src="green.jpg" width="1000" height="10"/></p></td>
</tr>
</table>
<div align="center" >
<h3><p><strong>Thank You For Filling The Form.!!!</strong></p></h3>
<div align="center">
	<table class="surveyform" cellpadding="5" border="5">
	<tr> 
	<td>
		<strong>Mean: </strong>${data_bean1.getMean() } </td> </tr>
		<tr> <td><strong>Standard Deviation: </strong>${data_bean1.getStandardDeviation() } </td> </tr>
		<tr> <td><strong>Your Data Is Saved !! </strong> </td> </tr> <br>
</table>
</div>
<center>
<h4>Please select an ID among the following to view the information of a Student</h4><br>
</center>
<table border="5" cellpadding="10" cellspacing="10">
		<%
		String[] idstring = (String[])request.getAttribute("id_jsp");
		
			for (int i=0;i<idstring.length;i++) {
			String stuid = idstring[i];
		%>		
		<li><a href="/Assignment4_Shaga/ShowValues?id=<%=stuid%>"><%=stuid%></a></li>		
		<%
			}
		%>
	</table>
</div>
<table align="center" width="800" cellpadding="0" cellspacing="0">
	<tr>
    	<td align="right">
        <a href="http://www.gmu.edu" class="Tooltip" title="Please visit http://www.gmu.edu for more information."><img src="logo.jpg" width="50px" height="50px" /></a>
        </td>
    </tr>
</table>
<table align="center" width="800" cellpadding="0" cellspacing="0">
    <tr>
        <td width="800" height="10" colspan="2">
        	<p><img src="green.jpg" width="800" height="10"/></p>
        </td>
    </tr>
    
</table>
</body>
</html>