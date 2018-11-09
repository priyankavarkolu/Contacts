package com.agilecrm.service;


import java.util.List;

import com.agilecrm.model.Contact;

public interface ContactService {

	public boolean insertContact(Contact contact);
	public boolean updateContact(Contact contact);
	public boolean deleteContact(Contact contact);
	 public Contact getById(String email);
	    public List<Contact> displayAll();
}
