package controllers;

import depots.DepotMessages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by ipi on 11/01/2016.
 */
@WebServlet("/NouveauTopic")
public class NouveauTopic extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contenu = request.getParameter("contenu");
        //String parent = request.getParameter("parent");
        String parentId = request.getSession().getAttribute("parent").toString();
        String login = request.getSession().getAttribute("login").toString();

        DepotMessages.ajouterMessage(login, contenu, Integer.parseInt(parentId));

        getServletContext().getRequestDispatcher("/SrvMessages").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
