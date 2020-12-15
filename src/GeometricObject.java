import java.util.Date;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated=new java.util.Date();
	}
	
	protected GeometricObject(String color,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public boolean ifFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "created on"+dateCreated+"\ncolor:"+color+" and filled:"+filled;
	}
	
	//抽象方法getArea
	public abstract double getArea();
	//抽象方法getPerimeter
	public abstract double getPerimeter();
}
