package org.tuv01.showroom.services;

import java.util.List;

import org.tuv01.showroom.hibernate.DAO.ProductsDAO;
import org.tuv01.showroom.hibernate.entities.ProductEntity;

public class ProductsService {

	ProductsDAO dao = new ProductsDAO();

	public List<ProductEntity> getProductsByBrand(int brandId) {
		List<ProductEntity> productList = dao.getsProductsByBrand(brandId);
		return productList;
	}

	public List<ProductEntity> getProductsByBrandAndCategory(int brandId, String category) {
		List<ProductEntity> productList = dao.getProductsByBrandAndCategory(brandId, category);
		return productList;
	}

}
