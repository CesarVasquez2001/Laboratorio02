package Ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Fibonacci {
	@BeforeEach
	public void before() {
		System.out.println("before()");
	}

	@AfterEach
	public void after() {
		System.out.println("after()");
	}

	@Test
	void test() {
		System.out.println("FIBONACCI");
		assertEquals(5, fibonacci(5));
	}

	public static int fibonacci(int n) {
		if (n > 1) {
			return fibonacci(n - 1) + fibonacci(n - 2); // función recursive
		} else if (n == 1) { // caso base
			return 1;
		} else if (n == 0) { // caso base
			return 0;
		} else { // error
			System.out.println("Debes ingresar un tamaño mayor o igual a 1");
			return -1;
		}
	}
}