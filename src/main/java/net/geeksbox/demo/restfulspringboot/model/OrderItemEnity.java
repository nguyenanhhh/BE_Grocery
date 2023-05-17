package net.geeksbox.demo.restfulspringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="[OrderItem]")
public class OrderItemEnity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "orderID")
	    private int orderID;
	    @Column(name = "productID")
	    private int productID;
	    @Column(name = "count")
	    private int count;
	    @Column(name = "created_At")
	    private Date createdAt;
	    
	    @Column(name = "updated_At")
	    private Date updatedAt;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getOrderID() {
			return orderID;
		}

		public void setOrderID(int orderID) {
			this.orderID = orderID;
		}

		public int getProductID() {
			return productID;
		}

		public void setProductID(int productID) {
			this.productID = productID;
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

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		public OrderItemEnity() {
			super();
		}

	
		
	    
}
