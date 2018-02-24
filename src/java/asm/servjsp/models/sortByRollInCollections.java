/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.models;

import asm.servjsp.models.entity.film;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class sortByRollInCollections implements Comparator<film> {

    @Override
    public int compare(film a, film b) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date c = null,d=null;
                try {
                    c=sdf.parse(a.getStartDate());
                    d=sdf.parse(b.getStartDate());
                } catch (ParseException ex) {
                    Logger.getLogger(covertJsonObject.class.getName()).log(Level.SEVERE, null, ex);
                }
                int e=c.compareTo(d);
        return e;
    }
    
}
