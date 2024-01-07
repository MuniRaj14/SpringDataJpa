package com.in.muni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in.muni.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductService productservice = context.getBean(ProductService.class);
		
//		productservice.saveproduct();
//		productservice.Pagination();
//		productservice.getproducts();	
		
		productservice.qbeEx();
	}

}
