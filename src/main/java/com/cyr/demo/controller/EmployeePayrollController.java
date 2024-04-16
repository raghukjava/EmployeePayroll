package com.cyr.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeePayrollController {

	
	@RequestMapping(value = "/hello")
	public String index() {
		return "Payslip is generated";
	}

}
