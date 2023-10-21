package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.customexception.NameNotValidException;
import com.product.entity.Product;
import com.product.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	
	ProductService ps;
	
	@PostMapping(path="/setvalue")
	public List<Product>  setValue(@RequestBody List<Product> p) {
		return ps.setValue(p);
	}
	
	@PostMapping(path="/value")
   public String value(@RequestBody Product rp) {
		return ps.value(rp);
	}
	
	@GetMapping(path="/findvalues")
  public List<Product> getValues() {
	  return ps.getValues();
  }
  
 @GetMapping(path="/getprobyname/{x}")
 public List<Product> setproducts(@PathVariable String x) {
	 return ps.setproducts(x);
 }
  
  @GetMapping(path="/getprice/{a}/{b}")
  public List<Product> getPrice(@PathVariable int a, @PathVariable int b) {
	  return ps.getPrice(a,b);
  }
  
  @PostMapping(path="/exception")
  public String setvalue(@RequestBody Product produ) throws NameNotValidException {
	  return ps.setvalue(produ);
  }
  
 @PostMapping(path="/exceptionhandle")
 public String setvalues(@RequestBody Product product) throws NameNotValidException {
	 return ps.setvalues(product);
 }
  
 @PostMapping(path="/handleob")
 public String setValues(@RequestBody List<Product> t) throws NameNotValidException {
	 return ps.setValues(t);
 }
 
 @GetMapping(path="/msg")
 public String message() {
	 return "hello";
 }
 
 @GetMapping(path="/total/{w}/{b}")
 public int adds(@PathVariable int w, @PathVariable int b) {
	 return w+b;
 }
 
}
