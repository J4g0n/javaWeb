package controllers;

import depots.DepotMessages;
import modeles.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ipi on 08/01/2016.
 */
@WebServlet("/SrvMessages")
public class SrvMessages extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        ListIterator<Message> listMessage = DepotMessages.recupererTopic().listIterator();

        while (listMessage.hasNext()) {
            Message m = listMessage.next();
            printer.println("Message n°" + m.id + ": " + m.contenu);
        }
    }
}
