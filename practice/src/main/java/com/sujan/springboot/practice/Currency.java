package com.sujan.springboot.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Currency {
	@Autowired
	CurrencyController control;
	@RequestMapping("/currency")
	public CurrencyController control()
	{
		return control;
		
	}
}
