package com.nagarro.daoimpl;
import java.util.List;

import com.nagarro.dao.ProductDao;
import com.nagarro.models.Product;
import com.nagarro.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Product Dao Implementation
 */
public class ProductDaoImpl implements ProductDao {

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.dao.ProductDao#addProduct(com.training.nagarro.web.models.Product)
	 * add product
	 */
	@Override
	public int addProduct(Product product) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction addProduct = session.beginTransaction();
			session.merge(product);
			addProduct.commit();
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.dao.ProductDao#getAllProduct()
	 * get all product
	 */
	@Override
	public List<Product> getAllProduct() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction getAllProducts = session.beginTransaction();
			List<Product> productsList = session.createQuery("from Product", Product.class).getResultList();
			getAllProducts.commit();
			return productsList;
		}
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.dao.ProductDao#getProduct(int)
	 * get product
	 */
	@Override
	public Product getProduct(int productId) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction getProduct=session.beginTransaction();
			Product product=session.createQuery("from Product where id="+productId, Product.class).getSingleResult();
			getProduct.commit();
			return product;
		}
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.dao.ProductDao#updateProduct(com.training.nagarro.web.models.Product)
	 * update Product
	 */
	@Override
	public int updateProduct(Product product) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction updateProducts = session.beginTransaction();
			Product productFromDb = session.get(Product.class, product.getProductId());
			productFromDb.setProductTitle(product.getProductTitle());
			productFromDb.setProductQuantity(product.getProductQuantity());
			productFromDb.setProductSize(product.getProductSize());
			productFromDb.setProductImage(product.getProductImage());
			updateProducts.commit();
			return 1;
		}
	}

	/* (non-Javadoc)
	 * @see com.training.nagarro.web.dao.ProductDao#deleteProduct(int)
	 * delete product
	 */
	@Override
	public int deleteProduct(int productId) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction deleteProduct = session.beginTransaction();
			Product productToDelete=session.get(Product.class, productId);
			session.remove(productToDelete);
			deleteProduct.commit();
		}
		return 0;
	}

}
