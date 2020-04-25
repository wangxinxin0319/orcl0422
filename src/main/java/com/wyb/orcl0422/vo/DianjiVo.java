package com.wyb.orcl0422.vo;

import lombok.Data;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/25   17:17
 */
@Data
public class DianjiVo {
    private String bId;

    private String bookName;

    private String bookIntroduce;

    private String bookAuthor;

    private Integer borrowingCount;

    private Integer borrowingFlag;

    private String picUrl;


    private Integer traffic;

}
