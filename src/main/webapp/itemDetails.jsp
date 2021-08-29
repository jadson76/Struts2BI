<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<head>
	<link href="main.css" rel="stylesheet" type="text/css">
	<meta http-equiv="Content-type" content="text/html;charset=UTF-8">
	<script type="text/javascript">
		var screenWidth = screen.width;
		var screenHeight = screen.height;
		var x = (screenWidth - window.outerWidht) /2;
		var x = (screenHeight - window.outerHeight) /2;
		window.moveTo(x,y);
	</script>
</head>
<div align="center">
	<table cellspacing="0" cellpadding="5" align="center" class="blockTable">
		<tr>
			<th colspan="2">Item Details</th>			
		</tr>
		<tr>
			<td>Order Number</td>
			<td>${param.purchaseNumber}</td>		
		</tr>
		<tr>
			<td>Dater</td>
			<td>${param.date}</td>		
		</tr>
		<tr>
			<td>Item</td>
			<td>${param.item}</td>		
		</tr>
		<tr>
			<td>Total</td>
			<td>${param.total}</td>		
		</tr>
	</table>
	<a onclick="javascript:window.close();" href="#">close</a>
</div>