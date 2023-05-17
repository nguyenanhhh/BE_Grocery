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
@Table(name = "[Stores]")

public class StoreEnity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int storeID;

	    @Column(name = "name")
	    private String name;

	   
	    
	    @Column(name = "ownerID")
	    private int ownerID;
	    @Column(name = "is_Active")
	    private Boolean isActive;

	    @Column(name = "is_Open")
	    private Boolean isOpen;
	    
	   
	   
	    @Column(name = "avatar")
	    private String avatar;
	    
	   
	    
	    @Column(name = "point")
	    private int point;
	   
	    @Column(name = "rating")
	    private float rating;
	    
	    @Column(name = "created_At")
	    private Date createdAt;

	    @Column(name = "updated_At")
	    private Date updatedAt;

		public int getStoreID() {
			return storeID;
		}

		public void setStoreID(int storeID) {
			this.storeID = storeID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		

		public int getOwnerID() {
			return ownerID;
		}

		public void setOwnerID(int ownerID) {
			this.ownerID = ownerID;
		}

		public Boolean getIsActive() {
			return isActive;
		}

		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}

		public Boolean getIsOpen() {
			return isOpen;
		}

		public void setIsOpen(Boolean isOpen) {
			this.isOpen = isOpen;
		}

		
		public String getAvatar() {
			return avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public int getPoint() {
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
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

		public StoreEnity() {
			super();
		}
	    
	   
		
	    
}
