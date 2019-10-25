package com;


import java.lang.reflect.Array;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


 
@SpringBootApplication
public class Runner implements CommandLineRunner{
	
	private static Logger courier = LoggerFactory.getLogger(Runner.class);
	
	@Autowired
	private InsertionFunction insertionFunction;
 
    public static void main(String[] args) {
    	 courier.info("App started!");
    	 
         SpringApplication app = new SpringApplication(Runner.class);
         app.run(); 
    	 
         courier.info("App is done");
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courier.info("EXECUTING: command line runner");
		
		int[] arr = {9, -2, 12, 8, 1, 23};
		int n = arr.length;
		
		for (int i = 0; i < n; ++i) 
            courier.info(arr[i] + " ");
		
		courier.info("Implementing insertion: ");
		
		int answer = insertionFunction.InsertionSort(arr);
		 
        for (int i = 0; i < n; ++i) 
            courier.info(arr[i] + " ");
		
//        for (int i = 0; i < arr.length; ++i) {
//            courier.info("args[{}]: {}", i, arr[i]);
//        }
		
	}
}
