package cn.jsxwsl.maven.ssm.dao;

import java.util.List;

import cn.jsxwsl.maven.ssm.bean.User;


public interface UserDao {

	User selectUserById(long id);
	
	long updateUser(User user);

	List<User> getUserList();
	
}
