package service;

import java.util.List;

import entity.News;

public interface NewsDAO {
	
	//查询所有新闻
	public List<News> queryAllNews();
	
	//查询用户发布的所有新闻
	public List<News> queryUserNews(String uid);
	
	//按id查询新闻
	public News queryNewsById(int nid);
	
	//查看未审核新闻
	public List<News> checkNews();
	
	//审核新闻
	public void updateStatus(News news); 
	
	//添加新闻
	public boolean addNews(News n);
	
	//修改新闻
	public boolean updateNews(News n);
	
	//删除新闻
	public boolean deleteNews(int nid);
	
	//阅读量加一
	public void updateCount(int nid);
}
