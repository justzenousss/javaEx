package com.example;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet Filter implementation class TEST2
 */
@WebFilter("/TEST2")
public class TEST2 extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public TEST2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();

        // Kiểm tra xem session đã có thuộc tính "hasVisited" chưa
        Boolean hasVisited = (Boolean) session.getAttribute("hasVisited");
        if (hasVisited == null || !hasVisited) {
            // Chưa truy cập -> tăng visitCount trong ServletContext
            ServletContext context = request.getServletContext();
            Integer visitCount = (Integer) context.getAttribute("visitCount");
            if (visitCount == null) {
                visitCount = 0;
            }
            context.setAttribute("visitCount", visitCount + 1);

            // Đánh dấu người dùng đã truy cập
            session.setAttribute("hasVisited", true);
        }
        chain.doFilter(request, response);
    }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
