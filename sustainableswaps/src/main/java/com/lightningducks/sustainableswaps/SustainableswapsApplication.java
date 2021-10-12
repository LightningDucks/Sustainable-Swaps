package com.lightningducks.sustainableswaps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SustainableswapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SustainableswapsApplication.class, args);
	}

	//Alysia's A6
	public static int findMax(int arr[]){
		int maximum = arr[0];

		//Parse through given array
		for (int i = 1 ; i < arr.length ; i++){
			if (maximum < arr[i])
				maximum = arr[i];
		}
		return maximum;
	}
}
