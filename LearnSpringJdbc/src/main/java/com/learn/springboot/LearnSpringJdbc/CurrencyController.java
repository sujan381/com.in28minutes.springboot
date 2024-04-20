package com.learn.springboot.LearnSpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	private Currency currency;
	
	@RequestMapping("/currency")
	public Currency printValues()
	{
		return currency;
	}
}
