<%@ taglib prefix="s" uri="/struts-tags" %>
<link href="main.css" rel="stylesheet" type="text/css">
<table align="center">
	<tr>
		<td>
			<table cellpadding="5" border="1" class="blockTable">
				<tr>
					<th colspan="6" align="center" >HelpSpot Sales - Last 9 Months (Thousand of Dollars)</th>
				</tr>
			</table>
			<table width="400px" cellpadding="0" align="center" >
				<tr>
					<s:iterator value="salesMap">
						<td>
							<table cellpadding="5" align="center"  width="100%" class="blockTable" cellspacing="0">
								<tr>
									<th><s:property value="value.month"/></th>
								</tr>
								<tr>
									<th><s:property value="value.total"/></th>
								</tr>
							</table>						
						</td>					
					</s:iterator>
				</tr>			
			</table>
		</td>
	</tr>
	<tr>
		<td>
			<img src="images/6monthsales.jpg"/>
		</td>
	</tr>
</table>