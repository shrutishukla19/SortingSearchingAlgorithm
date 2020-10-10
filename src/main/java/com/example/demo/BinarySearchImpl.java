package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

@Autowired
private SortAlgorithm sortAlgorithm;
public BinarySearchImpl(SortAlgorithm sortAlgorithm)
{
	this.sortAlgorithm=sortAlgorithm;	
}
public int searchNumber(int[] list, int numberToSearchFor)
{
	int[] sortedList=sortAlgorithm.sortList(list);
	
	//logic to search
	
	return 3;
}
}
