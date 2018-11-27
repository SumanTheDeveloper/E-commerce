package com.niit.DAO;

import java.util.List;

import com.niit.Model.Category;

public interface CategoryDAO
{
	  public Category addCategory(Category category);
	  public void updateCategory(Category category);
	  public void deleteCategory(int id);
	  public Category selectCategory(int id);
	  public List<Category> getAllCategory();
}
