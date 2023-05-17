package net.geeksbox.demo.restfulspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ThongKeModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "thang")
    private int thang;
    
    
	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getDoanhthuthang() {
		return doanhthuthang;
	}

	public void setDoanhthuthang(int doanhthuthang) {
		this.doanhthuthang = doanhthuthang;
	}

	@Column (name="doanhthuthang")
	private int doanhthuthang;

	public ThongKeModel() {
		super();
	}

	public ThongKeModel( int thang, int doanhthuthang) {
		super();
		this.thang = thang;
		this.doanhthuthang = doanhthuthang;
	}
	
	
	
}
