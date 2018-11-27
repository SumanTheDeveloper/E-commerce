package com.niit.First;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UserDAO;
import com.niit.DAOImpl.UserDAOImpl;
import com.niit.Model.User;
import com.niit.config.DBConfig;

import junit.framework.TestCase;

public class UserDAOImplTest extends TestCase 
{
 ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,UserDAOImpl.class);
 UserDAO userDao=(UserDAO)context.getBean("userDAO");
 public void testSaveUser()
 { 
  User user = new User();
  user.setPassword("1234");
  user.setEmail("ram96@gmail.com");
  user=userDao.addUser(user);
  assertTrue(user.getEmail()=="ram96@gmail.com");
 }
 public void testUpdateUser()
 {
  User user=userDao.selectUser(16);	 
  user.setPassword("4321");
  user.setEmail("ram96@gmail.com");
  userDao.updateUser(user);
  System.out.println(user.getPassword());
  assertTrue(user.getPassword()=="4321");
  assertTrue(user.getPassword()=="8654975321");
 }
 public void testGetUser()
 {
  User user1=userDao.selectUser(16);
  User user2=userDao.selectUser(101);
  User user3=userDao.selectUser(15);
  assertNotNull(user1);
  assertNotNull(user2);
  assertNull(user3);
  String expectedmailId="rohit@gmail.com";
  String actualmailId=user2.getEmail();
  assertTrue(expectedmailId.equals(actualmailId));
 }
 public void testDeleteUser()
 {
  userDao.deleteUser(30);  
  assertNull(userDao.selectUser(30));	 
 }
 public void testGetAllUsers()
 {
  List<User> userList=userDao.getUser(); 
  assertNotNull(userList.isEmpty());
 }
}
















