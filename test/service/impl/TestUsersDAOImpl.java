package service.impl;

import java.util.List;

import org.junit.Test;

import entity.Users;
import junit.framework.Assert;
import service.UsersDAO;

public class TestUsersDAOImpl {
	
//	@Test
//	public void getUid()
//	{
//		UsersDAOImpl udao = new UsersDAOImpl();
//		System.out.println(udao.getUid());
//	}
	
	@Test
	public void usersLogin()
	{
		Users u = new Users("00001", "张三", "123456", 0, "男", "15478964587", "zhangshan@a.com", 1, 1);
		UsersDAO udao = new UsersDAOImpl();
		Assert.assertEquals(true, udao.usersLogin(u));
	}
	
	@Test
	public void testUsersSelectAll() {
		UsersDAO udao = new UsersDAOImpl();
		List<Users> list = udao.usersSelectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
