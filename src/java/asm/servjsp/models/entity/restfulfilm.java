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
public class restfulfilm {
    int status;
    String msg;
    List<film> data;

    public restfulfilm(int status, String msg, List<film> data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    

    public List<film> getData() {
        return data;
    }

    public void setData(List<film> data) {
        this.data = data;
    }

    
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
}
