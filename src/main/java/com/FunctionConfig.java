package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = InsertionFunction.class)
public class FunctionConfig {
	@Bean
	public UnsortedNums getUnsortedNums() {
		
		UnsortedNums uNum = null; 
		return uNum;
		
	}
	

}
