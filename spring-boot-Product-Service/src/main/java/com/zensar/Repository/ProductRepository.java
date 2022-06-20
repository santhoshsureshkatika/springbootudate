package com.zensar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	
	@Query("from Product p where  p.productName=?1 or p.productPrice=?2")
	List<Product> repoQuery1(int ProductId, int poductprice);

	// List<Product> getByproductName(String productName);
	// List<Student> findByproductName(String productName);
	// List<Student> findByproductNameAndproductPrice(String productName,int productPrice);
	List<Product> test(String productName);

	List<Product> test1(String productName, int productPrice);

	List<Product> test3(String productName, int productPrice);

	@Query("from Product p where p.productName=:name and p.productPrice=:price")
	List<Product> testt(@Param("name") String productName, @Param("price") int price);
	
	
	
	
}



