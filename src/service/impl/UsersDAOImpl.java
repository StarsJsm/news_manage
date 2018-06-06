package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.Users;
import service.UsersDAO;

public class UsersDAOImpl implements UsersDAO {

	private String getUid() {
		Transaction ts = null;
		String hql;
		String uid = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			ts = session.beginTransaction();
			hql = "select max(userId) from Users";
			Query query = session.createQuery(hql);
			uid = (String)query.uniqueResult();
			if (uid == null || "".equals(uid)) {
				uid = "00001";
			}
			else {
				int tempI = Integer.parseInt(uid);
				tempI++;
				String temp = String.valueOf(tempI);
				for (int i = 0; i < 5; i++) {
					temp = "0" + temp;
				}
				ts.commit();
				return uid;
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			ts.commit();
			return null;
		}
		finally {
			if (ts != null) {
				ts = null;
			}
		}
		
		
		return null;
	}
	
	public Users usersLogin(Users u) {
		Transaction ts = null;
		String hql;
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			ts = session.beginTransaction();
			hql = "from Users where userId=? and userPswd=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, u.getUserId());
			query.setParameter(1, u.getUserPswd());
			List list = query.list();
			ts.commit();
			if (list.size() > 0)
			{
				return (Users) list.get(0);
			}
			else 
			{
				return null;
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			ts.commit();
			return null;
		}
		finally
		{
			if (ts != null) 
			{
				// ts.commit();
				ts = null;
			}
		}
	}

	public List<Users> usersSelectAll() {
		Transaction ts = null;
		String hql = "";
		List<Users> userList = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			ts = session.beginTransaction();
			hql = "from Users";
			Query query = session.createQuery(hql);
			userList = query.list();
			ts.commit();
			return userList;
		} 
		catch (Exception ex) {
			ex.printStackTrace();
			ts.commit();
			return userList;
		}
		finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	public Users usersSelectbyUid(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean usersDelect(String uid) {
		Transaction ts = null;
		
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			ts = session.beginTransaction();
			Users u = (Users) session.get(Users.class, uid);
			session.delete(u);
			ts.commit(); 
			return true;
		} 
		catch (Exception ex) {
			ex.printStackTrace();
			ts.commit();
			return false;
		}
		finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	public boolean usersUpdate(Users u) {
		// TODO Auto-generated method stub
		return false;
	}


}
