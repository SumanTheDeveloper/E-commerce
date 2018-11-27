package com.niit.DAOImpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.ProductDAO;
import com.niit.Model.Product;

@Repository("productDao")
@Transactional
public class ProductDAOImpl implements ProductDAO
{

	@Autowired
	SessionFactory sessionFactory;
	public Product addProducts(Product product)
	{
	 sessionFactory.getCurrentSession().save(product);
	return product;	
	}

	public Product updateProducts(Product product)
	{
	 sessionFactory.getCurrentSession().update(product);
	return product;
	}

	public void deleteProducts(int id)
	{	
	 Session session=sessionFactory.getCurrentSession();
	 Product product=(Product) session.get(Product.class, id);
	 session.delete(product);
	}

	public Product selectProducts(int id) 
	{
		Object obj=sessionFactory.getCurrentSession().get(Product.class, id);
		Product p=(Product)obj;
		return p;
	}
	public List<Product> getAllProducts()
	{
		return  sessionFactory.getCurrentSession().createQuery("from Product").list();
		
	}
}
