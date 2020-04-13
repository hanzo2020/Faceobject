package pers.cb;

public class Circle3 {
	private double radius;
	private double perimeter;
	private double area;
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		if(radius <= 0){
			radius = 1;
		}else{
			this.radius = radius;//this ->自指针
		}
		//封装的好处，对传入的属性进行简单的验证
	}
}
