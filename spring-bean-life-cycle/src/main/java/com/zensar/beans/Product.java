package com.zensar.beans;

public class Product {
     private int productid;
     private String productname;
     private int productcost;
	public Product() {
		super();
	}
	public Product(int productid, String productname, int productcost) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcost = productcost;
	}
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductcost() {
		return productcost;
	}
	public void setProductcost(int productcost) {
		this.productcost = productcost;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productcost=" + productcost
				+ "]";
	}
     
}
