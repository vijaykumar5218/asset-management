package com.workz.thor.assetmanagement.controller;

import java.util.Base64;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.workz.thor.assetmanagement.dto.EmployeeDTO;
import com.workz.thor.assetmanagement.entity.EmployeeEntity;
import com.workz.thor.assetmanagement.model.services.EmployeeService;

@Controller
@RequestMapping("/")
public class LandingPage {

	@Autowired
	private EmployeeService services;

	private static final Logger logger = Logger.getLogger(LandingPage.class);

	public LandingPage() {
		System.out.println("invoked :" + this.getClass().getCanonicalName());
		logger.info("INFO : invoked " + this.getClass().getCanonicalName());
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView onLogin() {
		logger.info("INFO : invoked onLogIn method");
		System.out.println("INFO : invoked onLogIn method");
		ModelAndView modelAndView = new ModelAndView("homePage");

		// Encryption and decryption of code

		String str = "vijay123";
		System.out.println("String is :" + str);

		String base64FormatString = Base64.getEncoder().encodeToString(str.getBytes());
		System.out.println("Encoded String is :" + base64FormatString);

		byte[] actualStringByte = Base64.getDecoder().decode(base64FormatString);
		String actualString = new String(actualStringByte);
		System.out.println("byte code :" + actualStringByte);
		System.out.println("Actual String :" + actualString);

		return modelAndView;
	}

	@RequestMapping(value = "submit", method = RequestMethod.POST)
	public ModelAndView onSubmit(EmployeeDTO dto, ModelMap map) {
		logger.info("INFO : invoked submit method");
		System.out.println("INFO : invoked submit method");

		System.out.println("Dto in onSubmit()...." + dto);
		EmployeeEntity entity = services.verifyEmailAndPassword(dto, map);
		System.out.println("entity in onSubmit().." + entity);
		if (entity != null) {
			System.out.println("role is: " + entity.getEmpRole());

			if (entity.getEmpRole().equals("USER") == true) {
				ModelAndView modelAndView = new ModelAndView("userpage");

				return modelAndView;
			} else {
				ModelAndView modelAndView = new ModelAndView("adminpage");

				return modelAndView;
			}
		}
		System.out.println(entity);
		return new ModelAndView("homePage");
	}

}
