package net.geeksbox.demo.restfulspringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "[Category]")
@Getter @Setter
public class Category {
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryID;
	 @Column(name = "name")
	private String name;
	 @Column(name = "image")
	private String image;
	 @Column(name = "is_Deleted")
	private Boolean isDeleted;
	 @Column(name = "created_At")
	 private Date createdAt;

	 @Column(name = "updated_At")
	 private Date updatedAt;

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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

	public Category(int categoryID, String name, String image, Boolean isDeleted, Date createdAt, Date updatedAt) {
		super();
		this.categoryID = categoryID;
		this.name = name;
		this.image = image;
		this.isDeleted = isDeleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Category() {
		
	}
	
	 
	

}
