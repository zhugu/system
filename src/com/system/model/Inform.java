package com.system.model;

import java.sql.Date;

/**
 * Created by asus on 2017/12/19.
 */
public class Inform {
    private Integer informid;
    private Date informtime;
    private String informinfo;

    public Inform(Integer informid, Date informtime, String informinfo) {
        this.informid = informid;
        this.informtime = informtime;
        this.informinfo = informinfo;
    }

    public Inform() {
    }

    public Integer getInformid() {
        return informid;
    }

    public void setInformid(Integer informid) {
        this.informid = informid;
    }

    public Date getInformtime() {
        return informtime;
    }

    public void setInformtime(Date informtime) {
        this.informtime = informtime;
    }

    public String getInforminfo() {
        return informinfo;
    }

    public void setInforminfo(String informinfo) {
        this.informinfo = informinfo;
    }

    @Override
    public String toString() {
        return "Inform{" +
                "informid=" + informid +
                ", informtime=" + informtime +
                ", informinfo='" + informinfo + '\'' +
                '}';
    }
}
