package net.geeksbox.demo.restfulspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Review")
public class ReviewModel {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int reviewID;

	    @Column(name = "orderID")
	    private int orderID;
	    
	    @Column(name = "userID")
	    private int userID;

	    @Column(name = "productID")
	    private int productID;

	    @Column(name = "storeID")
	    private int storeID;

	    @Column(name = "contents")
	    private String contents;
	    
	    @Column(name = "avatar")
	    private String avatar;
	    public String getAvatar() {
			return avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		@Column(name = "rating")
	    private float rating;
	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Column(name = "name")
	    private String name;
		public int getReviewID() {
			return reviewID;
		}

		public void setReviewID(int reviewID) {
			this.reviewID = reviewID;
		}

		public int getOrderID() {
			return orderID;
		}

		public void setOrderID(int orderID) {
			this.orderID = orderID;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public int getProductID() {
			return productID;
		}

		public void setProductID(int productID) {
			this.productID = productID;
		}

		public int getStoreID() {
			return storeID;
		}

		public void setStoreID(int storeID) {
			this.storeID = storeID;
		}

		public String getContents() {
			return contents;
		}

		public void setContents(String contents) {
			this.contents = contents;
		}

		public float getRating() {
			return rating;
		}

		public void setRating(float rating) {
			this.rating = rating;
		}

		public ReviewModel() {
			super();
		}
	    
}
