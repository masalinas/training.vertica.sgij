package com.thingtrack.training.vertica.sgij.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;

import java.util.Date;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = "product_dimension")
@ApiModel(description = "Class representing a product.")
public class Product implements Serializable {  
	@EmbeddedId
    private ProductId id;
	
    @Column(name = "product_description", nullable = true)
    @ApiModelProperty(notes = "Description of the product.", example = "Brand #4 brandy", required = false, position = 1)
    private String description;

    @Column(name = "product_price", nullable = true)
    @ApiModelProperty(notes = "Price of the product.", example = "5.4", required = true, position = 2)
    private float price;

    @Column(name = "discontinued_flag", columnDefinition = "TINYINT(1)", nullable = true)    
    @ApiModelProperty(notes = "Status of the product.", example = "true", required = true, position = 3)
    private boolean active = true;

    public Product() {        
    }

    public Product(ProductId id, String description, float price, boolean active, Date createdAt) {        
        this.id = id;
    	this.description = description;
        this.price = price;
        this.active = active;
    }
  
    public ProductId getId() {
        return id;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
