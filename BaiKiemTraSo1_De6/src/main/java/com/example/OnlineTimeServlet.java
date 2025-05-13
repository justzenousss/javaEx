package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class OnlineTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession(true);

        // Nếu có tham số "reset", reset thời gian
        if ("true".equals(request.getParameter("reset"))) {
            session.removeAttribute("startTime"); // xóa mốc thời gian ban đầu
            response.sendRedirect("online");      // chuyển về trang chính sau khi reset
            return;
        }

        Long startTime = (Long) session.getAttribute("startTime");
        if (startTime == null) {
            startTime = System.currentTimeMillis();
            session.setAttribute("startTime", startTime);
        }

        long currentTime = System.currentTimeMillis();
        long onlineTime = (currentTime - startTime) / 1000;

        session.setAttribute("onlineTime", onlineTime);
        request.getRequestDispatcher("/online.jsp").forward(request, response);
    }
}
