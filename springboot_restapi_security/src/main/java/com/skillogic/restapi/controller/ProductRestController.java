package com.skillogic.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillogic.restapi.model.Product;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	@GetMapping("/allproducts")
	public List<Product> allProducts(){
		List<Product> list = new ArrayList<>();
		Product p1 = new Product(1, "Laptop", 1, 50000);
		Product p2 = new Product(2, "Mobile", 2, 30000);
		list.add(p1);
		list.add(p2);
		return list;
	}
	@GetMapping("/payment")
	public String payment(){
		return "Payment Information";
	}
}
