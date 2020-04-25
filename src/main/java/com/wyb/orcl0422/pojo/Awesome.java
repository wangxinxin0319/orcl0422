package com.wyb.orcl0422.pojo;

import org.apache.ibatis.plugin.Intercepts;

import java.math.BigDecimal;

public class Awesome {
    private String bId;

    private Integer likeCount;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}