package com.khadri.spring.mvc.data.init.binder;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.khadri.spring.mvc.form.AdditionalForm;

@ControllerAdvice
public class GlobalModelAttribute {

	@ModelAttribute("additionalForm")
	public AdditionalForm enrichData() {
		System.out.println("Entered into Additional Form Model Attribute data");
		AdditionalForm form = new AdditionalForm();
		form.setLocation("KADIRI");
		return form;
	}

}
