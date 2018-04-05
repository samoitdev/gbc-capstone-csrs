package com.groupthink.csr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groupthink.csr.entity.admin.User;
import com.groupthink.csr.service.UserService;

@Controller
@RequestMapping("admin/users")
public class AdminUserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String showUsers(Model model) {
		
		// get customers from the service
		List<User> users = userService.getUsers();
						
		// add the customers to the model
		model.addAttribute("users", users);
		
		return "users";
	}
	
	
	
}
