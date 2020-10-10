package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BinarySort implements SortAlgorithm{
	
	public int[] sortList(int[] list)
	{
		System.out.println("BinarySort Implementation...");
		
		/*
		 * code to sort list using binary sort
		 */
		return list;
	}

}
