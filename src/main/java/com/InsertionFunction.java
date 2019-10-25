package com;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class InsertionFunction {
	
	public UnsortedNums[] unsortedNums;

	public InsertionFunction(UnsortedNums[] unsortedNums) {
		this.unsortedNums = unsortedNums;
		
	}
	public int InsertionSort(int[] arr){
		for(int i = 1; i < arr.length; i++) {
			int value = arr[i];
		    int j = i - 1;
		    while(j >= 0 && arr[j] > value){
		      arr[j + 1] = arr[j];
		      j = j - 1;
		    }
		    arr[j + 1] = value;  
		    if(i == arr.length-1) {
		    	return value;
		    }
		}
		 return 0;
	}
	public UnsortedNums[] getUnsortedNums() {
		return unsortedNums;
	}
	public void setUnsortedNums(UnsortedNums[] uNum) {
		this.unsortedNums = uNum;
	}

	

	
}
	