package controllers;

import depots.DepotUtilisateurs;

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
@WebServlet("/SrvControleCompte")
public class SrvControleCompte extends HttpServlet {
    private boolean existeCompte(String login, String password) {
        return DepotUtilisateurs.existeUtilisateur(login, password);
    }

    private void creerCompte(String login, String password) {
        DepotUtilisateurs.creerUtilisateur(login, password);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String url = "/Exercice050_Enregistrement.jsp";

        if (existeCompte(login, password)) {
            printer.println("Ce compte existe déjà !");
        } else {
            creerCompte(login, password);
            url = "/Exercice050_Messages.jsp";
        }
        response.sendRedirect(url);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (existeCompte(login, password)) {
            request.getSession().setAttribute("login", login);

            String url = "/Exercice050_Messages.jsp";
            response.sendRedirect(url);
        }
    }
}
