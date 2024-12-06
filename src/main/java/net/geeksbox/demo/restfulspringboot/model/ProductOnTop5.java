package net.geeksbox.demo.restfulspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter @Setter
public class ProductOnTop5 {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productID")
    private int productID;
	
	@Column(name = "countSold")
	private int countSold;
	
	@Column(name="name")
	private String name;
	
	@Column(name="img")
	private String img;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}


	public ProductOnTop5(int productID, int countSold, String name, String img) {
		super();
		this.productID = productID;
		this.countSold = countSold;
		this.name = name;
		this.img = img;
	}

	public ProductOnTop5() {super();}
}
