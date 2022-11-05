package com.jspider.springwebpro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.jspider.springwebpro.Model.AppConstants;
import com.jspider.springwebpro.Model.LoginDto;
import com.jspider.springwebpro.Model.User;
import com.jspider.springwebpro.repository.UserDAO;
import com.jspider.springwebpro.service.UserService;

@RequestMapping(value = AppConstants.FORWORD_SLASH)
@Controller
public class AuthController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserDAO userDao;
	
	

	public AuthController() {
		System.out.println("AuthController object is Created");
	}
	
	
	@PostMapping(value = AppConstants.ADD_USER)
	//@RequestMapping(value = AppConstants.ADD_USER)
	public ModelAndView addUser(User user) {
		System.out.println("AuthController Exeution");

		userService.addUser(user);

		return new ModelAndView("login.jsp");
	}

//	@RequestMapping(value = AppConstants.VERIFY_USER)
//	public ModelAndView verifyUser(User user) {
//
//		if (userDao.getByEmailandPass(user)) {
//			return new ModelAndView("home.jsp");
//		}
//
//		return new ModelAndView("login.jsp");
//	}
	
	@PostMapping(value=AppConstants.VERIFY_USER)
//	@RequestMapping(value=AppConstants.VERIFY_USER, method=RequestMethod.POST)
	public ModelAndView verifyUser(LoginDto login)
	{
		User user= userService.VerifyUSer(login);
		
		if(user!=null)
		{
			return new ModelAndView("home.jsp");
		}
		else {
		return new ModelAndView("login.jsp");
		}
		
	}
}
