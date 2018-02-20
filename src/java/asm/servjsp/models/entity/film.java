/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.models.entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class film {
    int id;
    String name;
    String startDate;
    String description;
    String pathBanner;
    String pathImg;
    String linkFilm;
    int idCategory;
    int isHot;
    double price;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public film(int id, String name, String StartDate, String description, String pathBanner, String pathImg, String linkFilm, int idCategory, int isHot, double price) {
        this.id = id;
        this.name = name;
        this.startDate = StartDate;
        this.description = description;
        this.pathBanner = pathBanner;
        this.pathImg = pathImg;
        this.linkFilm = linkFilm;
        this.idCategory = idCategory;
        this.isHot = isHot;
        this.price = price;
    }

    public film(String name, String StartDate, String description, String pathBanner, String pathImg, String linkFilm, int idCategory, int isHot, double price) {
        this.name = name;
        this.startDate = StartDate;
        this.description = description;
        this.pathBanner = pathBanner;
        this.pathImg = pathImg;
        this.linkFilm = linkFilm;
        this.idCategory = idCategory;
        this.isHot = isHot;
        this.price = price;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public String getLinkFilm() {
        return linkFilm;
    }

    public void setLinkFilm(String linkFilm) {
        this.linkFilm = linkFilm;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIsHot() {
        return isHot;
    }

    public void setIsHot(int isHot) {
        this.isHot = isHot;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getPathBanner() {
        return pathBanner;
    }

    public void setPathBanner(String pathBanner) {
        this.pathBanner = pathBanner;
    }
}
