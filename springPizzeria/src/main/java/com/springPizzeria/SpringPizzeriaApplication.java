package com.springPizzeria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Pizzeria.Pizza;
import com.salutaMondo.SalutaMondo;
import com.spring_intro_configuration_Component.TestComponent;

@SpringBootApplication
public class SpringPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPizzeriaApplication.class, args);
		List<String> toppings1 = new ArrayList<String>();
		toppings1.add("prosciutto");
		toppings1.add("ananas");
		Pizza p1 = new Pizza(5.32, 76, toppings1); 
//		p1.addTopping("prosciutto");
//		p1.addTopping("ananas");
		System.out.println(p1.getName());
		
//		configWith_Components();
	}
	
	
//	
////	public static void SalutaMondoTrigger() {
////		AnnotationConfigApplicationContext appContext = 
////				new AnnotationConfigApplicationContext();
////		
////		appContext.scan("com.salutaMondo");
////		appContext.refresh();
////		
////		TestComponent t1 = (TestComponent) appContext.getBean("SalutaMondo");
////		System.out.println(t1.saluta());
////		
////		appContext.close();
////	}
//	
//	
//	public static void configWith_Components() {
//		AnnotationConfigApplicationContext appContext = 
//				new AnnotationConfigApplicationContext();
//		
//		appContext.scan("com.salutaMondo");
//		appContext.refresh();
//		
//		//Recupero Bean
//		SalutaMondo s1 = (SalutaMondo) appContext.getBean("SalutaMondo");
//
//		System.out.println(s1.saluta());
//		//E'la stessa cosa che abbiamo visto sopra con t1, ma qua gli passiamo
//		//il parametro invece che fare il set.
//		appContext.close();
	}
