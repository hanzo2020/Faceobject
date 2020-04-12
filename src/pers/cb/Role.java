package pers.cb;
//游戏角色类
public class Role {

		public String name;//角色名
		public int level;//角色等级
		public String job;//职业
		/*
		 * 默认构造方法
		 */
		public Role(){
			
		}
		/*
		 * 构造方法
		 * 1.没有返回值
		 * 2.方法名和类名一致
		 */
		public Role(String name, int level, String job){
			this.name = name;
			this.level = level;
			this.job = job;
		}
		/**
		 * 释放技能
		 */
		public void useSkill(){
			if(name.equals("邦哥")){
			System.out.println("全军突击");
			}else if(name.equals("孙悟空")){
				System.out.println("大闹天宫");
			}else{
				System.out.println("得得得得得");
			}
		}
		public void show(){
			System.out.println(name + "前来报到");
		}
}
