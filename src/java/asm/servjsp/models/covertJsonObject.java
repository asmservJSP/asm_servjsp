/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.models;

import asm.servjsp.models.entity.booking;
import asm.servjsp.models.entity.category;
import asm.servjsp.models.entity.film;
import asm.servjsp.models.entity.restfulbooking;
import asm.servjsp.models.entity.restfulcategory;
import asm.servjsp.models.entity.restfulfilm;
import static asm.servjsp.models.restfulService.URL_API_BOOKING;
import static asm.servjsp.models.restfulService.URL_API_CATEGORY;
import static asm.servjsp.models.restfulService.URL_API_FILM;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class covertJsonObject {
    Gson gson=new Gson();
    public List<film> convertFromJsonFilm() throws IOException{
        restfulService REST=new restfulService();
        String rest=REST.methodGetRESTFUL(URL_API_FILM);
        restfulfilm ls=gson.fromJson(rest,restfulfilm.class);
        if(ls.getData().size()>0){
            for(int i=0;i<ls.getData().size();i++){
                if(ls.getData().get(i).getStartDate()!=null){
                    String a= ls.getData().get(i).getStartDate();
                    ls.getData().get(i).setStartDate(formatDateFilm(a));
                }
            }
        }
        return ls.getData();
    }
    public void convertToJsonFilm(film film) throws IOException{
        String jsonString=gson.toJson(film);
        restfulService REST=new restfulService();
        REST.methodPostRestFul(URL_API_FILM, jsonString);
    }
    public List<category> convertFromJsonCategory() throws IOException{
        restfulService REST=new restfulService();
        String rest=REST.methodGetRESTFUL(URL_API_CATEGORY);
        restfulcategory ls=gson.fromJson(rest,restfulcategory.class);
        return ls.getData();
    }
    public void convertToJsonCategory(category category) throws IOException{
        String jsonString=gson.toJson(category);
        restfulService REST=new restfulService();
        REST.methodPostRestFul(URL_API_CATEGORY, jsonString);
    }
    public List<booking> convertFromJsonBooking() throws IOException{
        restfulService REST=new restfulService();
        String rest=REST.methodGetRESTFUL(URL_API_BOOKING);
        restfulbooking ls=gson.fromJson(rest,restfulbooking.class);
        return ls.getData();
    }
    public void convertToJsonBooking(booking booking) throws IOException{
        String jsonString=gson.toJson(booking);
        restfulService REST=new restfulService();
        REST.methodPostRestFul(URL_API_BOOKING, jsonString);
    }
    private String formatDateFilm(String a){
        String b=a.substring(0, 10);
        String[] c=b.split("-");
        String d="";
        for(int i=(c.length-1);i>=0;i--){
            d=d+c[i]+"-";
        }
        d=d.substring(0, 10);
        return d;
    }
    public static void main(String[] args) throws IOException {
        covertJsonObject ob=new covertJsonObject();
        System.out.println(ob.convertFromJsonFilm().get(9).getStartDate());
    }
}
