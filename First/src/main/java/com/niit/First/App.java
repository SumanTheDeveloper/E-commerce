package com.niit.First;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.DAO.ProductDAO;
import com.niit.DAO.SupplierDAO;
import com.niit.DAO.UserDAO;
import com.niit.Model.Category;
import com.niit.Model.Product;
import com.niit.Model.Supplier;
import com.niit.Model.User;
import com.niit.config.DBConfig;


public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
   	 	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
   	 	/*User user=new User();
   	 	user.setUid(101);
   	 	user.setUname("sharma");
   	 	user.setPwd("209111");
   	 	user.setMobno("8778547672");
   	 	user.setEmailid("rohit96@gmail.com");
   	 	userDAO.addUser(user);
   	 	//userDAO.updateUser(user);
   	 	//userDAO.deleteUser(user);
   	 	User userob=userDAO.selectUser(16);
   	 	List<User> userList=userDAO.getUser();
   	 	for(User userobj:userList)
   	 	{
   		System.out.println(userobj.getUid() +" | "+userobj.getUname()+" | "+userobj.getPwd()+" | "+userobj.getMobno()+" | "+userobj.getEmailid());  	
   	 	}*/
   	   ProductDAO productDAO = (ProductDAO)context.getBean("productDao");
 	 /*  Product product = new Product();
 	   product.setId(1);
 	   product.setProductname("Dell");
       product.setProductdesc("500GB:i5:7th Gen");
 	   product.setQuantity(20);
 	   product.setPrice(39990.00);
 	   productDAO.addProducts(product);
 	   //productDAO.updateProducts(product);
 	   //productDAO.deleteProducts(9);
 	   Product productob=productDAO.selectProducts(2);
 	   System.out.println(productob.getProductname());
 	   List<Product> productList=productDAO.getAllProducts();
 	   for(Product productobj:productList)
 	{
 	 System.out.println(productobj.getId()+"|"+productobj.getProductname()+"|"+productobj.getProductdesc()+"|"+productobj.getPrice()+"|"+productobj.getQuantity());
 	}*/
 	    CategoryDAO categoryDAO =(CategoryDAO)context.getBean("categoryDao");
 	  /*  Category category = new Category();
 	    category.setCategoryId(1001);
 	    category.setCategoryName("LAPTOP");
 	    category.setCategoryDesc("Developers Use");
 	    categoryDAO.addCategory(category);
 	    //categoryDAO.updateCategory(category);
 	    //categoryDAO.deleteCategory(0);
 	    List<Category> categoryList=categoryDAO.getAllCategory();
 	    for(Category categoryobj:categoryList)
 	    {
 	     System.out.println(categoryobj.getCategoryId()+"|"+categoryobj.getCategoryName()+"|"+categoryobj.getCategoryDesc());
 	    }*/
 	    SupplierDAO supplierDAO = (SupplierDAO)context.getBean("SupplierDao");
 	  /*  Supplier supplier = new Supplier();
 	    supplier.setSupplierId(13);
 	    supplier.setSupplierName("sony Electronics");
 	    supplier.setSupplierDesc("Located at chennai");
 	    supplierDAO.addSupplier(supplier);
 	    //supplierDAO.updateSupplier(supplier);
 	    Supplier supplierob=supplierDAO.selectSupplier(11);
 	    System.out.println(supplierob.getSupplierId()+"|"+supplierob.getSupplierName()+"|"+supplierob.getSupplierDesc());
 	    List<Supplier> supplierList=supplierDAO.getAllSupplier();
 	    for(Supplier supplierobj:supplierList)
 	    {
 	     System.out.println(supplierobj.getSupplierId()+"|"+supplierobj.getSupplierName()+"|"+supplierobj.getSupplierDesc());
 	    }*/
    }
}

