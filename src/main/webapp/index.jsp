<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<s:head theme="ajax" debug="true" />
<link href="main.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Struts2 BI</title>
<script type="text/javascript">
	function openPopUp(url) {
		window.open(url,null,"height=200,width=300,status=yes,toolbar=no,menubar=no,location=no");
	}

</script>
</head>
<body>
<div align="center">
	<div class="divBox">Struts 2 - Making Bussiness Intelligence </div>
	<s:tabbedPanel id="Tabs" cssStyle="font-family: Verdana; font-wheght:bold; width: 70%">
	
		<s:url id="purchasesUrl" action="Purchases"/>
		<s:url id="salesUrl" action="Sales!list6monthSales">
			<s:param name="iniDate">01/10/2020</s:param>
			<s:param name="endDate">01/01/2021</s:param>			
		</s:url>
	
		<s:div label="Purchases" theme="ajax" href="%{purchasesUrl}" refreshOnShow="true" executeScripts="true" 
			cssStyle="display:none; font-weight: normal; padding: 10px; text-align: left; "></s:div>
			
		<s:div label="Sales" id="salesDiv" theme="ajax" href="%{salesUrl}" refreshOnShow="true" executeScripts="true" 
			cssStyle="display:none; font-weight: normal; padding: 10px; text-align: left; "></s:div>
	
	</s:tabbedPanel>

</div>

</body>
</html>