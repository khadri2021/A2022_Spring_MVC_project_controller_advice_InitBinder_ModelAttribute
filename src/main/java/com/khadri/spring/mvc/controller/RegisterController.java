package com.khadri.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khadri.spring.mvc.form.AdditionalForm;
import com.khadri.spring.mvc.form.RegisterForm;

@Controller
public class RegisterController {

	@RequestMapping("/")
	public String homePage(@ModelAttribute("registerForm") RegisterForm registerForm) {
		System.out.println("homePage");
		return "home";
	}

	@PostMapping("/register")
	public String doRegister(@Valid @ModelAttribute("registerForm") RegisterForm registerForm, BindingResult result,
			@ModelAttribute("additionalForm") AdditionalForm form) {
		System.out.println("doRegister");
		System.out.println("name " + "#" + registerForm.getName() + "#");

		System.out.println("Additional Form " + form.getLocation());
		
		if (result.hasErrors()) {
			System.out.println("Errors");
			return "home";
		}

		return "success";
	}

}
