package com.niit;



import java.io.File;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.niit.DAO.ProductDAO;
import com.niit.Model.Product;


@Controller
public class ProductController 
{
	@Autowired
	ProductDAO productDao;
	@RequestMapping(value="/all/Add", method=RequestMethod.POST)
		public String productAdded(@ModelAttribute("AddProduct") Product product, HttpServletRequest request)
		{
				productDao.addProducts(product);
				MultipartFile img=product.getPimage();
				Path path=Paths.get(request.getSession().getServletContext().getRealPath("/")+"/WEB-INF/resources/images/"+product.getId()+".png");
				try 
				{
					if(img!=null && !img.isEmpty())
					{
					File file=new File(path.toString());
					img.transferTo(file);
					}
				}
				catch (IllegalStateException e)
				{	
					e.printStackTrace();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				return "redirect:/all/getallproducts";
		}

		@RequestMapping(value="/admin/AddProduct", method=RequestMethod.GET)
		public ModelAndView getProductForm(@ModelAttribute("AddProduct") Product product)
		{
				System.out.println("Add");	
				ModelAndView model=new ModelAndView("AddProduct");
				return model;
		}
		@RequestMapping(value="/all/getallproducts", method=RequestMethod.GET)
		public ModelAndView getViewProductForm(@ModelAttribute("ViewProduct") Product product)
		{
				System.out.println("view");	
				ModelAndView model = new ModelAndView();
		        model.addObject("productlist", productDao.getAllProducts());
		        model.setViewName("ViewProduct");
		        return model;
		}
		@RequestMapping(value="/all/Delete", method = RequestMethod.GET)
		public String deleteProduct(@RequestParam int id)
		{

		    productDao.deleteProducts(id);
		    return "redirect:/all/getallproducts";
		}
		@RequestMapping(value="/all/edit",method = RequestMethod.GET)
		public ModelAndView getUpdateProductForm(@RequestParam int id,Model m)
		{
			Product product=productDao.selectProducts(id);
		    m.addAttribute("prod",product);
			ModelAndView model = new ModelAndView("EditProduct");
			return model;
		}
		@RequestMapping(value="/all/edit", method=RequestMethod.POST)
		public String productEdited(@ModelAttribute("prod") Product product, HttpServletRequest request)
		{
				productDao.updateProducts(product);
				MultipartFile img=product.getPimage();
				Path path=Paths.get(request.getSession().getServletContext().getRealPath("/")+"/WEB-INF/resources/images/"+product.getId()+".png");
				try 
				{
					if(img!=null && !img.isEmpty()){
					File file=new File(path.toString());
					img.transferTo(file);
					}
				} catch (IllegalStateException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
			
					e.printStackTrace();
				}
		        return "redirect:/all/getallproducts";		
		}
		@RequestMapping(value="/all/Info",method = RequestMethod.GET)
		public String getProduct(@RequestParam int id,Model model)
		{
			Product product=productDao.selectProducts(id);
			  model.addAttribute("productAttr",product);
			  return "GetProduct";
		}
		 @RequestMapping(value="/all/Product",method = RequestMethod.GET)
		 public ModelAndView getProductPage()
		 {
			 ModelAndView model = new ModelAndView();
		     model.addObject("productlist", productDao.getAllProducts());
		     model.setViewName("Product");
		     return model; 
		 }
	
}

