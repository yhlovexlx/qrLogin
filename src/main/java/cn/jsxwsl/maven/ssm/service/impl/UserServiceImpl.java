package cn.jsxwsl.maven.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jsxwsl.maven.ssm.bean.User;
import cn.jsxwsl.maven.ssm.dao.UserDao;
import cn.jsxwsl.maven.ssm.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserDao userdao;

	@Override
	public void update_Transactinal() {
		User user = new User();
		user.setAge(11);
		user.setId(1);
		userdao.updateUser(user);
//		int a=1/0;
		
	}

	@Override
	public void test_Transactinal() {
		User user = new User();
		user.setAge(11);
		user.setId(1);
		userdao.updateUser(user);
//		int a=1/0;
		
	}

	@Override
	public User getUserById(long id) {
		return userdao.selectUserById(id);
	}

	@Override
	public List<User> getUserList() {
		return userdao.getUserList();
	}

}
