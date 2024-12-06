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

public class DonHangModel {
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

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public DonHangModel() {
		super();
	}
    
    
    
    
	    


}
