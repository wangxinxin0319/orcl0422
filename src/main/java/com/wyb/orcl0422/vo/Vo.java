package com.wyb.orcl0422.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22   19:56
 */

public class Vo {
    private String bId;

    private String bName;

    private String bIntroduce;

    private String bAuthor;

    private BigDecimal count;

    private BigDecimal borrowFlag;

    private String picUrl;
    private String borrowId;

    private Date borrowTime;

    private String userId;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbIntroduce() {
        return bIntroduce;
    }

    public void setbIntroduce(String bIntroduce) {
        this.bIntroduce = bIntroduce;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public BigDecimal getBorrowFlag() {
        return borrowFlag;
    }

    public void setBorrowFlag(BigDecimal borrowFlag) {
        this.borrowFlag = borrowFlag;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
