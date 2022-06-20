package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

@NamedQueries(value = {@NamedQuery(name= "Product.test",query="from Product p where p.productName=?1"),
@NamedQuery(name= "Product.test1",query="from Product p where p.productName=?1 and p.productPrice=?2")} )
//@NamedQuery(name= "Product.test",query="from Product p where p.productName=?1")
//@NamedQuery(name= "Productt.test1",query="from Product p where p.ProductName=?1 and p.productPrice=?2")
@NamedNativeQuery(name="Product.test3",query="select * from Product p where p.productName =?1 and p.productId ",resultClass = Product.class)
public class Product {
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}