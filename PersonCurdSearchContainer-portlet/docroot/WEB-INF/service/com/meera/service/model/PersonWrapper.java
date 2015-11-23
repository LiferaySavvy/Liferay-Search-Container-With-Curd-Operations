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

/**
 * <p>
 * This class is a wrapper for {@link Person}.
 * </p>
 *
 * @author    meera
 * @see       Person
 * @generated
 */
public class PersonWrapper implements Person {
	public PersonWrapper(Person person) {
		_person = person;
	}

	public long getPrimaryKey() {
		return _person.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_person.setPrimaryKey(pk);
	}

	public long getPersonId() {
		return _person.getPersonId();
	}

	public void setPersonId(long personId) {
		_person.setPersonId(personId);
	}

	public java.lang.String getPersonName() {
		return _person.getPersonName();
	}

	public void setPersonName(java.lang.String personName) {
		_person.setPersonName(personName);
	}

	public java.lang.String getPersonAddress() {
		return _person.getPersonAddress();
	}

	public void setPersonAddress(java.lang.String personAddress) {
		_person.setPersonAddress(personAddress);
	}

	public Person toEscapedModel() {
		return _person.toEscapedModel();
	}

	public boolean isNew() {
		return _person.isNew();
	}

	public void setNew(boolean n) {
		_person.setNew(n);
	}

	public boolean isCachedModel() {
		return _person.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_person.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _person.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_person.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _person.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _person.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_person.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _person.clone();
	}

	public int compareTo(Person person) {
		return _person.compareTo(person);
	}

	public int hashCode() {
		return _person.hashCode();
	}

	public java.lang.String toString() {
		return _person.toString();
	}

	public java.lang.String toXmlString() {
		return _person.toXmlString();
	}

	public Person getWrappedPerson() {
		return _person;
	}

	private Person _person;
}