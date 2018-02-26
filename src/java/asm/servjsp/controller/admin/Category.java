/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.controller.admin;

import asm.servjsp.models.covertJsonObject;
import asm.servjsp.models.entity.category;
import asm.servjsp.models.restfulService;
import static asm.servjsp.models.restfulService.URL_API_CATEGORY;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class Category extends HttpServlet {
    covertJsonObject cv=new covertJsonObject();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); 
        String category=req.getParameter("category");
        category dt=new category(category);
        cv.postJsonCategory(dt);
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        if(req.getParameterMap().containsKey("delete")){
            String delete=req.getParameter("delete");
        cv.deleteJson(URL_API_CATEGORY +"/"+delete);
        resp.sendRedirect("index.jsp");
        }
        if(req.getParameterMap().containsKey("edit")){
        String edit=req.getParameter("edit");
        category category= cv.getListCategory(URL_API_CATEGORY+"/"+edit).get(0);
        req.setAttribute("category", category);
        req.getRequestDispatcher("edit.jsp").forward(req, resp);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
