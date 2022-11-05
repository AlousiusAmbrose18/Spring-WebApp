package com.jspider.springwebpro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.springwebpro.Model.AppConstants;
import com.jspider.springwebpro.Model.User;
import com.jspider.springwebpro.repository.UserDAO;
import com.jspider.springwebpro.service.UserService;

//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = AppConstants.FORWORD_SLASH)
public class CommonController {
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private UserDAO userDAO ;
	
	
	@GetMapping(value=AppConstants.FIND_ALL)
	public @ResponseBody List<User> findAll()
	{
		return userService.findAll();
		
	}
	
	@PostMapping(value="adduser")
	public void addUser(@RequestBody User user)
	{		
		userService.addUser(user);
	}
	
	@GetMapping(value="/Email/{emailId}")
	public User findByEmail(@PathVariable("emailId") String email) 
	{
		return userDAO.getByMail(email);
		
	}
}
