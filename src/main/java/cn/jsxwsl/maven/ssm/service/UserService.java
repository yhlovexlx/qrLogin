package cn.jsxwsl.maven.ssm.service;

import java.util.List;

import cn.jsxwsl.maven.ssm.bean.User;




public interface UserService {
	
	
	public void update_Transactinal();
	
	public void test_Transactinal();
	
	public User getUserById(long id);
	
	public List<User> getUserList();
		

}
