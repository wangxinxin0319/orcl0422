package com.wyb.orcl0422.pojo;

import java.math.BigDecimal;

public class Dianji {
    private String bId;

    private Integer traffic;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }
}