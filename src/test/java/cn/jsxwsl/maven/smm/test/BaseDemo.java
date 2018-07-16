package cn.jsxwsl.maven.smm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.jsxwsl.maven.ssm.bean.User;
import cn.jsxwsl.maven.ssm.dao.UserDao;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
//加了之后就算是操作成功，也不会更改数据库的内容，spring会自动回滚
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional()
public class BaseDemo{
	

	@Autowired
	private UserDao userDao;
	
	@Test
	public void test01(){
		User user = userDao.selectUserById(1);
		System.out.println(user);
	}

	@Test
	public void test02(){
		User user = new User();
		user.setAge(11);
		user.setId(1);
		long updateUser = userDao.updateUser(user );
		System.out.println(updateUser);
	}

	
	@Test
	public void testPage(){
		User user = userDao.selectUserById(1);
		System.out.println(user);
		
	}
	
	
	
	
	
	
}
