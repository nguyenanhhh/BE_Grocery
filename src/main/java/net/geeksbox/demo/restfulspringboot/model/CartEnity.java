package net.geeksbox.demo.restfulspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class CartEnity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int cartID;

	    @Column(name = "userID")
	    private int userID;

		public int getCartID() {
			return cartID;
		}

		public void setCartID(int cartID) {
			this.cartID = cartID;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public CartEnity() {
			super();
		}
	    
}
