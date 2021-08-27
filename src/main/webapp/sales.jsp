<%@ taglib prefix="s" uri="/struts-tags" %>
<link href="main.css" rel="stylesheet" type="text/css">
	<div align="center">
		<div align="center" style="border: 1px solid black; padding-top: 10px; width: 40%;" >
			<s:form action="Sales!list6monthSales">
				<table>
					<s:datetimepicker label="Data Inicial" name="iniDate" displayFormat="dd/MM/yyyy"  />
					<s:datetimepicker label="Data Final" name="endDate" displayFormat="dd/MM/yyyy" />
					<s:submit targets="salesDiv" value="refresh" theme="ajax" />
				</table>		
			</s:form>					
		</div>
	</div>
	<div style="padding-bottom: 10px">
			<table cellpadding="5" width="400px" align="center" cellspacing="0" class="blockTable">
				<tr>
					<th colspan="6" align="center" >HelpSpot Sales - Last 9 Months (Thousand of Dollars)</th>
				</tr>
			</table>
			<table width="400px" cellpadding="0" cellspacing="0" align="center" >
				<tr>
					<s:iterator value="salesMap">
						<td>
							<table cellpadding="5" width="100%" class="blockTable" cellspacing="0">
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
		<div align="center">
			<img src="${pageContext.request.contextPath}/Sales!createChart.action?iniDate=${iniDate}&endDate=${endDate}"/>
		</div>	
	</div>