package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class OnlineTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession(true); //lấy session(ko có thì tự tạo cái mới)

        // Nếu có tham số "reset", reset thời gian
        if ("true".equals(request.getParameter("reset"))) {
            session.removeAttribute("startTime"); // xóa mốc thời gian ban đầu
            response.sendRedirect("online");      // chuyển về trang chính sau khi reset
            return;
        }

        Long startTime = (Long) session.getAttribute("startTime"); // lấy thời điểm bắt đầu từ session
        if (startTime == null) {									// chưa có thì lưu thời điểm hiện tại
            startTime = System.currentTimeMillis();
            session.setAttribute("startTime", startTime);
        }

        long currentTime = System.currentTimeMillis();
        long onlineTime = (currentTime - startTime) / 1000;	//1k mili -> giây

        session.setAttribute("onlineTime", onlineTime);
        request.getRequestDispatcher("/online.jsp").forward(request, response);// lưu để jsp hiển thị rồi bay sang jsp
    }
}
