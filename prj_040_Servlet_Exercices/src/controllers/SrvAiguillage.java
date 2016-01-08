package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ipi on 08/01/2016.
 */
@WebServlet("/SrvAiguillage")
public class SrvAiguillage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        String route = request.getParameter("route");

        if (route != null) {
            if (route.equals("factures")) {
                getServletContext().getRequestDispatcher("/SrvFactures").forward(request, response);
            }
            if (route.equals("espacePerso")) {
                getServletContext().getRequestDispatcher("/SrvEspacePerso").forward(request, response);
            }
        }
    }
}
