package com.common.exception;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/showErrorPage")
public class ExceptionHandlerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        String message = (String) request.getAttribute("javax.servlet.error.message");

        request.setAttribute("statusCode", statusCode);
        request.setAttribute("message", message);

        request.getRequestDispatcher("/WEB-INF/view/common/exceptionPage.jsp").forward(request, response);
    }
}
