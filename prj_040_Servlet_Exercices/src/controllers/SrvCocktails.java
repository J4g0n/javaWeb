package controllers;

import modeles.Cocktail;
import utils.ParametresBD;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ipi on 12/01/2016.
 */
@WebServlet("/SrvCocktails")
public class SrvCocktails extends HttpServlet {
    private ArrayList<Cocktail> listCocktails() {
        String requete = "Select * From cocktail";
        ArrayList<Cocktail> listCocktail = new ArrayList<Cocktail>();
        Cocktail cocktailTmp = null;

        try {
            ResultSet resultats = ParametresBD.executeRequeteSQL(requete);

            while (resultats.next()) {
                cocktailTmp = new Cocktail(
                    resultats.getString(1),
                    resultats.getString(2),
                    resultats.getInt(3),
                    resultats.getString(4),
                    resultats.getString(5),
                    resultats.getInt(6),
                    resultats.getString(7)
                );
                listCocktail.add(cocktailTmp);
            }

            return listCocktail;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printer = response.getWriter();
        ArrayList<Cocktail> listCocktail = listCocktails();

        request.setAttribute("cocktails", listCocktail);
        request.getRequestDispatcher("Exercice070_Cocktails.jsp").forward(request, response);
    }
}
