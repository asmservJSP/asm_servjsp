/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.controller.admin;

import asm.servjsp.models.covertJsonObject;
import asm.servjsp.models.entity.category;
import static asm.servjsp.models.restfulService.URL_API_CATEGORY;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class putCategory extends HttpServlet {
    covertJsonObject cv=new covertJsonObject();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       
       String id=req.getParameter("idCategory");
       String name=req.getParameter("nameCategory");
       
       category category=new category(name);
       cv.putJsonCategory(URL_API_CATEGORY+"/"+id, category);
       resp.sendRedirect("index.jsp");
       
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
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
