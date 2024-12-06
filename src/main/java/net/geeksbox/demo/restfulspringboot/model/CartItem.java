package net.geeksbox.demo.restfulspringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="Cartitem")
public class CartItem {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name = "CartID")
	    private int CartID;
		
	    @Column(name = "productID")
	    private int productID;
	
	    @Column(name = "storeID")
	    private int storeID;
	    @Column(name = "count")
	    private int count;
	    @Column(name = "createdAt")
	    private Date createdAt;
	    @Column(name = "updateAt")
	    private Date updateAt;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCartID() {
			return CartID;
		}
		public void setCartID(int cartID) {
			CartID = cartID;
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
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdateAt() {
			return updateAt;
		}
		public void setUpdateAt(Date updateAt) {
			this.updateAt = updateAt;
		}
		public CartItem() {
			super();
		}
		
	    


}
