package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.SupplierDAO;
import com.niit.Model.Supplier;

@Repository("SupplierDao")
@Transactional
public class SupplierDAOImpl implements SupplierDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	public Supplier addSupplier(Supplier supplier) 
	{
	 sessionFactory.getCurrentSession().save(supplier);
	return supplier;	
	}

	public void updateSupplier(Supplier supplier) 
	{
	 sessionFactory.getCurrentSession().update(supplier);	
	}

	public void deleteSupplier(int id) 
	{
	 Session session=sessionFactory.getCurrentSession();
     Supplier supplier=(Supplier) session.get(Supplier.class, id);
   	 session.delete(supplier);
	}

	public Supplier selectSupplier(int id) 
	{
	 Object obj=sessionFactory.getCurrentSession().get(Supplier.class, id);
     Supplier s=(Supplier)obj;
   	 return s;
	}

	public List<Supplier> getAllSupplier() 
	{
	 return  sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}

}
