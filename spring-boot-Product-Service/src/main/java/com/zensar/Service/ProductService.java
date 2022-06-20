package com.zensar.Service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.zensar.dto.ProductDto;
import com.zensar.entity.Product;

public interface ProductService {
	public ProductDto getProduct(int producttId);

	public List<ProductDto> getAllProduct(int pageNumber,int pageSize,String sortBy,Direction dir);

	public ProductDto insertProduct(ProductDto productDto);

	public void updateProduct(int productId, ProductDto ProductDto);

	public void deleteProduct(int studentId);

	 List<ProductDto> getByProductName(String productName);
	 List<ProductDto> findByProductNameAndProductPrice(String productName,int productPrice);
	 List<Product> test(String productName);
	 List<Product> test1(String productName,int productPrice);
	 List<Product> test3(String productName,int productId);
	 List<Product> repoQuery1(int productId,int productPrice);
}
