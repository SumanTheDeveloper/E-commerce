package com.niit.DAO;

import java.util.List;

import com.niit.Model.Product;

public interface ProductDAO
{
	  public Product addProducts(Product product);
	  public Product updateProducts(Product product);
	  public void deleteProducts(int id);
	  public Product selectProducts(int id);
	  public List<Product> getAllProducts();
}
