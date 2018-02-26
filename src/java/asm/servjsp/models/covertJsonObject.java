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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class covertJsonObject {
    Gson gson=new Gson();
    public List<film> getListFilm(String url) throws IOException{
        restfulService REST=new restfulService();
        String rest=REST.methodGetRESTFUL(url);
        restfulfilm ls=gson.fromJson(rest,restfulfilm.class);
        if(ls.getData().size()>0){
            for(int i=0;i<ls.getData().size();i++){
                if(ls.getData().get(i).getStartDate()!=null){
                    String a= ls.getData().get(i).getStartDate();
                    ls.getData().get(i).setStartDate(formatDateFilm(a));
                }
            }
        }
        Comparator c=Collections.reverseOrder(new sortByRollInCollections());
        Collections.sort(ls.getData(),c);
        return ls.getData();
    }
    public List<film> getListFilmTime(String url) throws IOException{
        restfulService REST=new restfulService();
        String rest=REST.methodGetRESTFUL(url);
        restfulfilm ls=gson.fromJson(rest,restfulfilm.class);
        if(ls.getData().size()>0){
            for(int i=0;i<ls.getData().size();i++){
                if(ls.getData().get(i).getStartDate()!=null){
                    String a= ls.getData().get(i).getStartDate();
                    ls.getData().get(i).setStartDate(a.substring(0, 10));
                }
            }
        }
        Comparator c=Collections.reverseOrder(new sortByRollInCollections());
        Collections.sort(ls.getData(),c);
        return ls.getData();
    }
    public void postJsonFilm(film film) throws IOException{
        String jsonString=gson.toJson(film);
        restfulService REST=new restfulService();
        REST.methodPostRestFul(URL_API_FILM, jsonString);
    }
    public List<category> getListCategory(String url) throws IOException{
        restfulService REST=new restfulService();
        String rest=REST.methodGetRESTFUL(url);
        restfulcategory ls=gson.fromJson(rest,restfulcategory.class);
        return ls.getData();
    }
    public void postJsonCategory(category category) throws IOException{
        String jsonString=gson.toJson(category);
        restfulService REST=new restfulService();
        REST.methodPostRestFul(URL_API_CATEGORY, jsonString);
    }
    public List<booking> getListBooking(String url) throws IOException{
        restfulService REST=new restfulService();
        String rest=REST.methodGetRESTFUL(url);
        restfulbooking ls=gson.fromJson(rest,restfulbooking.class);
        return ls.getData();
    }
    public void postJsonBooking(booking booking) throws IOException{
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
    public void deleteJson(String url) throws IOException{
        restfulService REST=new restfulService();
        REST.methodDeleteRESTFUL(url);
    }
    public void putJsonFilm(String url,film film) throws IOException{
        restfulService REST=new restfulService();
        String jsonString=gson.toJson(film);
        REST.methodPutRestFul(url, jsonString);
    }
    public void putJsonCategory(String url,category category) throws IOException{
        restfulService REST=new restfulService();
        String jsonString=gson.toJson(category);
        REST.methodPutRestFul(url, jsonString);
    }
    public void putJsonBooking(String url,booking booking) throws IOException{
        restfulService REST=new restfulService();
        String jsonString=gson.toJson(booking);
        REST.methodPutRestFul(url, jsonString);
    }
    public List<film> getListFilmByCategory(int idCategory) throws IOException{
        List<film> film=getListFilm(URL_API_FILM);
        List<film> filmFilter=film.stream().filter(x->x.getIdCategory()==idCategory).collect(Collectors.toList());
        return filmFilter;
    }
    public List<film> getListFilmAfterToday(String startDate) throws IOException,ParseException{
            List<film> film=getListFilmTime(URL_API_FILM);
            List<film> filmFilter=film.stream().filter(x->{
                    int a=compareDateToday(x.getStartDate());
                    int b=compareDateEndday(startDate, x.getStartDate());
                    if((a<0 || a==0)&& b<=0){
                        return true;
                    }else{
                        return false;
                    }
            }).collect(Collectors.toList());
            for(int i=0;i<filmFilter.size();i++){
                String a=filmFilter.get(i).getStartDate();
                filmFilter.get(i).setStartDate(formatDateFilm(a));
            }
            return filmFilter;
    }
    public List<film> getListFilmAfterTodayIsHot(String startDate,int isHot) throws IOException, ParseException{
        List<film> filmAfterToday=getListFilmAfterToday(startDate);
        List<film> filmFilter=filmAfterToday.stream().filter(x->x.getIsHot()==isHot).collect(Collectors.toList());
        return filmFilter;
    }
    public List<film> getListFilmBeforeToday(String EndDate) throws IOException,ParseException{
            List<film> film=getListFilmTime(URL_API_FILM);
            List<film> filmFilter=film.stream().filter(x->{
                    int a=compareDateToday(x.getStartDate());
                    int b=compareDateEndday(x.getStartDate(),EndDate );
                    if((a>0 || a==0)&& b<=0){
                        return true;
                    }else{
                        return false;
                    }
            }).collect(Collectors.toList());
            for(int i=0;i<filmFilter.size();i++){
                String a=filmFilter.get(i).getStartDate();
                filmFilter.get(i).setStartDate(formatDateFilm(a));
            }
            return filmFilter;
    }
    
    public List<film> getListFilmSortByHot() throws IOException{
        List<film> film=getListFilm(URL_API_FILM);
        List<film> filmFilter=film.stream().filter(x->x.getIsHot()==1).collect(Collectors.toList());
        return filmFilter;
    }
    public int compareDateToday(String date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date a = null;
                try {
                    a=sdf.parse(date);
                } catch (ParseException ex) {
                    Logger.getLogger(covertJsonObject.class.getName()).log(Level.SEVERE, null, ex);
                }
                int b=a.compareTo(new Date());
        return b;
    }
    public int compareDateEndday(String startDate,String EndDate){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date a = null;
                Date b=null;
                try {
                    a=sdf.parse(startDate);
                    b=sdf.parse(EndDate);
                } catch (ParseException ex) {
                    Logger.getLogger(covertJsonObject.class.getName()).log(Level.SEVERE, null, ex);
                }
                int c=a.compareTo(b);
        return c;
    }
    public List<film> getSearchFilm(String item,String search) throws IOException{
        List<film> films=getListFilm(URL_API_FILM);
        List<category> categorys=getListCategory(URL_API_CATEGORY);
        List<film> filmsFilter=new ArrayList<>();
        switch(item){
            case "id":
                filmsFilter=films.stream().filter(x->x.getId()==Integer.parseInt(search)).collect(Collectors.toList());
                break;
            case "name":
                filmsFilter=films.stream().filter(x->x.getName().toLowerCase().contains(search.toLowerCase())).collect(Collectors.toList());
                break;
            case "category":
                List<category> categoryFilter=categorys.stream().filter(x->x.getNameCategory().toLowerCase().contains(search.toLowerCase())).collect(Collectors.toList());
                filmsFilter=films.stream().filter(x->{
                    boolean a=false;
                    for(int i=0;i<categoryFilter.size();i++){
                        int id=categoryFilter.get(i).getIdCategory();
                        if(id==x.getId()){
                            a= true;
                        }
                        else{
                            a= false;
                        }
                    }
                    return a;
                }).collect(Collectors.toList());
                break;
        }
        return filmsFilter;
    }
    public boolean getBooleanDate(String startDate) throws ParseException{
        SimpleDateFormat dtf=new SimpleDateFormat("dd-MM-yyyy");
        Date a=dtf.parse(startDate);
        Date b=new Date();
        int c=a.compareTo(b);
        if(c<=0){
            return true;
        }
        else{
            return false;
        }
    }
}
