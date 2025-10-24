package com.fw.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/a_check/*.do")
public class AdminFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		HttpSession session = req.getSession(false);
		
		String id = session != null ? (String)session.getAttribute("id") : null;
		
		// 로그인 된 경우
		if(id != null && session.getAttribute("is_admin").equals("Y")) {
			chain.doFilter(req, resp);
			return;
		}
		
		// 로그인 안된 경우
		String path = req.getContextPath();
		resp.sendRedirect(path + "/user/login.do");
	}
}
