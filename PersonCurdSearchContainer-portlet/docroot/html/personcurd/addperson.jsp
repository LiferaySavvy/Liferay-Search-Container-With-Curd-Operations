<%@page import="com.meera.service.service.PersonLocalServiceUtil"%>
<%@page import="com.meera.service.model.Person"%>
<%@ include file="init.jsp" %>

<%
String backURL = ParamUtil.getString(request, "redirect");
portletDisplay.setURLBack(backURL);
long personId = ParamUtil.getLong(request, "personId");
Person person=null;
String command="Add";
if(personId!=0){
person=PersonLocalServiceUtil.getPerson(personId);	
command="Update";
}

%>
<portlet:actionURL var="addPersonActionURL" windowState="NORMAL">
	<portlet:param name="javax.portlet.action" value="addPerson" />
	<portlet:param name="redirectUrl" value="<%=backURL%>" />
	<portlet:param name="cmd" value="<%=command%>" />
</portlet:actionURL>

<aui:form action="<%=addPersonActionURL.toString() %>" method="POST" name="oneClickSiteForm" id="oneClickSiteForm">
<aui:layout>
<aui:column>
<%if(person!=null){ %>
<aui:input name="personId" label="Person Id" value='<%=person!=null?person.getPersonId():"" %>'></aui:input>
<%} %>
<aui:input name="personName" label="Person Name" value='<%=person!=null?person.getPersonName():"" %>'></aui:input>
<aui:input name="personAddress" label="Person Address" value='<%=person!=null?person.getPersonAddress():"" %>'></aui:input>
<aui:button type="submit" value='<%=person!=null?"Update":"Add" %>'></aui:button>
</aui:column>
</aui:layout>	
</aui:form>
<div class="separator"></div>
<a href="<%=backURL.toString()%>"> Back</a>