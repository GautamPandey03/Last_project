package com.nagarro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.nagarro.models.Product;
import com.nagarro.service.ProductService;
import com.nagarro.serviceimpl.ProductServiceImpl;


/**
 *  Product Controller mangaes request related to product
 */
@MultipartConfig
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 11233122L;
	private final ProductService ps;

	public ProductController() {
		this.ps = new ProductServiceImpl();
	}

	/* (non-Javadoc)
	 * @see jakarta.servlet.http.HttpServlet#doGet(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
			case "/Products/editProduct":
				editProduct(request, response);
				break;
			case "/Products/deleteProduct":
				deleteProduct(request, response);
				break;
			default:
				break;
		}

	}

	/**
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void editProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("id"));
		Product product = ps.getProduct(id);
		session.setAttribute("editProductDetail", product);
		System.out.println("Asas");
		RequestDispatcher rd = request.getRequestDispatcher("./edit");
		rd.forward(request, response);
	}

	/* (non-Javadoc)
	 * @see jakarta.servlet.http.HttpServlet#doPost(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
			case "/Products/addProduct":
				addProduct(request, response);
				break;
			case "/Products/getAllProduct":
				getAllProduct();
				break;
			case "/Products/updateProduct":
				updateProduct(request, response);
				break;
			default:
				break;
		}
	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void updateProduct(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
        String path=uploadImgFile(request);
		Product edit = (Product) session.getAttribute("editProductDetail");

		Product product = new Product();
		product.setProductId(edit.getProductId());
		product.setProductTitle(request.getParameter("title").trim());
		product.setProductSize(Integer.parseInt(request.getParameter("size").trim()));
		product.setProductQuantity(Integer.parseInt(request.getParameter("quantity").trim()));
		product.setProductImage(path);
		ps.updateProduct(product);
		response.sendRedirect("../");
	}

	/**
	 * @return all Products
	 */
	public List<Product> getAllProduct() {
		return ps.getAllProduct();
	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void deleteProduct(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));	
		ps.deleteProduct(id);
		response.sendRedirect("../");
	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void addProduct(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
//        String path=uploadImgFile(request);
		System.out.println(request.getParameter("image"));
		Product product = new Product();
		product.setProductTitle(request.getParameter("title").trim());
		product.setProductSize(Integer.parseInt(request.getParameter("size").trim()));
		product.setProductQuantity(Integer.parseInt(request.getParameter("quantity").trim()));
		product.setProductImage(request.getParameter("image"));
		ps.addProduct(product);
		response.sendRedirect("../Products");
	}
	/**
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ServletException
	 */
	private String uploadImgFile(HttpServletRequest request)
  throws IOException, ServletException {
		Part filePart = request.getPart("image");
	    String fileName = filePart.getSubmittedFileName();
	    for (Part part : request.getParts()) {
	      part.write("C:\\Users\\dharmikmidha\\eclipse-workspace\\ProductManagementSystem\\src\\main\\webapp\\images\\" + fileName);
	    }
		return (fileName);
	}
}