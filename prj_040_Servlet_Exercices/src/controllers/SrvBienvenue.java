package controllers;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by ipi on 08/01/2016.
 */
@javax.servlet.annotation.WebServlet("/SrvBienvenue")
public class SrvBienvenue extends javax.servlet.http.HttpServlet {
    public SrvBienvenue() {
        super();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String language = getServletContext().getInitParameter("language");
        PrintWriter printer = response.getWriter();

        if (language == "FR") {
            printer.println("Bienvenue");
        } else {
            printer.println("Hello");
        }
    }
}
