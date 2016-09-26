package com.lv.mybatis.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lv.mybatis.model.User;

public class MybatisLoadConfTest {
	private static SqlSessionFactory sessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sessionFactory;
	}

	public static void main(String[] args) {
		SqlSession session = getSession().openSession();
		try {
			User user = session.selectOne("com.lv.mybatis.model.UserMapper.selectUserByID",1);
			System.out.println(user.getUserName());
		} catch (Exception e){
	        e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
