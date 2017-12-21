package com.system.model;

/**
 * Created by asus on 2017/12/19.
 */
public class Apply {
    private Integer applyid;
    private String userid;
    private String applyinfo;
    private String applydate;
    private String examination;

    public Apply(Integer applyid, String userid, String applyinfo, String applydate, String examination) {
        this.applyid = applyid;
        this.userid = userid;
        this.applyinfo = applyinfo;
        this.applydate = applydate;
        this.examination = examination;
    }

    public Apply() {
    }

    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getApplyinfo() {
        return applyinfo;
    }

    public void setApplyinfo(String applyinfo) {
        this.applyinfo = applyinfo;
    }

    public String getApplydate() {
        return applydate;
    }

    public void setApplydate(String applydate) {
        this.applydate = applydate;
    }

    public String getExamination() {
        return examination;
    }

    public void setExamination(String examination) {
        this.examination = examination;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "applyid=" + applyid +
                ", userid='" + userid + '\'' +
                ", applyinfo='" + applyinfo + '\'' +
                ", applydate='" + applydate + '\'' +
                ", examination='" + examination + '\'' +
                '}';
    }
}
