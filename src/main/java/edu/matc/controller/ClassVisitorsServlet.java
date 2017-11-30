package edu.matc.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ClassVisitorsServlet",
        urlPatterns = {"/ClassVisitorsServlet"})

public class ClassVisitorsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idSectionTable = request.getParameter("id");
        //TODO process the section by id


        String url = "jsp/ClassVisitors.jsp";
        request.getRequestDispatcher(url).forward(request, response);
    }
}
