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
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
    public Connexion() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String message = null;

        if (login == null || login.equals("")) {
            message = "Login obligatoire";
        } else if (password == null || password.equals("")) {
            message = "Mot de passe obligatoire";
        } else if (!(password.equals("1234") && login.equals("Dupont"))) {
            message = "Vos identifiants sont incorrects";
        }

        if (message != null) {
            printer.append(message);
        } else {
            printer.append("Bienvenue !");
        }
    }
}
