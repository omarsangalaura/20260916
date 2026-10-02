package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.controladores.PruebaController;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		PruebaController pruebaController = new PruebaController();
		String despedida = pruebaController.otroEndpoint();
		assertEquals("Hasta la siguiente semana!!", despedida);
	}

}
