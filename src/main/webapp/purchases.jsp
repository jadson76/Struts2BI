<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<div align="center">
	<div style="width: 85%;">
		<div align="left" style="display: block; float: left;">
			<display:table id="lastMonth" name="sessionScope.lastMonthPurchases"
					class="blockTable" sort="list" requestURI="index.jsp"
					cellpadding="5" cellspacing="0" uid="item">
					<display:caption class="caption">Last Month</display:caption>
					<display:column sortProperty="purchaseNumber" title="Order Num" sortable="true" headerClass="sortTitle">
						<a href="javascript:alert('${item.item }');">${item.purchaseNumber}</a>
					</display:column>
					<display:column property="total" title="Total"></display:column>
			
			</display:table>
		</div>
		<div align="right">
			<display:table id="actualMonth" name="sessionScope.actualMonthPurchases"
					class="blockTable" sort="list" requestURI="index.jsp"
					cellpadding="5" cellspacing="0" uid="item">
					<display:caption class="caption">Actual Month</display:caption>
					<display:column sortProperty="purchaseNumber" title="Order Num" sortable="true" headerClass="sortTitle">
						<a href="javascript:alert('${item.item }');">${item.purchaseNumber}</a>
					</display:column>
					<display:column property="total" title="Total"></display:column>			
			</display:table>
		
		</div>
		<div align="center" style="margin-top: 20px;">
			<display:table id="year" name="sessionScope.yearPurchases"
					class="blockTable" sort="list" requestURI="index.jsp"
					cellpadding="5" cellspacing="0" uid="item">
					<display:caption class="caption">Year</display:caption>
					<display:column sortProperty="purchaseNumber" title="Order Num" sortable="true" headerClass="sortTitle">
						<a href="javascript:alert('${item.item }');">${item.purchaseNumber}</a>
					</display:column>
					<display:column property="total" title="Total"></display:column>
			
			</display:table>
		
		</div>
	
	</div>


</div>
