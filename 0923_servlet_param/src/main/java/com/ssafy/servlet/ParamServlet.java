package com.ssafy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ParamServlet() {
        System.out.println("ParamServlet()...");
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("ParamServlet init()...");
	}


	public void destroy() {
		System.out.println("ParamServlet destory()...");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ParamServlet doGet()...");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ParamServlet doPost()...");
		
		String username = request.getParameter("username");
		String[] fruit = request.getParameterValues("fruit");
		
		// html 응답
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("입력한 내용은 다음과 같습니다.");
		out.println("</h2>");
		out.println("이름 : " + username + "<br/>");
		out.println("좋아하는 과일 : " + Arrays.toString(fruit) + "<br/>");
		out.println("</body>");
		out.println("</html>");
	}

}
