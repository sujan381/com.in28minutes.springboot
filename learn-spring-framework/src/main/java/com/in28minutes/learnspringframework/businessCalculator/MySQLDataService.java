package com.in28minutes.learnspringframework.businessCalculator;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {11,22,33,44,55};
	}

}
