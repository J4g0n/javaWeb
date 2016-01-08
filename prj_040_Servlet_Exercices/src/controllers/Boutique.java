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
@WebServlet("/Boutique")
public class Boutique extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        String choix = request.getParameter("choix");
        String message = null;

        if (choix != null) {
            if (choix.equals("tel")) {
                message = "Telephone";
            }
            if (choix.equals("con")) {
                message = "Console";
            }
            if (choix.equals("tv")) {
                message = "TV Plasma";
            }
            if (choix.equals("pc")) {
                message = "PC Portable";
            }
            printer.println("Vous avez choisi: " + message);
        }
    }
}
