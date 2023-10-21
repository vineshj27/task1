package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository pr;
	
	public List<Product> setValue(List<Product> pro) {
		return pr.saveAll(pro);
	}
	public String value(Product rpo) {
		  pr.save(rpo);
     return "save";
	}
	
	public String setvalue(Product rpod) {
		 pr.save(rpod);
		 return "saved";
	}
	
	public String setvalues(Product pdr) {
		pr.save(pdr);
		return "set";
	}
	
	public List<Product> getValues() {
		return pr.findAll();
	}
	
	public String setValues(List<Product> tcu) {
		  pr.saveAll(tcu);
      return "saved";	
	}

}
