package com.zensar.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.ProductDto;
import com.zensar.Service.ProductServiceImpl;
import com.zensar.entity.Product;

@RestController
@RequestMapping(value = "/Product-Api", consumes = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class ProductController {
	@Autowired
	private ProductServiceImpl productservice;

	// @RequestMapping("/products/{productId}")
	@GetMapping(value = "/student/{productId}")
	public ResponseEntity<ProductDto> getStudent(@PathVariable("productId") int productId) {
		return new ResponseEntity<ProductDto>(productservice.getProduct(productId), HttpStatus.OK);
	}

	// @RequestMapping(value={"/products","/listofproducts"},method=RequestMethod.GET)
	@GetMapping(value = { "/products", "/listofproducts" })
	public ResponseEntity<List<ProductDto>> getAllProduct(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize,

			@RequestParam(value = "sortBy", required = false, defaultValue = "productName") String sortBy,
			@RequestParam(value = "dir", required = false, defaultValue = "DESC") Direction dir)

	{
		return new ResponseEntity<List<ProductDto>>(productservice.getAllProduct(pageNumber, pageSize, sortBy, dir),
				HttpStatus.OK);
	}

	// @RequestMapping(value = "/products", method = RequestMethod.POST)
	@PostMapping(value = "/products")
	public ResponseEntity<ProductDto> insertStudent(@RequestBody ProductDto productDto) {
		return new ResponseEntity<ProductDto>(productservice.insertProduct(productDto), HttpStatus.CREATED);

	}

	// @RequestMapping(value = "/products/{productId}", method = RequestMethod.PUT)
	@PutMapping(value = "/productss/{productId}")
	public ResponseEntity<String> updateProduct(@PathVariable("productId") int productId,
			@RequestBody ProductDto productDto) {
		productservice.updateProduct(productId, productDto);
		return new ResponseEntity<String>("Product Updated Successfully", HttpStatus.OK);
	}

	// @RequestMapping(value = "/products/{productId}", method =
	// RequestMethod.DELETE)
	@DeleteMapping(value = "/products/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable("productId") int productId) {
		productservice.deleteProduct(productId);
		return new ResponseEntity<String>("Product DEleted Successfully", HttpStatus.OK);

	}

	@GetMapping(value = "/products/productname/{productName}")
	public ResponseEntity<List<ProductDto>> getByproductName(@PathVariable("studentName") String productName) {
		return new ResponseEntity<List<ProductDto>>(productservice.getByProductName(productName), HttpStatus.OK);
	}

	@GetMapping(value = "/products/{productName}")
	public List<Product> test(@PathVariable String productName) {
		return productservice.test(productName);
	}

	@GetMapping(value = "/products/{productName}/{productPrice}")
	public ResponseEntity<List<ProductDto>> findByproductNameAndproductPrice(@PathVariable String productName,
			@PathVariable int productPrice) {
		return new ResponseEntity<List<ProductDto>>(
				productservice.findByProductNameAndProductPrice(productName, productPrice), HttpStatus.OK);
	}

	@GetMapping(value = "/products/product/{productName}/{productPrice}")
	public List<Product> test1(@PathVariable String productName, @PathVariable int productPrice) {
		return productservice.test1(productName, productPrice);
	}

	@GetMapping(value = "products/prod/{productName}/{productId}")
	public List<Product> test3(@PathVariable String productName, @PathVariable int productId) {
		return productservice.test3(productName, productId);
	}

	@GetMapping(value = "products/prodrepo/{productId}/{productPrice}")
	public List<Product> repoQuery1(@PathVariable int productId, @PathVariable int productPrice) {
		return productservice.repoQuery1(productId, productPrice);
	}

	// http://localhost:8080/student-api/students?pageNumber=0&pageSz=3&SortBy=studentName&dir=DESC

}



