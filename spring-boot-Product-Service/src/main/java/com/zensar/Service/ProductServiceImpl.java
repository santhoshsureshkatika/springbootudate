package com.zensar.Service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.zensar.dto.ProductDto;
import com.zensar.Repository.ProductRepository;
import com.zensar.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public com.zensar.dto.ProductDto getProduct(int productId) {
	Product product = productRepository.findById(productId).get();

		return modelMapper.map(product, ProductDto.class);
		// ProductDto dto = mapToDto(Product);
		// return dto;
	}

	@Override
	public List<ProductDto> getAllProduct(int pageNumber, int pageSize,String sortBy,Direction dir) {
		// List<Student> listofStudents = studentRepository.findAll();
		List<ProductDto> ListOfDto = new ArrayList<com.zensar.dto.ProductDto>();
		Page<Product> findAll = productRepository.findAll(PageRequest.of(pageNumber, pageSize,dir,sortBy));
		//Page<Product> findAll = producRepository.findAll(PageRequest.of(0, 3,Direction.DESC,"productName"));
		List<Product> content = findAll.getContent();
		for (Product product : content) {
			// ListOfDto.add(mapToDto(poduct));
			ListOfDto.add(modelMapper.map(product, ProductDto.class));
		}
		return ListOfDto;
	}

	@Override
	public ProductDto insertProduct(ProductDto productDto) {
		System.out.println(productDto);
		// Product product = mapToEntity(productDto);
		Product product = modelMapper.map(productDto,Product.class);
		Product insertedproduct = productRepository.save(product);
		// ProductDto dto = mapToDto(insertedProduct);
		return modelMapper.map(insertedproduct, ProductDto.class);
		// return dto;

	}

	@Override
	public void updateProduct(int productId, ProductDto ProductDto) {
		// Product product= mapToEntity(productDto);
		Product product = modelMapper.map(ProductDto, Product.class);
		productRepository.save(product);

	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);

	}

	@Override
	public List<com.zensar.dto.ProductDto> getByProductName(String productName) {
		List<com.zensar.dto.ProductDto> productDtos = new ArrayList<>();
		List<Product> products = productRepository.test(productName);
		for (Product product : products)
			productDtos.add(modelMapper.map(product, com.zensar.dto.ProductDto.class));
		return productDtos;

		// return productRepository.getByProductName(productName);
		// return productRepository.findByProductName(ProductName);
	}

	@Override
	public List<com.zensar.dto.ProductDto>findByProductNameAndProductPrice(String productName, int productPrice) {
		List<com.zensar.dto.ProductDto> productDtos = new ArrayList<>();
		List<Product> products = productRepository.testt(productName, productPrice);
		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;
	}

	@Override
	public List<Product> test(String productName) {
		return productRepository.test(productName);
	}

	@Override
	public List<Product> test1(String productName, int productPrice) {
		return productRepository.test1(productName, productPrice);
	}

	@Override
	public List<Product> test3(String productName, int productId) {
		return productRepository.test3(productName, productId);
	}

	@Override
	public List<Product> repoQuery1(int productId, int productPrice) {
		return productRepository.repoQuery1(productId, productPrice);
	}

	/*
	 * public ProductDto mapToDto(Product product) { ProductDto dto = new
	 * ProductDto(); dto.setProductId(student.getProductId());
	 * dto.setProductName(product.getProductName()); dto.setproductPrice(product.getProductPrice());
	 * return dto;
	 * 
	 * } public Product mapToEntity(ProductDto productDto) { Product product = new
	 * product(); product.setproductId(studentDto.getproductId());
	 * product.setProductName(productDto.getProductName());
	 * product.setproductPrice(productDto.getproductprice());
	 * 
	 * return product; }
	 */

}
