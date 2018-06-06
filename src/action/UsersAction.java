package action;

import java.util.List;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ModelDriven;

import entity.Users;
import service.UsersDAO;
import service.impl.UsersDAOImpl;

public class UsersAction extends SuperAction implements ModelDriven<Users>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Users user = new Users();
	
	@SkipValidation
	public String delete() {
		UsersDAO udao = new UsersDAOImpl();
		String uid = request.getParameter("uid");
		udao.usersDelect(uid);
		return "delete_success";
	}
	
	@SkipValidation
	public String query() {
		UsersDAO udao = new UsersDAOImpl();
		List<Users> listAll = udao.usersSelectAll();
		session.setAttribute("users_listAll", listAll);
		return "query_success";
	}
	
	public String login()
	{
		System.out.println("login>>>");
//		System.out.println(user.getUserId());
//		System.out.println(user.getUserPswd());
		UsersDAO udao = new UsersDAOImpl();
		Users u = udao.usersLogin(user);
		if (u != null) {
			session.setAttribute("loginUserName", u.getUserName());
			if(1==u.getAuthority()) {
				System.out.println("action: " + 1);
				return "loginUsers_success";
			}
			else {
				System.out.println("action: " + 0);
				return "loginNews_success";
			}
		}
		else {
			return "login_failure";
		}
	}
	
	public void validate()
    {
     	if("".equals(user.getUserId().trim()))
     	{
     		this.addFieldError("usernameError","用户名不能为空");
     	}
     	if(user.getUserPswd().length()<6)
     	{
     		this.addFieldError("passwordError","密码长度不能小于6");
     	}
     		
     		
    }
	
	@SkipValidation
	public String logout()
	{
		if (session.getAttribute("loginUserName") != null)
		{
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
	
	
//	@Override
	public Users getModel() {
		return this.user;
	}
	
	
}
