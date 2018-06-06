package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport
		implements ServletRequestAware, ServletResponseAware, ServletContextAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ServletContext application;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;

//	@Override
	public void setServletContext(ServletContext application) {
		this.application = application;

	}

//	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

//	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = this.request.getSession();

	}

}
