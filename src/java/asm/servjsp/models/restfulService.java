/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Admin
 */
public class restfulService {
    public static final String URL_API_FILM = "http://45.76.161.51/api/vi/films";
    public static final String URL_API_CATEGORY = "http://45.76.161.51/api/vi/categorys";
    public static final String URL_API_BOOKING = "http://45.76.161.51/api/vi/bookings";
    
    
    
    StringBuilder strBuf = new StringBuilder(); 
    public restfulService(){
    }
    public String methodGetRESTFUL(String urlRestFul) throws IOException{
        URL url = new URL(urlRestFul);;
        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        
        if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HTTP GET Request Failed with Error code : "
                              + conn.getResponseCode());
            }
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
        String output;
        while ((output = reader.readLine()) != null)  
                strBuf.append(output);
        conn.disconnect();
        return strBuf.toString();
    }
    public void methodPostRestFul(String urlRestFul,String resultJson) throws IOException{
        URL url = new URL(urlRestFul);
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setDoOutput(true);
	conn.setRequestMethod("POST");
	conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	OutputStream os = conn.getOutputStream();
	os.write(resultJson.getBytes("UTF-8"));
	os.flush();
        conn.getResponseCode();
	conn.disconnect();
    }
     public String methodDeleteRESTFUL(String urlRestFul) throws IOException{
        URL url = new URL(urlRestFul);;
        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        
        if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HTTP GET Request Failed with Error code : "
                              + conn.getResponseCode());
            }
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
        String output;
        while ((output = reader.readLine()) != null)  
                strBuf.append(output);
        conn.disconnect();
        return strBuf.toString();
    }
    public void methodPutRestFul(String urlRestFul,String resultJson) throws IOException{
        URL url = new URL(urlRestFul);
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setDoOutput(true);
	conn.setRequestMethod("PUT");
	conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	OutputStream os = conn.getOutputStream();
	os.write(resultJson.getBytes("UTF-8"));
	os.flush();
        conn.getResponseCode();
	conn.disconnect();
    }
}
