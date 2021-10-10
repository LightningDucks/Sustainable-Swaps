package com.lightningducks.sustainableswaps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;

@SpringBootTest
class SustainableswapsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSquareRoot() {
		SustainableswapsApplication a = new SustainableswapsApplication();
		double aSquareRoot = 121.0;
		aSquareRoot = a.squareRoot(aSquareRoot);
		Assert.assertEquals(11.0, aSquareRoot, 0.00000);
	}

}
