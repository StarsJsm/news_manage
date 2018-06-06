package entity;

public class Users {
	private String userId;
	private String userName;
	private String userPswd;
	private int departId;
	private String userSex;
	private String userTele;
	private String userEmail;
	private int status;
	private int authority;
	
	public Users() {
	}

	public Users(String userId, String userName, String userPswd, int departId, String userSex, String userTele,
			String userEmail, int status, int authority) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPswd = userPswd;
		this.departId = departId;
		this.userSex = userSex;
		this.userTele = userTele;
		this.userEmail = userEmail;
		this.status = status;
		this.authority = authority;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPswd() {
		return userPswd;
	}

	public void setUserPswd(String userPswd) {
		this.userPswd = userPswd;
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserTele() {
		return userTele;
	}

	public void setUserTele(String userTele) {
		this.userTele = userTele;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userPswd=" + userPswd + ", departId="
				+ departId + ", userSex=" + userSex + ", userTele=" + userTele + ", userEmail=" + userEmail
				+ ", status=" + status + ", authority=" + authority + "]";
	}
	
	
}
