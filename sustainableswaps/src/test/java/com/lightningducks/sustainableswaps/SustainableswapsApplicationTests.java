package com.lightningducks.sustainableswaps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SustainableswapsApplicationTests {

	@Test
	void contextLoads() {
	}

	//Alysia's A6
	@Test
	void testFindMax(){
		SustainableswapsApplication a = new SustainableswapsApplication();
		System.out.println("Testing Finding Max...");
		Assertions.assertEquals(50, a.findMax(new int[]{10, 30, 50, 20}));
	}
}
