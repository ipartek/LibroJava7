package com.ipartek.formacion.ibonpomares.ejemplopoo.tipos;

public class Punto {

	
	private double x , y;
	//CREAMOS UN CONSTRUCTOR
	
//p2
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
		//setX(x);
		//setY(y);
	}
//p1
	public Punto (int x, int y){
		this((double) x , (double) y);
		
	}
//p3	
	public Punto() {
		// TODO Auto-generated constructor stub
		this(1.0, 1.0);
	}
	
	
	//GETERS Y SETERS
	public int getX() {
		return (int) x;
	}
	public void setX(int x) {
		this.x = x;
	}
	

	public int getY() {
		return (int) y;
	}
	public void setY(int y) {
		this.y = y;
	}
//--------------------------------
	
	public double getXDouble(){
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getYDouble(){
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
