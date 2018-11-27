package com.niit.First;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.SupplierDAO;
import com.niit.DAOImpl.SupplierDAOImpl;
import com.niit.Model.Supplier;
import com.niit.config.DBConfig;

import junit.framework.TestCase;

public class SupplierDAOImplTest extends TestCase 
{
  ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,SupplierDAOImpl.class);
  SupplierDAO supplierDao=(SupplierDAO)context.getBean("SupplierDao");
  public void testSaveProduct() 
  {
    Supplier supplier = new Supplier();
    supplier.setSupplierName("Amazon.in"); 
    supplier.setSupplierDesc("Fast Delivery Site");
    supplier=supplierDao.addSupplier(supplier);
    assertTrue(supplier.getSupplierId()>0);
  }
  public void testGetProduct()
  {
   Supplier supplier1=supplierDao.selectSupplier(11);
   Supplier supplier2=supplierDao.selectSupplier(12);
   Supplier supplier3=supplierDao.selectSupplier(1);
   assertNotNull(supplier1);
   assertNotNull(supplier2);
   assertNull(supplier3);
   String expectedname="hP Electronics";
   String actualname=supplier1.getSupplierName();
   assertTrue(expectedname.equals(actualname));
  }
  public void testUpdateProduct() 
  {
    Supplier Supplier=supplierDao.selectSupplier(12);
    Supplier.setSupplierName("Flipkart");
    Supplier.setSupplierDesc("E-commerce site");
	supplierDao.updateSupplier(Supplier);
	assertTrue(Supplier.getSupplierName().equals("Flipkart"));
	assertTrue(Supplier.getSupplierDesc().equals("E-commerce site"));
  }
  public void testDeleteProduct()
  {
	supplierDao.deleteSupplier(28);  
	assertNull(supplierDao.selectSupplier(28));
  }
  public void testGetAllProducts()
  {
	List<Supplier> SupplierList=supplierDao.getAllSupplier(); 
    assertNotNull(SupplierList.isEmpty());
  }
}
