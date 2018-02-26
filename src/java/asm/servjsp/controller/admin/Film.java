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
import com.sun.faces.facelets.util.Path;
import java.io.File;
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
 * @author Administrator
 */
public class Film extends HttpServlet {
    String path=new Upload().getPath();
    multipart_form_data mul=new multipart_form_data();
    covertJsonObject cv=new covertJsonObject();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
            try {
                String id="", name="",startDate="",description="",pathBanner="",pathImg="",linkFilm="",category="",isHot="",price="";
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
                id=st.get(0);
                film older=cv.getListFilm(URL_API_FILM+"/"+id).get(0);
                for(int i=0;i<st.size();i++){
                    if("Vui lòng cập nhật ảnh"==st.get(i)){
                        switch(i){
                                case 1:
                                    st.set(1,older.getName());
                                break;
                                case 2:
                                    st.set(2,older.getStartDate());
                                break;
                                case 3:
                                    st.set(3,older.getDescription());
                                break;
                                case 4:
                                    st.set(4,older.getPathBanner());
                                break;
                                case 5:
                                    st.set(5,older.getPathImg());
                                break;
                                case 6:
                                    st.set(6,older.getLinkFilm());
                                break;
                                case 7:
                                    st.set(7,String.valueOf(older.getIdCategory()));
                                break;
                                case 8:
                                    st.set(8,String.valueOf(older.getIsHot()));
                                break;
                                case 9:
                                    st.set(9,String.valueOf(older.getPrice()));
                                break;
                        }
                    }
                    if(4==i){
                        if(st.get(i)!=null){
                            String pathFile=Path.relative(path, older.getPathBanner());
                            File file=new File(pathFile);
                            file.delete();
                        }
                    }
                    if(5==i){
                        if(st.get(i)!=null){
                            String pathFile=Path.relative(path, older.getPathImg());
                            File file=new File(pathFile);
                            file.delete();
                        }
                    }
                    
                }
                name=st.get(1);startDate=st.get(2);description=st.get(3);pathBanner=st.get(4);pathImg=st.get(5);linkFilm=st.get(6);category=st.get(7);isHot=st.get(8);price=st.get(9);
                film film=new film(name,startDate, description, pathBanner, pathImg, linkFilm,Integer.parseInt(category),Integer.parseInt(isHot),Double.parseDouble(price));
                String url=URL_API_FILM+"/"+id;
                cv.putJsonFilm(url,film);
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
