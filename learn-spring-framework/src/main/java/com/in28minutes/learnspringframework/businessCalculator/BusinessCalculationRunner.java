package com.in28minutes.learnspringframework.businessCalculator;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationRunner {
	
	DataService dataService;
	
	@Autowired
	BusinessCalculationRunner(DataService dataService)
	{
		this.dataService = dataService;
	}
	
	public int findMax()
	{
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
