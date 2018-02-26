/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.models.entity;

/**
 *
 * @author Admin
 */
public class booking {
    int idBooking;
    String name;
    String phone;
    String email;
    int idFilm;
    int quality;

    public booking(int idBooking, String name, String phone, String email, int idFilm, int quality) {
        this.idBooking = idBooking;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.idFilm = idFilm;
        this.quality = quality;
    }

    public booking(String name, String phone, String email, int idFilm, int quality) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.idFilm = idFilm;
        this.quality = quality;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    
}
