package org.tuv01.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.tuv01.showroom.hibernate.entities.ProductEntity;
import org.tuv01.showroom.services.ProductsService;

//@Path("/showroom/brands")
public class Products {
	// Products ... REST
	ProductsService productsService = new ProductsService();

	@GET // Reading information
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<ProductEntity> getProductsByBrand(@PathParam("brandId") int brandId,
			@QueryParam("category") String category) {
		List<ProductEntity> productList;

		if (category != null) {
			productList = productsService.getProductsByBrandAndCategory(brandId, category);
			return productList;
		} else {
			productList = productsService.getProductsByBrand(brandId);
			return productList;
		}

	}
}
