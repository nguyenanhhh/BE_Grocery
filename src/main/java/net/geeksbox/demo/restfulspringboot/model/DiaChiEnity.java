package net.geeksbox.demo.restfulspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDiaChi")
public class DiaChiEnity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int UserID;

	    @Column(name = "DiaChi")
	    private String DiaChi;

		public int getUserID() {
			return UserID;
		}

		public void setUserID(int userID) {
			UserID = userID;
		}

		public String getDiaChi() {
			return DiaChi;
		}

		public void setDiaChi(String diaChi) {
			DiaChi = diaChi;
		}

		public DiaChiEnity() {
			super();
		}
	    
	    
	    

		
}
