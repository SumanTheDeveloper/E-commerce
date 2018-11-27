package com.niit.First;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.DAOImpl.CategoryDAOImpl;
import com.niit.Model.Category;
import com.niit.config.DBConfig;

import junit.framework.TestCase;

public class CategoryDAOImplTest extends TestCase
{
    ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,CategoryDAOImpl.class);
    CategoryDAO categoryDao=(CategoryDAO)context.getBean("categoryDao");
    public void testSaveProduct() 
    {
	 Category category =new Category();
	 category.setCategoryName("Furnitures");
	 category.setCategoryDesc("Computer Tables");
	 category=categoryDao.addCategory(category);
	 assertTrue(category.getCategoryId()>0);
	}
    public void testGetProduct()
    {
	  Category category1=categoryDao.selectCategory(24);
	  Category category2=categoryDao.selectCategory(25);
	  Category category3=categoryDao.selectCategory(1);
	  assertNotNull(category1);
	  assertNotNull(category2);
	  assertNull(category3);
	  String expectedname="Electronic Devices";
	  String actualname=category1.getCategoryName();
	  assertTrue(expectedname.equals(actualname));
   }
   public void testUpdateProduct() 
   {
	Category category=categoryDao.selectCategory(25);
	category.setCategoryName("Portables");
	category.setCategoryDesc("penDrive,OTG");
	categoryDao.updateCategory(category);
	assertTrue(category.getCategoryName().equals("Portables"));
	assertTrue(category.getCategoryDesc().equals("penDrive,OTG"));
   }
   public void testDeleteProduct()
   {
	categoryDao.deleteCategory(1001);  
	assertNull(categoryDao.selectCategory(1001));
   }
   public void testGetAllProducts()
   {
    List<Category> categoryList=categoryDao.getAllCategory(); 
    assertNotNull(categoryList.isEmpty());
   }
}
