package cn.jsxwsl.maven.ssm.bean;

import java.util.List;


public class User {

	private int id;
	private String userName;
	private int age;

	private List<Privilege> privileges;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age
				+ ", privileges=" + privileges + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
