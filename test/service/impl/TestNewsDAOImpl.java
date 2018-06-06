package service.impl;

import java.util.List;

import org.junit.Test;

import service.NewsDAO;
import entity.News;

public class TestNewsDAOImpl {
	
	@Test
	public void testQuerryAllNews() {
		NewsDAO ndao = new NewsDAOImpl();
		List<News> allList = ndao.queryAllNews();
		for (int i = 0; i < allList.size(); i++) {
			System.out.println(allList.get(i));
		}
	}
	@Test
	public void testQueryByIdNews() {
		NewsDAO ndao = new NewsDAOImpl();
		News news = ndao.queryNewsById(1);
		System.out.println(news);
	}
	@Test
	public void testUpdateCount() {
		NewsDAO ndao = new NewsDAOImpl();
		ndao.updateCount(1);
		News news = ndao.queryNewsById(1);
		System.out.println(news.getCount());
	}
	@Test
	public void testCheckNews() {
		NewsDAO ndao = new NewsDAOImpl();
		List<News> checkList = ndao.queryAllNews();
		for (int i = 0; i < checkList.size(); i++) {
			System.out.println(checkList.get(i));
		}
		
	}
}
