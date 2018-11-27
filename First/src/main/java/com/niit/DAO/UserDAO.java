package com.niit.DAO;

import java.util.List;

import com.niit.Model.User;

public interface UserDAO
{
	public User addUser(User user);
	public List<User> getUser();
	public void updateUser(User user);
	public void deleteUser(int id);
	public User selectUser(int id);
}
