package com.nagarro.service;

import java.util.List;

import com.nagarro.models.Product;

/**
 * Product service Interface
 */
public interface ProductService {
	/**
	 * @param product
	 * @return
	 */
	int addProduct(Product product);
	/**
	 * @return list of products
	 */
	List<Product> getAllProduct();
	/**
	 * @param productId
	 * @return product
	 */
	Product getProduct(int productId);
	/**
	 * @param product
	 * @return status
	 */
	int updateProduct(Product product);
	/**
	 * @param productId
	 * @return status
	 */
	int deleteProduct(int productId);
}
