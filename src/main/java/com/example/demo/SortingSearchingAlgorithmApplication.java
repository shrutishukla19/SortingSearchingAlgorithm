package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SortingSearchingAlgorithmApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SortingSearchingAlgorithmApplication.class, args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		int result=binarySearch.searchNumber(new int[] {12,4,6},3);
		System.out.println(result);
	}

}
