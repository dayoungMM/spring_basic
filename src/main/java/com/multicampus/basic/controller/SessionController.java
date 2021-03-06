package com.multicampus.basic.controller;

import javax.servlet.http.HttpSession;

//import org.apache.catalina.realm.JNDIRealm.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.multicampus.basic.model.User;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(User user, HttpSession session) {
		session.setAttribute("user", user);
		return "redirect:/main";
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}