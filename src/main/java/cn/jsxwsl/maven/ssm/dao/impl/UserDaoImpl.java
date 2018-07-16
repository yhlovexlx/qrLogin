package cn.jsxwsl.maven.ssm.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import cn.jsxwsl.maven.ssm.bean.User;
import cn.jsxwsl.maven.ssm.dao.UserDao;


@Repository
public class UserDaoImpl implements UserDao{
	
	@Resource(name="sqlSessionMain")
	private SqlSession sqlSession;

	@Override
	public User selectUserById(long id) {
		return sqlSession.selectOne("UserMapper.selectUserById", id);
	}

	@Override
	public long updateUser(User user) {
		return sqlSession.update("UserMapper.updateUser", user);
	}

	@Override
	public List<User> getUserList() {
		return sqlSession.selectList("UserMapper.selectUserList");
	}

}
