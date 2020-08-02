package org.tuv01.showroom.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.tuv01.showroom.hibernate.entities.BrandEntity;
import org.tuv01.showroom.services.BrandsService;

@Path("showroom/brands")
public class Brands {
	BrandsService service = new BrandsService();

	@GET // Reading information
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<BrandEntity> getBrands() {
		List<BrandEntity> list = service.getBrands();
		return list;
	}

	@POST // Creating information
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void postBrands(BrandEntity brand) {
		service.addBrand(brand);
	}

	@PUT // Updating information
	@Path("/{brandId}") // showroom/getBrands
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void putBrands(@PathParam("brandId") int brandId, BrandEntity updatedBrand) {
		updatedBrand.setBrandId(brandId);
		service.updateBrand(updatedBrand);
	}

	@DELETE // Deleting information
	@Path("{brandId}") // showroom/getBrands
	public void deleteBrands(@PathParam("brandId") int brandId) {
		service.deleteBrand(brandId);
	}

	@Path("/{brandId}/products")
	public Products productsDelegation() {
		return new Products();
	}
}
