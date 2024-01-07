package com.in.muni.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.in.muni.entity.Product;
import com.in.muni.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productrepo;
	
	public void qbeEx() {
		
		Product entity = new Product();
		entity.setPname("TV");
		entity.setPid(101);
		
		List<Product> products = productrepo.findAll(Example.of(entity));
		
		
		products.forEach(p->{
			System.out.println(p);
		});
	}
	
	
	
	public void Pagination() {
		
		int pagesize = 3;
		int pagenum = 0;
		
		PageRequest of = PageRequest.of(pagenum, pagesize);
		Page<Product> page = productrepo.findAll(of);
		
		int totalPages = page.getTotalPages();
		System.out.println(totalPages);
		
		List<Product> content = page.getContent();
		
		content.forEach(p->{
			System.out.println(p);
		});
		
	}
	
	public void getproducts() {
		
		List<Product> getAllproduct = productrepo.findAll(Sort.by("price"));
		getAllproduct.forEach(p->{
			System.out.println(p);
		});
	}
	
	
	
	
	
	public void saveproduct() {
		
		Product p1 = new Product(101,"TV",1500.00);
		Product p2 = new Product(102,"Laptop",7000.00);
		Product p3 = new Product(103,"Mouse",300.00);
		Product p4 = new Product(104,"Fan",150.00);
		Product p5 = new Product(105,"Pen",12.00);
		Product p6 = new Product(106,"Keyboard",2000.00);
		Product p7 = new Product(107,"Bag",800.00);
		
		List<Product> product = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		productrepo.saveAll(product);
		
	}

}
