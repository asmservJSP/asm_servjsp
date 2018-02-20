/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.servjsp.models.entity;

import java.util.List;

/**
 *
 * @author Admin
 */
public class restfulbooking {
    int status;
    String msg;
    List<booking> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<booking> getData() {
        return data;
    }

    public void setData(List<booking> data) {
        this.data = data;
    }
}
