package com.agilecrm.implDao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.agilecrm.dao.Contactdao;
import com.agilecrm.model.Contact;
import com.agilecrm.util.DaoUtil;

public class Contactdaoimpli implements Contactdao{

	public boolean insertContact(Contact contact) {
		int i=0;
		try {
			
		Connection cn=new DaoUtil().getConnetion();
		 String sql="insert into contact(id,fname,lname,email,createdBy,createdDate,address,dob,isActive,updatedBy,updatedDate) values(?,?,?,?,?,?,?,?,?,?,?)";
		 PreparedStatement ps = cn.prepareStatement(sql);
		  ps.setInt(1,contact.getId());
		  ps.setString(2,contact.getFname());
		  ps.setString(3,contact.getLname());
		  ps.setString(4,contact.getEmail());
		  ps.setString(5,contact.getCreatedBy());
		  ps.setString(6,contact.getCreatedDate());
		  ps.setString(7,contact.getAddress());
		  ps.setString(8,contact.getDob());
		  ps.setBoolean(9,contact.getIsActive());
		  ps.setString(10,contact.getUpdatedBy());
		  ps.setString(11,contact.getUpdatedDate());
		 i=ps.executeUpdate();
		
		 
		} catch (Exception e) {

			e.printStackTrace();
}    return i>0;
	}

	public boolean updateContact(Contact contact) {
		int i=0;
		try {
			Connection connection=new DaoUtil().getConnetion();
			PreparedStatement ps;
			String query2="update contact set email=? where id=?";
			ps=connection.prepareStatement(query2);
			ps.setInt(2, contact.getId());
			ps.setString(1, contact.getEmail());
			i=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return i>0;
	}

	

	public boolean deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		int i=0;
		 String sql="delete from contact where id=?";
		try {
			
			Connection cn=new DaoUtil().getConnetion();
			 //String sql="delete from contact where id=?";
			 PreparedStatement ps = cn.prepareStatement(sql);
			  ps.setInt(1,contact.getId());
			  i=ps.executeUpdate();
			  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return i>0;
	
	}

	public Contact getById(String email) {
		
			// TODO Auto-generated method stub
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet resultSet = null;
			Contact contact = null;


			try {

			try {
			con = new DaoUtil().getConnetion();
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			ps = con.prepareStatement("select * from contact where email=?");
			ps.setString(1, email);
			resultSet = ps.executeQuery();
			if (resultSet.next()) {
			contact = new Contact();
			contact.setId(resultSet.getInt(1));
			contact.setFname(resultSet.getString(2));
			contact.setLname(resultSet.getString(3));
			contact.setEmail(resultSet.getString(4));
			//contact.setPhoneNumber(resultSet.getLong(5));
			//contact.setDob(resultSet.getDate(6));
			//contact.setAddress(resultSet.getString(7));
			//contact.setCreatedBy(resultSet.getInt(8));
			//contact.setCreatedDate(resultSet.getTime(9));
			//contact.setUpdatedBy(resultSet.getInt(10));
			/*contact.setUpdatedDate(resultSet.getTime(11));
			if (resultSet.getInt(12) != 0) {

			contact.setActive(true);
			} else {
			contact.setActive(false);
			}*/

			}

			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			return contact;



			// TODO Auto-generated method stub

			}


	public List<Contact> displayAll() {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Contact> contactsList = null;
		
		try {
			try {
				connection =new DaoUtil().getConnetion();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			preparedStatement = connection.prepareStatement("select * from contact");
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				contactsList = new ArrayList<Contact>();
				do {
					Contact contact = new Contact();
					contact.setId(resultSet.getInt(1));
					contact.setFname(resultSet.getString(2));
					contact.setLname(resultSet.getString(3));
					contact.setEmail(resultSet.getString(3));
					//contact.setNumber(resultSet.getLong(5));
					/*contact.setDob(resultSet.getDate(6));
					contact.setAddress(resultSet.getString(7));
					contact.setCreatedBy(resultSet.getInt(8));
					contact.setCreatedDate(resultSet.getTime(9));
					contact.setUpdatedBy(resultSet.getInt(10));
					contact.setUpdatedDate(resultSet.getTime(11));
					if (resultSet.getInt(12) != 0) {

						contact.setActive(true);
					} else {
						contact.setActive(false);
					}*/
					contactsList.add(contact);
				} while (resultSet.next());

			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return contactsList;
		
		// TODO Auto-generated method stub
		
	

		// TODO Auto-generated method stub
	
	}



		
	
}