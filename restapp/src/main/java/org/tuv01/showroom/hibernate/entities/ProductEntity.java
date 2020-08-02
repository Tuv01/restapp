package org.tuv01.showroom.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "products")
@Table(name = "products")
public class ProductEntity {

	@Id
	@Column(name = "productId")
	int productId;

	// FK from brands
	// Need apply a Join
	@ManyToOne(targetEntity = BrandEntity.class)
	@JoinColumn(name = "brandId")
	BrandEntity brandEntity;

	@Column(name = "productName")
	String productName;

	@Column(name = "category")
	String category;

	@Column(name = "cost")
	String cost;

	public ProductEntity() {
		super();
	}

	public ProductEntity(int productId, BrandEntity brandEntity, String productName, String category, String cost) {
		super();
		this.productId = productId;
		this.brandEntity = brandEntity;
		this.productName = productName;
		this.category = category;
		this.cost = cost;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public BrandEntity getBrandEntity() {
		return brandEntity;
	}

	public void setBrandEntity(BrandEntity brandEntity) {
		this.brandEntity = brandEntity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
