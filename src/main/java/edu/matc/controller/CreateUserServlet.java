package edu.matc.controller;

import edu.matc.entity.DancertableEntity;
import edu.matc.entity.GendertableEntity;
import edu.matc.persistence.DancerHibernateDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.time.LocalDate;

import edu.matc.persistence.GenderHibernateDao;
import org.apache.log4j.Logger;

@WebServlet(
        urlPatterns = {"/createUserServlet"}
)
public class CreateUserServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



            GenderHibernateDao dancer = new GenderHibernateDao();
            LocalDate currentDate = LocalDate.now();

            String userName = req.getParameter("userName");
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            int gender = Integer.parseInt(req.getParameter("gender"));
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            dancer.addNewDancer(currentDate, email, firstName, lastName, password, "", userName,
                    gender);

            String url = "/jsp/result.jsp";
            resp.sendRedirect(url);

        }
}