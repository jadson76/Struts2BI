<%@ taglib prefix="s" uri="/struts-tags" %>
<link href="main.css" rel="stylesheet" type="text/css">
<table border="0" align="center">
	<tr>
		<td style="padding-bottom: 10px; padding-right: 20px;">
			<table cellspacing="0" cellpadding="5" border="1" class="blockTable">
				<tr>
					<th colspan="4" align="center">Ultimo Mes</th>
				</tr>
				<tr>
					<th>Num. Pedido</th>
					<th>Data</th>
					<th>Item</th>
					<th>Total</th>
				</tr>
				<s:iterator value="lastMonth">
					<tr>
						<td><s:property value="purchaseNumber"/></td>
						<td><s:date name="date" format="dd/mm/yyyy"/></td>
						<td><s:property value="item"/></td>
						<td><s:property value="total"/></td>						
					</tr>				
				
				</s:iterator>
			
			</table>
		</td>
		<td style="padding-bottom: 10px;">
			<table cellspacing="0" cellpadding="5" border="1" class="blockTable">
				<tr>
					<th colspan="4" align="center">Mes Atual</th>
				</tr>
				<tr>
					<th>Num. Pedido</th>
					<th>Data</th>
					<th>Item</th>
					<th>Total</th>
				</tr>
				<s:iterator value="actualMonth">
					<tr>
						<td><s:property value="purchaseNumber"/></td>
						<td><s:date name="date" format="dd/mm/yyyy"/></td>
						<td><s:property value="item"/></td>
						<td><s:property value="total"/></td>						
					</tr>				
				
				</s:iterator>
			
			</table>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<table cellspacing="0" cellpadding="5" border="1" class="blockTable">
				<tr>
					<th colspan="4" align="center">Ano</th>
				</tr>
				<tr>
					<th>Num. Pedido</th>
					<th>Mes</th>
					<th>Item</th>
					<th>Total</th>
				</tr>
				<s:iterator value="year">
					<tr>
						<td><s:property value="purchaseNumber"/></td>
						<td><s:date name="date" format="dd/mm/yyyy"/></td>
						<td><s:property value="item"/></td>
						<td><s:property value="total"/></td>						
					</tr>				
				
				</s:iterator>
					
			</table>
		</td>		
	</tr>

</table>