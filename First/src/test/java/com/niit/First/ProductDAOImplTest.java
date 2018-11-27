package com.niit.First;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.ProductDAO;
import com.niit.DAOImpl.ProductDAOImpl;
import com.niit.Model.Product;
import com.niit.config.DBConfig;

import junit.framework.TestCase;

public class ProductDAOImplTest extends TestCase 
{
	    ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,ProductDAOImpl.class);
	    ProductDAO productDao=(ProductDAO)context.getBean("productDao");
	    public void testSaveProduct() 
	    {
		Product product =new Product();
		product.setPrice(20000);
		product.setQuantity(10);
		product.setProductname("Lenovo");
		product.setProductdesc("750GB:i3:7th GEN");
		product=productDao.addProducts(product);
		assertTrue(product.getId()>0);
		}
        public void testGetProduct()
        {
		  Product product1=productDao.selectProducts(2);
		  Product product2=productDao.selectProducts(7);
		  Product product3=productDao.selectProducts(1);
		  assertNotNull(product1);
		  assertNotNull(product2);
		  assertNull(product3);
		  double expectedPrice=40000.0;
		  double actualPrice=product1.getPrice();
		  assertTrue(expectedPrice==actualPrice);
	   }
	   public void testUpdateProduct() 
	   {
		Product product=productDao.selectProducts(2);
		product.setPrice(40000);
		product.setQuantity(45);
		productDao.updateProducts(product);
		assertTrue(product.getPrice()==40000);
		assertTrue(product.getQuantity()==45);
	   }
	   public void testDeleteProduct()
	   {
		productDao.deleteProducts(19);  
		assertNull(productDao.selectProducts(19));
	   }
	   public void testGetAllProducts()
	   {
	    List<Product> productList=productDao.getAllProducts(); 
	    assertNotNull(productList.isEmpty());
	   }
}
