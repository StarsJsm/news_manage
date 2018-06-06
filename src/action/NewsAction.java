package action;

import java.util.List;

import entity.News;
import service.NewsDAO;
import service.impl.NewsDAOImpl;

public class NewsAction extends SuperAction {
	public String query() {
		NewsDAO ndao = new NewsDAOImpl();
		List<News> newsAll = ndao.queryAllNews();
		session.setAttribute("news_listAll", newsAll);
//		for (int i = 0; i < newsAll.size(); i++) {
//			System.out.println(newsAll.get(i));
//		}
		return "query_success";
	}
	public String queryById() {
		NewsDAO ndao = new NewsDAOImpl();
		String id = request.getParameter("nid");
		int nid = Integer.parseInt(id);
		News news = ndao.queryNewsById(nid);
		news.setCount(news.getCount() + 1);
		session.setAttribute("news", news);
		ndao.updateNews(news);
		return "queryById_success";
	}
}
