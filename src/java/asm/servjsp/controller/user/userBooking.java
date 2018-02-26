/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.controller.user;

import asm.servjsp.models.covertJsonObject;
import asm.servjsp.models.entity.booking;
import asm.servjsp.models.entity.film;
import static asm.servjsp.models.restfulService.URL_API_FILM;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class userBooking extends HttpServlet {
covertJsonObject cv=new covertJsonObject();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        String idfilm=req.getParameter("film-id");
        String name=req.getParameter("user-name");
        String email=req.getParameter("email");
        String phone=req.getParameter("user-tel");
        String quality=req.getParameter("quatity");
        booking booking=new booking(name,phone,email,Integer.parseInt(idfilm),Integer.parseInt(quality));
        cv.postJsonBooking(booking);
//        resp.sendRedirect("index.jsp");
        req.setAttribute("booking", booking);
        req.getRequestDispatcher("booking-final.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        String id=req.getParameter("id");
        String url=URL_API_FILM+"/"+id;
        film film=cv.getListFilm(url).get(0);
        req.setAttribute("film", film);
        req.getRequestDispatcher("booking.jsp").forward(req, resp);
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
