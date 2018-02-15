package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

	@GetMapping("/all-users")
	public String showAllUsers(Model model) {
		List<String> users = new ArrayList<>();
		users.add("Jonh Doe");
		users.add("Petro Petrov");
		users.add("Somebody else");
		
		model.addAttribute("users", users);
		return "users/all-users";
	}
	
	@GetMapping("/all-users/{oneUser}")
	public String showUser(Model model, @PathVariable String oneUser) {
		
		model.addAttribute("oneUser", oneUser);
		return "users/user";
	}
	
	
}
