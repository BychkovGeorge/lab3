import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.net.ssl.SSLEngine;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    public void init(){}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("welcome.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String choice = req.getParameter("choice");
       switch(choice){
           case "1":
               resp.sendRedirect("http://localhost:8080/lab3_war_exploded/sign_up");
               return;
           case "2":
               resp.sendRedirect("http://localhost:8080/lab3_war_exploded/sign_in");
               return;
           default:
               resp.sendRedirect("http://localhost:8080/lab3_war_exploded/welcome");
       }
    }
}
