	package net.geeksbox.demo.restfulspringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="[Order]")
public class OrderEnity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int orderID;

	    @Column(name = "userID")
	    private int userID;

	    @Column(name = "storeID")
	    private int storeID;

	    @Column(name = "address")
	    private String address;
	    
	    @Column(name = "phone")
	    private String phone;
	    
	    @Column(name = "statusTT")
	    private String statusTT;
	    
	    @Column(name = "status")
	    private String status;
	    
	    @Column(name = "shipperID")
	    private Integer shipperID ;
	    
	    
	    @Column(name = "costSum")
	    private int costSum;
	    
	    
	    @Column(name = "created_At")
	    private Date created_At;

	    @Column(name = "updated_At")
	    private Date updated_At;

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

		public int getStoreID() {
			return storeID;
		}

		public void setStoreID(int storeID) {
			this.storeID = storeID;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getStatusTT() {
			return statusTT;
		}

		public void setStatusTT(String statusTT) {
			this.statusTT = statusTT;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getShipperID() {
			return shipperID;
		}

		public void setShipperID(Integer shipperID) {
			if (shipperID == null) {
		        this.shipperID=0;
		    }
			this.shipperID = shipperID;
		}

		public int getCostSum() {
			return costSum;
		}

		public void setCostSum(int costSum) {
			this.costSum = costSum;
		}

		public Date getCreated_At() {
			return created_At;
		}

		public void setCreated_At(Date created_At) {
			this.created_At = created_At;
		}

		public Date getUpdated_At() {
			return updated_At;
		}

		public void setUpdated_At(Date updated_At) {
			this.updated_At = updated_At;
		}

		public OrderEnity(int orderID, int userID, int storeID, String address, String phone, String statusTT,
				String status, int shipperID, int costSum, Date created_At, Date updated_At) {
			super();
			this.orderID = orderID;
			this.userID = userID;
			this.storeID = storeID;
			this.address = address;
			this.phone = phone;
			this.statusTT = statusTT;
			this.status = status;
			this.shipperID = shipperID;
			this.costSum = costSum;
			this.created_At = created_At;
			this.updated_At = updated_At;
		}

		public OrderEnity() {
			super();
		}
	    
	    
	    
}
