package pers.cb2;
/*
 * 玩家类
 * 要求玩家名称创建后无法更改
 * 级别在1-999之间
 * 玩家升级经验公式
 */
public class Hero {
	private long id;
	private String nickName;
	private int level;
	private long exp;//升级所需经验
	private long currExp;//当前经验值

	public Hero(long id, String nickName, int level, long exp) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.level = level;
		this.exp = exp;
	}
	
	public long getCurrExp() {
		return currExp;
	}

	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}

	public Hero(String nickName){
		this.setNickName(nickName);//只能通过这里设置名字
	}
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <= 0) id = 1;
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	private void setNickName(String nickName) {
		if(nickName == null){
			nickName = "未命名英雄";
		}else{
			this.nickName = nickName;
		}
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level < 1 || level > 999){
			this.level = 1;
			//作弊过头，就等级归一
		}else{
			this.level = level;
		}
	}

	public long getExp() {
		exp = (level -1) * level + 1;
		return exp;
	}



}
