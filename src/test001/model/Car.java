package test001.model;

import java.io.Serializable;

public class Car implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String  carLenling;
	private boolean mark;
	public String getCarLenling() {
		return carLenling;
	}
	public void setCarLenling(String carLenling) {
		this.carLenling = carLenling;
	}
	public boolean isMark() {
		return mark;
	}
	public void setMark(boolean mark) {
		this.mark = mark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
