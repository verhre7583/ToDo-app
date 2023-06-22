package com.bezkoder.spring.jpa.postgresql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringBootJpaPostgresqlApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){
		Calculator calculator = new Calculator();
		assertEquals(7,calculator.sum(2,5));
	}
	@Test
	void testMultiply(){
		Calculator calculator = new Calculator();
		assertEquals(10,calculator.multiply(2,5));
	}
	@Test
	void testSubtract(){
		Calculator calculator = new Calculator();
		assertNotEquals(-3,calculator.subtract(2,5));
	}
	@Test
	void testDivide(){
		Calculator calculator = new Calculator();
		assertEquals( ((double) 1),calculator.divide(6,3));
	}
}
