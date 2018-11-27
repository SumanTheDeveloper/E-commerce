package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CategoryDAO;
import com.niit.Model.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
	public Category addCategory(Category category)
	{
		sessionFactory.getCurrentSession().save(category);
		return category;	
	}

	public void updateCategory(Category category) 
	{
		sessionFactory.getCurrentSession().update(category);	
	}

	public void deleteCategory(int id)
	{
		Session session=sessionFactory.getCurrentSession();
		Category category=(Category) session.get(Category.class, id);
		 session.delete(category);
	}

	public Category selectCategory(int id) 
	{
		Object obj=sessionFactory.getCurrentSession().get(Category.class, id);
		Category c=(Category)obj;
		return c;
	}

	public List<Category> getAllCategory() 
	{
		return  sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

	

	

	
	

}
