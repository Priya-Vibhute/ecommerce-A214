package com.study.ecommerce.services;

import java.util.List;

import com.study.ecommerce.dtos.ProductDto;

public interface ProductService {

//	To add Product
 ProductDto	addProduct(ProductDto productDto);
 
// To fetch all Products
 List<ProductDto> getProducts();
 
// get Product by id
 ProductDto getProductById(Integer id);
 
// delete Product
 void deleteProduct(Integer id);
 
// update product
ProductDto updateProduct(Integer id,ProductDto productDto);
 
 
 

 
 
}
