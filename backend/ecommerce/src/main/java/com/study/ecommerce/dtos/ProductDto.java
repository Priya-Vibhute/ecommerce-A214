package com.study.ecommerce.dtos;

import com.study.ecommerce.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	
	private Integer id;
	private String name; 
	private String description;
	private Integer price;
	private String imageUrl;
	private Category category;

}
