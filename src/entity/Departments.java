package entity;

public class Departments {
	private int departId;
	private String departTitle;
	private String departInfo;
	
	public Departments() {
		
	}
	
	
	
	public Departments(int departId, String departTitle, String departInfo) {
		//super();
		this.departId = departId;
		this.departTitle = departTitle;
		this.departInfo = departInfo;
	}



	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getDepartTitle() {
		return departTitle;
	}
	public void setDepartTitle(String departTitle) {
		this.departTitle = departTitle;
	}
	public String getDepartInfo() {
		return departInfo;
	}
	public void setDepartInfo(String departInfo) {
		this.departInfo = departInfo;
	}
}
