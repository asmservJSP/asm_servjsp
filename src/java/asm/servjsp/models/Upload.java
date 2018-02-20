/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.models;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Upload {
    String path=getPathClass();
    public Upload(){
        
    }
    public String getPathClass(){
        try {
            return Class.forName("asm.servjsp.controller.adminHome").getResource("").getPath().substring(1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String getPath(){
        String fullpath="";
        String[] pathArr=new String[99];
        try {
            
            fullpath = URLDecoder.decode(path, "UTF-8");
            pathArr=fullpath.split("/build/web");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pathArr[0]+"/web";
    }
}
