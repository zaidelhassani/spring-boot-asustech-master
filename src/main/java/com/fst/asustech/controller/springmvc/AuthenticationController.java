//package com.fst.asustech.controller.springmvc;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class AuthenticationController {
//
//	@GetMapping("/login")
//	public String login() {
//		return "WEB-INF/authentication/login.xhtml";
//	}
//	
//	@GetMapping("/logout")
//	public String logout(HttpServletRequest request, HttpServletResponse response) {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//	    if (auth != null){    
//	        new SecurityContextLogoutHandler().logout(request, response, auth);
//	    }
//		return "redirect:WEB-INF/authentication/login.xhtml?logout";
//	}
//
//	@GetMapping("/access-denied")
//	public String accessDenied() {
//		return "WEB-INF/error/error-403.xhtml";
//	}
//}
