package com.ashmitagarwal.e_commerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ashmitagarwal.e_commerce.api.UserDetailsDao;
import com.ashmitagarwal.e_commerce.models.UserDetails;
import com.ashmitagarwal.e_commerce.models.UserLoginDetails;
import com.ashmitagarwal.e_commerce.models.UserRegistrationDetails;

@Controller
@SessionAttributes("username")
public class HomeController {
	
	@RequestMapping("/")
	public String homePage(Model model) {
		
		String username =  (String) model.getAttribute("username");
		if(username != null)
		{
			System.out.println("Username found in session: " + username);
			return "UserLoginSuccessPage";
		}
		return "HomePage";
	}
	
	@GetMapping("/userLogin")
	public String userLogin(Model model) {
		
		String username =  (String) model.getAttribute("username");
		if(username != null)
		{
			System.out.println("Username found in session: " + username);
			return "UserLoginSuccessPage";
		}
		return "UserLoginPage";
	}
	
	@GetMapping("/userRegistration")
	public String userRegistration(Model model) {
		
		String username =  (String) model.getAttribute("username");
		if(username != null)
		{
			System.out.println("Username found in session: " + username);
			return "UserLoginSuccessPage";
		}
		return "UserRegistrationPage";
	}
	
	@PostMapping("/userLogin")
	public String userLogin(UserLoginDetails userLoginDetails, Model model) {
		String username = userLoginDetails.getUsername();
		String password = userLoginDetails.getPassword();
		
		System.out.println(username);
		System.out.println(password);
		
		// Get user details from database to authenticate user login
		List<UserDetails> allUserDetails = userDetailsDao.loadAllUserDetails();
		System.out.println(allUserDetails);
		if(!username.isBlank() && !password.isBlank())
		{
			for(UserDetails userDetails : allUserDetails)
			{
				if(userDetails.getUsername().equals(username) && userDetails.getPassword().equals(password))
				{
					model.addAttribute("username", username);
					return "UserLoginSuccessPage";
				}
			}
		}
		return "UserLoginFailedPage";
	}
	
	@PostMapping("/userRegistration")
	public String userRegistration(UserRegistrationDetails userRegistrationDetails, Model model) {
		
		String fname = userRegistrationDetails.getFirstname();
		String mname = userRegistrationDetails.getMiddlename();
		String lname = userRegistrationDetails.getLastname();
		String username = userRegistrationDetails.getUsername();
		String email = userRegistrationDetails.getEmail();
		String password = userRegistrationDetails.getPassword();
		
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(lname);
		System.out.println(username);
		System.out.println(email);
		System.out.println(password);
		
		if(!fname.isBlank() && !username.isBlank() && !email.isBlank() && !password.isBlank())
		{
			model.addAttribute("username", username);
			int rowsAffected = userDetailsDao.saveUserDetails(userRegistrationDetails);
			if(rowsAffected > 0)
			{
				System.out.println("User data is saved : " + rowsAffected);
				return "UserRegistrationSuccessPage";
			}
		}
		return "UserRegistrationFailedPage";
	}
	
	@RequestMapping("/userLogout")
	public String userLogout(Model model, SessionStatus status) {
		
		String username =  (String) model.getAttribute("username");
		if(username != null)
		{
			System.out.println("Username found in session: " + username);
			status.setComplete();
		}
		return "UserLoginPage";
	}
	
	@Autowired
	UserDetailsDao userDetailsDao;
}
