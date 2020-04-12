package pers.cb;

import java.util.Scanner;

/*
 * 定义类，计算圆周长和面积
 */
public class Circle2 {
	//半径
	public double radius;
	//周长
	public double perimeter;
	//面积
	public double area;
	public Circle2(){
		getRadius();
	}
	public Circle2(double radius){
		if(radius > 0){
			this.radius = radius;
		}else{
			getRadius();
		}
	}
	public void getRadius(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入半径:");
		radius = input.nextDouble();
		input.close();
	}
	public void showPerimeter(){
		if(radius <= 0){
			System.out.println("半径不对啊");
			getRadius();
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("周长为:" + perimeter);
	}
	public void showArea(){
		if(radius <= 0){
			System.out.println("半径不对啊");
			getRadius();
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("面积为:" + area);
	}


}
