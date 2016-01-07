package controllers;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by ipi on 07/01/2016.
 */
@WebServlet("/Bonjour")
public class Bonjour extends javax.servlet.http.HttpServlet {
    public Bonjour() {
        super();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter printer = response.getWriter();
        printer.println("Bonjour " + request.getParameter("nom"));
    }
}
