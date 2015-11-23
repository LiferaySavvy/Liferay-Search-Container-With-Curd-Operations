package com.meera;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.meera.service.model.Person;
import com.meera.service.model.impl.PersonImpl;
import com.meera.service.service.PersonLocalServiceUtil;

/**
 * Portlet implementation class PersonCurd
 */
public class PersonCurd extends MVCPortlet {
	public void addPerson(ActionRequest actionRequest, ActionResponse res)
	throws IOException, PortletException, PortalException, SystemException {
		System.out.println("addPerson action");
		
		String cmd=ParamUtil.getString(actionRequest,"cmd");
		String redirectUrl=ParamUtil.getString(actionRequest,"redirectUrl");
		String personName=ParamUtil.getString(actionRequest,"personName");
		String personAddress=ParamUtil.getString(actionRequest,"personAddress");
		Person person=null;
		if(cmd!=null&&cmd.equals("Add")){
			System.out.println(" Add Method");
			long personId=CounterLocalServiceUtil.increment(Person.class.getName());
			person=PersonLocalServiceUtil.createPerson(personId);
			person.setPersonName(personName);
			person.setPersonAddress(personAddress);
			PersonLocalServiceUtil.addPerson(person);
		}
		if(cmd!=null&&cmd.equals("Update")){
			System.out.println(" Update ");
			long id=ParamUtil.getLong(actionRequest,"personId");
			person=PersonLocalServiceUtil.getPerson(id);
			person.setPersonName(personName);
			person.setPersonAddress(personAddress);
			PersonLocalServiceUtil.updatePerson(person);
		}
		
		res.sendRedirect(redirectUrl);
	}
	

}
