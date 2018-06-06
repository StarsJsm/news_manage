package service;

import java.util.List;

import entity.Users;

public interface UsersDAO {

	public Users usersLogin(Users u);
	
	public List<Users> usersSelectAll();
	
	public Users usersSelectbyUid(String uid);

	public boolean usersDelect(String uid);

	public boolean usersUpdate(Users u);
}
