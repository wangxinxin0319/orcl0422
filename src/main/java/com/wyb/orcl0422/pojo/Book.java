package com.wyb.orcl0422.pojo;

import java.math.BigDecimal;

public class Book {
    private String bId;

    private String bName;

    private String bIntroduce;

    private String bAuthor;

    private Integer count;

    private Integer borrowFlag;

    private String picUrl;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbIntroduce() {
        return bIntroduce;
    }

    public void setbIntroduce(String bIntroduce) {
        this.bIntroduce = bIntroduce == null ? null : bIntroduce.trim();
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor == null ? null : bAuthor.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBorrowFlag() {
        return borrowFlag;
    }

    public void setBorrowFlag(Integer borrowFlag) {
        this.borrowFlag = borrowFlag;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }
}