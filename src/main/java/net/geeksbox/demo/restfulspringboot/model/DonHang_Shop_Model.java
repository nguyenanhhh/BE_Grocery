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

public class DonHang_Shop_Model {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;

    @Column(name = "count")
    private int count;
    
    @Column(name = "img")
    private String img;
    
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    
    


    @Column(name = "storeID")
    private int storeID;
    
    @Column(name = "nameshop")
    private String nameshop;
    @Column(name = "orderID")
    private int orderID;
    
    @Column(name = "address")
    private String address;
    @Column(name = "status")
    private String status;
    public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	@Column(name = "statusTT")
    private String statusTT;
    @Column(name = "shipperID")
    private Integer shipperID=0;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public String getNameshop() {
		return nameshop;
	}
	public void setNameshop(String nameshop) {
		this.nameshop = nameshop;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusTT() {
		return statusTT;
	}
	public void setStatusTT(String statusTT) {
		this.statusTT = statusTT;
	}
	public Integer getShipperID() {
		
		return shipperID;
	}
	public void setShipperID(Integer shipperID) {
		
		this.shipperID = shipperID;
	}
	public DonHang_Shop_Model() {
		super();
	}
    
    

    
    
    
    
	    


}
