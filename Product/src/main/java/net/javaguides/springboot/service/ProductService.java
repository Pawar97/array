package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);



	Product getProductById(long productId);

	void deleteProduct(long id);

	List<Product> getAllProduct();
}
