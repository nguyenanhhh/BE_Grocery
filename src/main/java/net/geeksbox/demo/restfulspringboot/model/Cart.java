package net.geeksbox.demo.restfulspringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "productID")
	    private int productID;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "slug")
	    private String slug;
	    
	    @Column(name = "description")
	    private String description;
	    @Column(name = "price")
	    private int price;

	    @Column(name = "promotional_Price")
	    private int promotionalPrice;
	    
	    @Column(name = "quantity")
	    private int quantity;
	    
	    @Column(name = "sold")
	    private int sold;
	    
	    @Column(name = "is_Active")
	    private Boolean isActive;
	    @Column(name = "is_Selling")
	    private Boolean isSelling;
	    
	    @Column(name = "categoryID")
	    private int categoryID;
	    @Column(name = "storeID")
	    private Boolean storeID;
	    
	    @Column(name = "rating")
	    private float rating;
	    
	    @Column(name = "created_At")
	    private Date createdAt;

	    @Column(name = "updated_At")
	    private Date updatedAt;
	    
	    @Column(name = "img")
	    private String img;
	    @Column(name = "count")
	    private int count;
		public int getProductID() {
			return productID;
		}
		public void setProductID(int productID) {
			this.productID = productID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSlug() {
			return slug;
		}
		public void setSlug(String slug) {
			this.slug = slug;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getPromotionalPrice() {
			return promotionalPrice;
		}
		public void setPromotionalPrice(int promotionalPrice) {
			this.promotionalPrice = promotionalPrice;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getSold() {
			return sold;
		}
		public void setSold(int sold) {
			this.sold = sold;
		}
		public Boolean getIsActive() {
			return isActive;
		}
		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}
		public Boolean getIsSelling() {
			return isSelling;
		}
		public void setIsSelling(Boolean isSelling) {
			this.isSelling = isSelling;
		}
		public int getCategoryID() {
			return categoryID;
		}
		public void setCategoryID(int categoryID) {
			this.categoryID = categoryID;
		}
		public Boolean getStoreID() {
			return storeID;
		}
		public void setStoreID(Boolean storeID) {
			this.storeID = storeID;
		}
		public float getRating() {
			return rating;
		}
		public void setRating(float rating) {
			this.rating = rating;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public Cart() {
			
		}
	    
	
}
