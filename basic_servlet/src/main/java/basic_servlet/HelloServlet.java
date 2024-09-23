package basic_servlet;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class HelloServlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		if (request.getMethod().equals("POST")) {
			request.setCharacterEncoding("utf-8");  // 이게 안들어가면 post 방식일 때 한글이 다 깨짐
		}
	}

}
