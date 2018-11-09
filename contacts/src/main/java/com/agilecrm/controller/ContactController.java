package com.agilecrm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agilecrm.model.Contact;
import com.agilecrm.serviceimpl.ContactServiceimpl;


public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public ContactController() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("get");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("post");
		
		String action=request.getParameter("action");
		
		if(action.equals("addContact"))
		{
			addContact(request, response);
		}
		
		if(action.equals("updateContact"))
		{
			updateContacts(request, response);
		}
		if(action.equals("deletContacts"))
		{
			deletContacts(request, response);
		}
		if(action.equals("displyAll"))
		{
			displayContacts(request, response);
		}
		if(action.equals("getbyid"))
		{
			getByid(request, response);
		}
		
	/*	Contact contact=new Contact();
		//contact.setId(Integer.parseInt(request.getParameter("id")));
		contact.setFname(request.getParameter("fname"));
		System.out.println(request.getParameter("fname"));
		contact.setLname(request.getParameter("lname"));
		contact.setEmail(request.getParameter("email"));
		contact.setCreatedBy(request.getParameter("createdBy"));
		ContactServiceimpl d=new ContactServiceimpl();
		boolean status;
		status=d.insertContact(contact);
		if(status)
			System.out.println("updated");
		else
		System.out.println("not");
		*/
	
	}

	private void getByid(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ContactServiceimpl d=new ContactServiceimpl();
		Contact contact=new Contact();
		try {

		PrintWriter out=response.getWriter();

		out.println(d.getById(request.getParameter("email")));
		

		} catch(Exception e) {
		request.setAttribute("userRegistrationStatus", "oops something went wrong, try again !!! ");
		}
		System.out.println("this is post method");
	}

	private void displayContacts(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ContactServiceimpl d=new ContactServiceimpl();
		Contact contact=new Contact();
		try {

		PrintWriter out=response.getWriter();

		out.println(d.displayAll());

		} catch(Exception e) {
		request.setAttribute("userRegistrationStatus", "oops something went wrong, try again !!! ");
		}
		System.out.println("this is post method");
	}

	private void deletContacts(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Contact contact=new Contact();
		contact.setId(Integer.parseInt(request.getParameter("id")));
		ContactServiceimpl d=new ContactServiceimpl();
		boolean status;
		status=d.deleteContact(contact);
		if(status)
			System.out.println("deleted");
		else
		System.out.println("not");
	}


	private void updateContacts(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Contact contact=new Contact();
		contact.setId(Integer.parseInt(request.getParameter("id")));
		contact.setEmail(request.getParameter("email"));
		ContactServiceimpl d=new ContactServiceimpl();
		boolean status;
		status=d.updateContact(contact);
		if(status)
			System.out.println("updated");
		else
		System.out.println("not");
	}

	private void addContact(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Contact contact=new Contact();
		//contact.setId(Integer.parseInt(request.getParameter("id")));
		contact.setFname(request.getParameter("fname"));
		System.out.println(request.getParameter("fname"));
		contact.setLname(request.getParameter("lname"));
		contact.setEmail(request.getParameter("email"));
		contact.setCreatedBy(request.getParameter("createdBy"));
		ContactServiceimpl d=new ContactServiceimpl();
		boolean status;
		status=d.insertContact(contact);
		if(status)
			System.out.println("updated");
		else
		System.out.println("not");
		
	}

}