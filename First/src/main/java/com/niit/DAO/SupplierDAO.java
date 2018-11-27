package com.niit.DAO;

import java.util.List;

import com.niit.Model.Supplier;

public interface SupplierDAO 
{
	public Supplier addSupplier(Supplier supplier);
    public void updateSupplier(Supplier supplier);
    public void deleteSupplier(int id);
	public Supplier selectSupplier(int id);
	public List<Supplier> getAllSupplier();
}
