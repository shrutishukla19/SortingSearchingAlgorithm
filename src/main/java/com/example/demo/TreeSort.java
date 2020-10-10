package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TreeSort implements SortAlgorithm {
	
	public int[] sortList(int[] list)
	{
		System.out.println("TreeSort Implementation...");
		/*
		 * code to sort list using Tree Sort
		 */
		return list;
	}

}
