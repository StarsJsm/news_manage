package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import service.NewsDAO;
import db.MyHibernateSessionFactory;
import entity.News;

public class NewsDAOImpl implements NewsDAO{

	public List<News> queryAllNews() {
		Transaction ts = null;
		String hql = "";
		List<News> newsList = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			ts = session.beginTransaction();
			hql = "from News";
			Query query = session.createQuery(hql);
			newsList = query.list();
			ts.commit();
			return newsList;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			ts.commit();
			return newsList;
		}
		finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	public List<News> queryUserNews(String uid) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean addNews(News n) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateNews(News news) {
		Transaction tx = null;
		 try {
			 Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			 tx = session.beginTransaction();
			 session.update(news);
			 tx.commit();
			 return true;
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			tx.commit();
		    return false;
		}
		 finally
		 {
			 if(tx!=null)
			 {
				 tx = null;
			 }
			 
		 }	 
	}

	public boolean deleteNews(int nid) {
		// TODO Auto-generated method stub
		return false;
	}

	public News queryNewsById(int newsId) {
		Transaction ts = null;
		News news = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			ts = session.beginTransaction();
			news = (News) session.get(News.class, newsId);
			ts.commit();
			return news;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			ts.commit();
			return news;
		}
		finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	public void updateCount(int nid) {
		
		
	}

	public List<News> checkNews() {
		Transaction ts = null;
		String hql = "";
		List<News> checkList = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			ts = session.beginTransaction();
			hql = "from News where status=0";
			Query query = session.createQuery(hql);
			checkList = query.list();
			ts.commit();
			return checkList;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			ts.commit();
			return checkList;
		}
		finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	public void updateStatus(News news) {
		
	}

}
