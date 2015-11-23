<%
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ include file="init.jsp" %>
<%@ page import="com.meera.service.service.PersonLocalServiceUtil" %>
<%@ page import="com.meera.service.model.Person" %>
<portlet:renderURL var="addNewPersonURL" windowState="NORMAL">
			<portlet:param name="jspPage" value="/html/personcurd/addperson.jsp" />
			<portlet:param name="redirect" value="<%=currentURL %>" />
</portlet:renderURL>
<%
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("jspPage", "/html/personcurd/view.jsp");
%>

<liferay-ui:search-container
	delta="<%=2%>"
	headerNames="Person Id,person Name,Person Address"
	iteratorURL="<%= portletURL %>"
>
	<liferay-ui:search-container-results>

		<%
		results = PersonLocalServiceUtil.getPersons(searchContainer.getStart(), searchContainer.getEnd());
		total = PersonLocalServiceUtil.getPersonsCount();
		pageContext.setAttribute("results", results);
		pageContext.setAttribute("total", total);
		%>

	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row
		className="com.meera.service.model.Person"
		escapedModel="<%= true %>"
		keyProperty="personId"
		modelVar="curPerson"
	>
		<liferay-portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" varImpl="rowURL">
			<portlet:param name="jspPage" value="/html/personcurd/addperson.jsp" />
			<portlet:param name="redirect" value="<%=currentURL %>" />
			<portlet:param name="personId" value="<%= String.valueOf(curPerson.getPersonId()) %>" />
		</liferay-portlet:renderURL>

		<liferay-ui:search-container-row-parameter
			name="rowURL"
			value="<%=rowURL.toString() %>"
		/>
		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="Person Id"
			property="personId"
		/>
		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="Person Name"
			property="personName"
		/>

		<liferay-ui:search-container-column-text
			href="<%=rowURL %>"
			name="Person Address"
			property="personAddress"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<div class="separator"></div>
<aui:layout>
<aui:column><a href="<%=addNewPersonURL.toString()%>">Add New Person</a></aui:column>
</aui:layout>
<a href="<portlet:renderURL />">&laquo; Back</a>