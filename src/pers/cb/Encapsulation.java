package pers.cb;
/**
 * 使用封装解决设计上的缺陷：隐藏对象的属性和实现细节，仅对外公开接口，
 * 控制在程序中属性的读取和修改的访问级别
 * this表示指向当前对象
 * @author 10536
 *
 */
public class Encapsulation {
	private int age;
	public void setAge(int age){
		this.age = age;
	}
}
