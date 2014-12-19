package be.vdab.entiteiten;

import java.io.Serializable;

public class Adres implements Serializable{

	private final static long serialVersionUID = 1L;
	
	private String straat;
	private String huisnr;
	private Gemeente gemeente;
	
	public String getStraat() {
		return straat;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
		
	public String getHuisnr() {
		return huisnr;
	}
	public void setHuisnr(String huisnr) {
		this.huisnr = huisnr;
	}
	
	public Gemeente getGemeente() {
		return gemeente;
	}
	public void setGemeente(Gemeente gemeente) {
		this.gemeente = gemeente;
	}
	
	@Override public String toString(){
		return straat + " " + getHuisnr();
	}
	
}
