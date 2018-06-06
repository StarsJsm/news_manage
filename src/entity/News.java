package entity;

import java.util.Date;


public class News {
	private int newsId;
	private String title;
	private String content;
	private String userId;
	private Date time;
	private int status;
	private int count;
	
	public News() {
		
	}
	
	

	public News(String title, String content, String userId,
			Date time, int status, int count) {
		super();
//		this.newsId = newsId;
		this.title = title;
		this.content = content;
		this.userId = userId;
		this.time = time;
		this.status = status;
		this.count = count;
	}

	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}



	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", content=" + content + ", userId=" + userId + ", time="
				+ time + ", status=" + status + ", count=" + count + "]";
	}
	
	
}
