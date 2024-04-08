package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
    public Friend() {
    	
    }
    
    public Friend(String name, String hp, String school) {
    	super();
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}

	public void showInfo() {
		System.out.printf("이름: %s 핸드폰: %s 학교: %s%n", name, hp, school);
	}

}
