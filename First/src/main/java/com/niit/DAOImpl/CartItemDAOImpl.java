package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CartItemDAO;
import com.niit.Model.CartItem;
import com.niit.Model.CustomerOrder;

@Repository("cartItemDao")
@Transactional
public class CartItemDAOImpl implements CartItemDAO 
{
	@Autowired
    private SessionFactory sessionFactory;
	public void addToCart(CartItem cartItem)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(cartItem);
	}

	public void removeCartItem(int cartItemId) 
	{
		Session session=sessionFactory.getCurrentSession();
		CartItem cartItem=(CartItem)session.get(CartItem.class,cartItemId);
		session.delete(cartItem);
	}

	public List<CartItem> getCart(String email) 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from CartItem where user.email=:email");
		query.setString("email", email);
		return query.list();
	}

	public CustomerOrder createCustomerOrder(CustomerOrder customerOrder) {
		Session session=sessionFactory.getCurrentSession();
		session.save(customerOrder);
		return customerOrder;
	}

}
