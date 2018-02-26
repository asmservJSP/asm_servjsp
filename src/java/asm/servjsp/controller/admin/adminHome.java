/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.controller.admin;

import asm.servjsp.models.Upload;
import asm.servjsp.models.covertJsonObject;
import asm.servjsp.models.entity.film;
import asm.servjsp.models.multipart_form_data;
import static asm.servjsp.models.restfulService.URL_API_FILM;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Admin
 */
public class adminHome extends HttpServlet {
    String path=new Upload().getPath();
    multipart_form_data mul=new multipart_form_data();
    covertJsonObject cv=new covertJsonObject();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
            try {
                String name="",startDate="",description="",pathBanner="",pathImg="",linkFilm="",category="",isHot="",price="";
                ServletFileUpload upload=mul.getServletFileUpload();
                List<String> st=new ArrayList<>();
                if(upload.isMultipartContent(req)){
                        List<FileItem> multiparts=upload.parseRequest(req);
                        Iterator<FileItem> iter = multiparts.iterator();
                        while(iter.hasNext()){
                            FileItem item=iter.next();
                            if(item.isFormField()){
                                mul.getValueForm(st, item,path);
                            }
                            else{
                                mul.getValueForm(st, item,path);
                            }
                        } 
                 }
                name=st.get(0);startDate=st.get(1);description=st.get(2);pathBanner=st.get(3);pathImg=st.get(4);linkFilm=st.get(5);category=st.get(6);isHot=st.get(7);price=st.get(8);
                film film=new film(name,startDate, description, pathBanner, pathImg, linkFilm,Integer.parseInt(category),Integer.parseInt(isHot),Double.parseDouble(price));
                cv.postJsonFilm(film);
                resp.sendRedirect("index.jsp");
        } catch (Exception ex) { 
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<script language=\"javascript\">");
                out.println("alert(\"Sảm phẩm đã tồn tại\");");
                out.println("location='index.jsp';");
                out.println("</script>");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       
       String b=req.getParameter("id");
       String method=req.getParameter("method");
       if("delete".equals(method)){
           cv.deleteJson(URL_API_FILM+"/"+b);
           resp.sendRedirect("index.jsp");
       }
       if("edit".equals(method)){
           film film=cv.getListFilmTime(URL_API_FILM+"/"+b).get(0);
           req.setAttribute("film", film);
           req.getRequestDispatcher("edit.jsp").forward(req, resp);
       }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
