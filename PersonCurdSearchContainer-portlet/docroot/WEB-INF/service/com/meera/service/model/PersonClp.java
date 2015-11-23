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

package com.meera.service.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author meera
 */
public class PersonClp extends BaseModelImpl<Person> implements Person {
	public PersonClp() {
	}

	public long getPrimaryKey() {
		return _personId;
	}

	public void setPrimaryKey(long pk) {
		setPersonId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_personId);
	}

	public long getPersonId() {
		return _personId;
	}

	public void setPersonId(long personId) {
		_personId = personId;
	}

	public String getPersonName() {
		return _personName;
	}

	public void setPersonName(String personName) {
		_personName = personName;
	}

	public String getPersonAddress() {
		return _personAddress;
	}

	public void setPersonAddress(String personAddress) {
		_personAddress = personAddress;
	}

	public Person toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),
				new Class[] { Person.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		PersonClp clone = new PersonClp();

		clone.setPersonId(getPersonId());
		clone.setPersonName(getPersonName());
		clone.setPersonAddress(getPersonAddress());

		return clone;
	}

	public int compareTo(Person person) {
		long pk = person.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PersonClp person = null;

		try {
			person = (PersonClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = person.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{personId=");
		sb.append(getPersonId());
		sb.append(", personName=");
		sb.append(getPersonName());
		sb.append(", personAddress=");
		sb.append(getPersonAddress());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.meera.service.model.Person");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>personId</column-name><column-value><![CDATA[");
		sb.append(getPersonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personName</column-name><column-value><![CDATA[");
		sb.append(getPersonName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personAddress</column-name><column-value><![CDATA[");
		sb.append(getPersonAddress());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _personId;
	private String _personName;
	private String _personAddress;
}