package com.jhsoft.deploy.deploy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jhsoft.deploy.deploy.controller.IndexController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeployApplicationTests {

	@Test
	public void contextLoads() {
	}
/*
	@Test
	public void pruebaMayorDeEdad() {
		IndexController c = new IndexController();
		c.mayorDeEdad(19);
	}
	
	@Test(expected= RuntimeException.class)
	public void pruebaMenorDeEdad() {
		IndexController c = new IndexController();
		c.mayorDeEdad(8);
	}
	*/
}
