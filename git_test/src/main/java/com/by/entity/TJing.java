package com.by.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TJing)实体类
 *
 * @author makejava
 * @since 2019-12-16 10:04:12
 */
public class TJing implements Serializable {
    private static final long serialVersionUID = 666400093281752390L;
    
    private Integer jingId;
    
    private Integer jingFalstmoney;
    
    private Date jingFalstdate;
    
    private Date jingLastdate;
    
    private Integer jingAgreemoney;
    
    private String jingIdea;
    
    private String jingReview;
    
    private Date jingZhuang;
    
    private String jingMoneyimplement;
    
    private String jingImg;
    
    private Integer reId;


    public Integer getJingId() {
        return jingId;
    }

    public void setJingId(Integer jingId) {
        this.jingId = jingId;
    }

    public Integer getJingFalstmoney() {
        return jingFalstmoney;
    }

    public void setJingFalstmoney(Integer jingFalstmoney) {
        this.jingFalstmoney = jingFalstmoney;
    }

    public Date getJingFalstdate() {
        return jingFalstdate;
    }

    public void setJingFalstdate(Date jingFalstdate) {
        this.jingFalstdate = jingFalstdate;
    }

    public Date getJingLastdate() {
        return jingLastdate;
    }

    public void setJingLastdate(Date jingLastdate) {
        this.jingLastdate = jingLastdate;
    }

    public Integer getJingAgreemoney() {
        return jingAgreemoney;
    }

    public void setJingAgreemoney(Integer jingAgreemoney) {
        this.jingAgreemoney = jingAgreemoney;
    }

    public String getJingIdea() {
        return jingIdea;
    }

    public void setJingIdea(String jingIdea) {
        this.jingIdea = jingIdea;
    }

    public String getJingReview() {
        return jingReview;
    }

    public void setJingReview(String jingReview) {
        this.jingReview = jingReview;
    }

    public Date getJingZhuang() {
        return jingZhuang;
    }

    public void setJingZhuang(Date jingZhuang) {
        this.jingZhuang = jingZhuang;
    }

    public String getJingMoneyimplement() {
        return jingMoneyimplement;
    }

    public void setJingMoneyimplement(String jingMoneyimplement) {
        this.jingMoneyimplement = jingMoneyimplement;
    }

    public String getJingImg() {
        return jingImg;
    }

    public void setJingImg(String jingImg) {
        this.jingImg = jingImg;
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

}