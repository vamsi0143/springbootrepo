package com.skillogic.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int id;
	private String name;
	private int qty;
	private double price;
}
