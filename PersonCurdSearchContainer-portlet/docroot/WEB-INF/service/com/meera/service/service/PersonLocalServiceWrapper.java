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

package com.meera.service.service;

/**
 * <p>
 * This class is a wrapper for {@link PersonLocalService}.
 * </p>
 *
 * @author    meera
 * @see       PersonLocalService
 * @generated
 */
public class PersonLocalServiceWrapper implements PersonLocalService {
	public PersonLocalServiceWrapper(PersonLocalService personLocalService) {
		_personLocalService = personLocalService;
	}

	/**
	* Adds the person to the database. Also notifies the appropriate model listeners.
	*
	* @param person the person to add
	* @return the person that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.service.model.Person addPerson(
		com.meera.service.model.Person person)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.addPerson(person);
	}

	/**
	* Creates a new person with the primary key. Does not add the person to the database.
	*
	* @param personId the primary key for the new person
	* @return the new person
	*/
	public com.meera.service.model.Person createPerson(long personId) {
		return _personLocalService.createPerson(personId);
	}

	/**
	* Deletes the person with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param personId the primary key of the person to delete
	* @throws PortalException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deletePerson(long personId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_personLocalService.deletePerson(personId);
	}

	/**
	* Deletes the person from the database. Also notifies the appropriate model listeners.
	*
	* @param person the person to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deletePerson(com.meera.service.model.Person person)
		throws com.liferay.portal.kernel.exception.SystemException {
		_personLocalService.deletePerson(person);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the person with the primary key.
	*
	* @param personId the primary key of the person to get
	* @return the person
	* @throws PortalException if a person with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.service.model.Person getPerson(long personId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.getPerson(personId);
	}

	/**
	* Gets a range of all the persons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of persons to return
	* @param end the upper bound of the range of persons to return (not inclusive)
	* @return the range of persons
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.meera.service.model.Person> getPersons(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.getPersons(start, end);
	}

	/**
	* Gets the number of persons.
	*
	* @return the number of persons
	* @throws SystemException if a system exception occurred
	*/
	public int getPersonsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.getPersonsCount();
	}

	/**
	* Updates the person in the database. Also notifies the appropriate model listeners.
	*
	* @param person the person to update
	* @return the person that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.service.model.Person updatePerson(
		com.meera.service.model.Person person)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.updatePerson(person);
	}

	/**
	* Updates the person in the database. Also notifies the appropriate model listeners.
	*
	* @param person the person to update
	* @param merge whether to merge the person with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the person that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.meera.service.model.Person updatePerson(
		com.meera.service.model.Person person, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _personLocalService.updatePerson(person, merge);
	}

	public PersonLocalService getWrappedPersonLocalService() {
		return _personLocalService;
	}

	private PersonLocalService _personLocalService;
}