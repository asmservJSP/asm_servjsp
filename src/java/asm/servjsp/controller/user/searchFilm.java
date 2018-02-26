/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.controller.user;

import asm.servjsp.models.covertJsonObject;
import asm.servjsp.models.entity.film;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class searchFilm extends HttpServlet {
    covertJsonObject cv=new covertJsonObject();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        String item=req.getParameter("sorting_item");
        String search=req.getParameter("search");
        List<film> films=cv.getSearchFilm(item, search);
        req.setAttribute("films", films);
        req.getRequestDispatcher("result-film.jsp").forward(req, resp);
    }

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
