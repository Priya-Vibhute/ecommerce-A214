package com.study.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.ecommerce.dtos.ApiResponse;
import com.study.ecommerce.dtos.ProductDto;
import com.study.ecommerce.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
//	=============================================================
//	POST -localhost:8080/products
//	=============================================================
	
	@PostMapping
	public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto)
	{
		ProductDto savedDto = productService.addProduct(productDto);
		return new ResponseEntity<ProductDto>(savedDto,HttpStatus.CREATED);
	}
	
//	=============================================================
//	GET -localhost:8080/products
//	=============================================================
	@GetMapping
	public ResponseEntity<List<ProductDto>> getProducts()
	{
		List<ProductDto> products = productService.getProducts();
		return ResponseEntity.ok(products);
	}
	
	
//	=============================================================
//	GET -localhost:8080/products/{id}   localhost:8081/products/100
//	=============================================================
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> getProductById( @PathVariable Integer id)
	{
		ProductDto productDto = productService.getProductById(id);
		return ResponseEntity.ok(productDto);
	}
	
	
//	=============================================================
//	DELETE -localhost:8080/products/{id}   localhost:8081/products/100
//	=============================================================
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse> deleteProduct(@PathVariable Integer id)
	{
		productService.deleteProduct(id);
		ApiResponse response = new ApiResponse("Product deleted");
		return ResponseEntity.ok(response);
	}
	
	
	
//	=============================================================
//	PUT -localhost:8080/products/{id}   localhost:8081/products/100
//	=============================================================
	
	@PutMapping("/{id}")
	public ResponseEntity<ProductDto> updateProduct(@PathVariable Integer id,
			                                        @RequestBody ProductDto productDto)
	{
		ProductDto updatedProduct = productService.updateProduct(id, productDto);
		return ResponseEntity.ok(updatedProduct);
	}
}
