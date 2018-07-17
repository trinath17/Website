<%--  this page is used to display the information of the student retirved from the data base. --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*"%>
<%@ page import="tshaga.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/WEB-INF/style.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body backgorund="blue.jpg">
<table  align="center" width="800" cellpadding="0" cellspacing="0">
<tr>
<td><a href="http://www.gmu.edu"><img src="logo.jpg" width="200" height="100"/></a></td>
<td  align=" right"><p class="swe"  >Thrinath Reddy Shaga</p></td>
</tr>
<tr>
<td width="800" height="10" colspan="2"><p><img src="green.jpg" width="1000" height="10"/></p></td>
</tr>
</table>
<table cellpadding="10" cellspacing="10" align="center" border="5">
<tr><td><strong>Name:</strong> ${ student1.getName()}</td>
<td><strong>Student_Id:</strong> ${ student1.getstudentid()}</td>
<td><strong>Street Address:</strong> ${ student1.getAddress()}</td></tr>

<tr><td><strong>City:</strong> ${ student1.getcity() }</td>
<td><strong>State:</strong> ${ student1.getstate()}</td>
<td><strong>Zip Code:</strong> ${ student1.getZip() }</td></tr>

<tr><td><strong>Telephone: </strong>${ student1.getPhone()}</td>
<td><strong>E-mail:</strong> ${ student1.getemailid()}</td>
<td><strong>URL:</strong> ${ student1.getURL()}</td></tr>

<tr><td><strong>Date Of Survey:</strong> ${ student1.getDate()}</td>
<td><strong>What Did You Like The Most In Campus=:</strong> ${student1.getthings()}</td>
<td><strong>How Made You Interested In Mason? :</strong> ${student1.getgettoknow()}</td></tr>


<tr><td><strong>Comments:</strong> ${student1.getcomments()}</td>
<td><strong>Month Of Graduation: </strong>${student1.getmonth()}</td>
<td><strong>Year Of Graduation:</strong> ${student1.getyear()}</td></tr>

<tr rowspan="3"><td><strong>How Likely Would You Recommend Us:</strong> ${student1.getlikelihood()}</td></tr>
</table>
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