package com.khadri.spring.mvc.data.init.binder;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalInitBinder {

	@InitBinder
	public void dataEditing(WebDataBinder dataBinder) {
		System.out.println("Init Binder method");

		// format date using custom editor
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor = new CustomDateEditor(dateFormat, false);
		dataBinder.registerCustomEditor(Date.class, "date", customDateEditor);

		// ignoring field
		dataBinder.setDisallowedFields("ctc");

		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, "name", editor);
	}

}
