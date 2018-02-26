/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.controller.admin;

import asm.servjsp.models.covertJsonObject;
import asm.servjsp.models.entity.booking;
import static asm.servjsp.models.restfulService.URL_API_BOOKING;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class delete_edit_Booking extends HttpServlet {
    covertJsonObject cv=new covertJsonObject();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        if(req.getParameterMap().containsKey("delete")){
            String delete=req.getParameter("delete");
        cv.deleteJson(URL_API_BOOKING +"/"+delete);
        resp.sendRedirect("index.jsp");
        }
        if(req.getParameterMap().containsKey("edit")){
            String edit=req.getParameter("edit");
            booking booking= cv.getListBooking(URL_API_BOOKING+"/"+edit).get(0);
            req.setAttribute("booking", booking);
            req.getRequestDispatcher("edit.jsp").forward(req, resp);
        }
        
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
