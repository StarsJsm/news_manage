package entity;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import service.NewsDAO;
import service.impl.NewsDAOImpl;

public class TestUsers {

	@Test
	public void testSchemaExport() {
		Configuration config = new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		Session  session = sessionFactory.getCurrentSession();
		SchemaExport export = new SchemaExport(config);
		export.create(true, true);
	}
	
	@Test
	public void testUsersSave()
	{
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.getCurrentSession();
		Transaction tx;
		tx = session.beginTransaction();
		
		Users u1 = new Users("00001", "张三", "123456", 0, "男", "15478964587", "zhangshan@a.com", 1, 1);
		Users u2 = new Users("00002", "李四", "123456", 0, "男", "15478985287", "lisi@a.com", 1, 0);
		Users u3 = new Users("00003", "刘亦菲", "123456", 0, "女", "15476547587", "liuyf@a.com", 1, 0);
		
		session.save(u1);
		session.save(u2);
		session.save(u3);
		tx.commit();
		sessionFactory.close();
	}
	
	@Test
	public void testNewsSave()
	{
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.getCurrentSession();
		Transaction tx;
		tx = session.beginTransaction();
		//标题 内容 作者 时间 状态 点击量
		News n1 = new News("中美贸易战不打了！中国芯片攻坚战才刚开始", "中美贸易战不打了，但是中国芯片产业的攻坚战才刚刚开始，想要打赢这场“战争”，把握正确的战略方向少走弯路至关重要。尽管美国对中兴销售零部件和软件的禁令将被解除，但此事依然对中国的芯片产业敲响警钟，社会各界普遍呼吁国家层面加强对芯片研发的扶持力度。近日有媒体注意到，在中央国家机关发布的新采购名单中，服务器产品的技术要求格外引人注目，因为龙芯、申威、飞腾等国产CPU都被列入了政府采购名录，“中国政府采购也开始发力国产芯片了”。",
							"00001", new Date(), 0, 0);

		session.save(n1);
		
		tx.commit();
		sessionFactory.close();
	}
	
}
