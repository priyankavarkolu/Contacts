package com.agilecrm.serviceimpl;



import java.util.List;

import com.agilecrm.implDao.Contactdaoimpli;
import com.agilecrm.model.Contact;
import com.agilecrm.service.ContactService;

public class ContactServiceimpl implements ContactService {

	Contactdaoimpli c=new Contactdaoimpli();
	public boolean insertContact(Contact contact) {
		
		return c.insertContact(contact);
	}

	public boolean updateContact(Contact contact) {
		
		return c.updateContact(contact);
	}

	public boolean deleteContact(Contact contact) {
	
		return  c.deleteContact(contact);
	}

	public Contact getById(String email) {
		
		return c.getById(email);
	}

	public List<Contact> displayAll() {
		
		return c.displayAll();
	}

	
	

	
	

}

