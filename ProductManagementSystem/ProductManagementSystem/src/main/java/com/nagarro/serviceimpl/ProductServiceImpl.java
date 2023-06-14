package com.nagarro.serviceimpl;

import java.util.List;

import com.nagarro.dao.ProductDao;
import com.nagarro.daoimpl.ProductDaoImpl;
import com.nagarro.models.Product;
import com.nagarro.service.ProductService;

/**
 * Product service Implementation
 */
public class ProductServiceImpl implements ProductService{
	private final ProductDao pd ;
	
	/**
	 * ProductDao Initialisation
	 */
	public ProductServiceImpl() {
	this.pd=new ProductDaoImpl();
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.service.ProductService#addProduct(com.training.nagarro.web.models.Product)
	 * add product
	 */
	@Override
	public int addProduct(Product product) {
		return pd.addProduct(product);
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.service.ProductService#getAllProduct()
	 * list of products
	 */
	@Override
	public List<Product> getAllProduct() {
		return pd.getAllProduct();
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.service.ProductService#getProduct(int)
	 * return product
	 */
	@Override
	public Product getProduct(int productId) {
		return pd.getProduct(productId);
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.service.ProductService#updateProduct(com.training.nagarro.web.models.Product)
	 * update product
	 */
	@Override
	public int updateProduct(Product product) {
		return pd.updateProduct(product);
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.service.ProductService#deleteProduct(int)
	 * delete product
	 */
	@Override
	public int deleteProduct(int productId) {
		return pd.deleteProduct(productId);
	}

}
