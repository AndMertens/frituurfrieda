package be.vdab.entiteiten;

import java.io.Serializable;



public class Gemeente implements Serializable {

	private final static long serialVersionUID = 1L;
	
	private String naam;
	private int postCode;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postcode) {
		this.postCode = postcode;
	}
	
	@Override public String toString(){
		return this.postCode + " " + this.naam;
	}
	
}
