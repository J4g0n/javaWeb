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
    private String newMessageButton(String label, int parentId) {
        return  "<a href=\"Exercice050_NouveauTopic.jsp?parent=" + parentId + "\">" +
                    "<button>" + label + "</button>" +
                "</a>";
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        ListIterator<Message> listTopic = DepotMessages.recupererDiscussions().listIterator();

        printer.println(newMessageButton("Nouveau topic", -1));
        printer.println("<br/><br/>");
        printer.println("<table>");

        while (listTopic.hasNext()) {
            Message m = listTopic.next();
            ListIterator<Message> listMessage = DepotMessages.recupererTopic(m.id).listIterator();
            printer.println("<tr>" +
                                "<td>Topic n°" + m.id + ": " + m.contenu + "</td>" +
                                "<td>" + newMessageButton("Repondre", m.id) + "</td>" +
                            "</tr>");
            while (listMessage.hasNext()) {
                m = listMessage.next();
                printer.println("<tr>" +
                                    "<td>    >> " + m.auteur + " " + m.id + ": " + m.contenu + "</br></td>" +
                                "</tr>");
            }
        }

        printer.println("</table>");
    }
}
