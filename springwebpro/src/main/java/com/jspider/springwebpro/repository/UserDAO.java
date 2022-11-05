package com.jspider.springwebpro.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jspider.springwebpro.Model.LoginDto;
import com.jspider.springwebpro.Model.User;

@Repository
public class UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	public UserDAO() {
		System.out.println("Repository object is Created");
	}

	public void addUserDetails(User user) {
		System.out.println("Repository Exeution");

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(user);

		transaction.commit();

	}

	public User getByMail(String email) {

		System.out.println();

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from User where email=:mail");

		query.setParameter("mail", email);

		return (User) query.uniqueResult();
	}

//	public boolean getByEmailandPass(User user) {
//
//		User ud = getByMail(user.getEmail());
//
//		System.out.println("from mail DB " + ud);
//
//		System.out.println("User: " + user);
//
//		if (ud.getPassword().equals(ud.getPassword()))
//			return true;
//
//		return false;
//
//	}
	
	
	public User getByEmailAndPwd(String email, String password)
	{
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User where email=:mail and password=:pwd");
		query.setParameter("mail", email);
		query.setParameter("pwd", password);
		return (User) query.uniqueResult();
	}
	
	public List<User> findAll()
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User");
		return query.list();
		
	}

}
