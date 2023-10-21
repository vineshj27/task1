package com.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.customexception.NameNotValidException;
import com.product.dao.ProductDao;
import com.product.entity.Product;

@Service

public class ProductService {

	@Autowired
	ProductDao pd;

	public List<Product> setValue(List<Product> pr) {
		return pd.setValue(pr);
	}

	public String value(Product rpo) {
		return pd.value(rpo);
	}

	public List<Product> getValues() {
		return pd.getValues();
	}

	// serviceclassimplementation
	public List<Product> setproducts(String sp) {
		List<Product> ps = getValues();
		List<Product> service = ps.stream().filter(x -> x.getModel().equals(sp)).toList();
		return service; // getnameorgetprice/getrating
	}

	public List<Product> getPrice(int aq, int qa) {
		List<Product> gp = getValues();
		List<Product> price = gp.stream().filter(q -> q.getPrice() > aq && q.getPrice() < qa).toList();
				 
		return price;
	}

	public String setvalue(Product produc) throws NameNotValidException {
		if (produc.getName().equalsIgnoreCase("laptop")) {
			throw new NameNotValidException("Not a product");
		} else {
			return pd.setvalue(produc);
		}
	}

	public String setvalues(Product produt) throws NameNotValidException {
		try {
			if (produt.getName().equalsIgnoreCase("mobile")) {
				throw new NameNotValidException("not a PRODUCT");
			} else {
				return pd.setvalues(produt);
			}
		} catch (NameNotValidException nn) {
			return ("Not a proper parameter");
		}

	}

	public String setValues(List<Product> tc) throws NameNotValidException {
		List<Product> qw = tc.stream().filter(w ->!w.getName().equalsIgnoreCase("ac")).toList();
		if (qw.isEmpty()) { // alsonotusing'!'
			throw new NameNotValidException("not a laptop");

		} else {
			return pd.setValues(qw);
		}

	}

}
