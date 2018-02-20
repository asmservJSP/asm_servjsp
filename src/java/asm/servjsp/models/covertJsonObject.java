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
    restfulService REST=new restfulService();
    public List<film> convertFromJsonFilm() throws IOException{
        String rest=REST.methodGetRESTFUL(URL_API_FILM);
        restfulfilm ls=gson.fromJson(rest,restfulfilm.class);
        return ls.getData();
    }
    public String convertToJsonFilm(List<film> film){
        String jsonString=gson.toJson(film);
        return jsonString;
    }
    public List<category> convertFromJsonCategory() throws IOException{
        String rest=REST.methodGetRESTFUL(URL_API_CATEGORY);
        restfulcategory ls=gson.fromJson(rest,restfulcategory.class);
        return ls.getData();
    }
    public String convertToJsonCategory(List<category> category){
        String result=gson.toJson(category);
        return result;
    }
    public List<booking> convertFromJsonBooking() throws IOException{
        String rest=REST.methodGetRESTFUL(URL_API_BOOKING);
        restfulbooking ls=gson.fromJson(rest,restfulbooking.class);
        return ls.getData();
    }
    public String convertToJsonBooking(List<booking> booking){
        String jsonString=gson.toJson(booking);
        return jsonString;
    }
    public static void main(String[] args) throws IOException {
        covertJsonObject ob=new covertJsonObject();
        List<category> ls=ob.convertFromJsonCategory();
        System.out.println(ls.get(0));
        System.out.println(ob.convertToJsonCategory(ls));
    }
}
