package com.jspider.springwebpro.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springwebpro.Model.LoginDto;
import com.jspider.springwebpro.Model.User;
import com.jspider.springwebpro.repository.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDao;
	
	
	public UserService() {
		System.out.println("Service object is Created");
	}
	
	
	public void addUser(User user) {
		
		System.out.println("Service Exeution");
		
		userDao.addUserDetails(user);
	}
	
	public User VerifyUSer(LoginDto login)
	{
		return userDao.getByEmailAndPwd(login.getEmail(), login.getPassword());
	}
	
	public List<User> findAll()
	{
		return userDao.findAll();
		
	}

}
