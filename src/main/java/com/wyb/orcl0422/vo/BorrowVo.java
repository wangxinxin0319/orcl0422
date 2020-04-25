package com.wyb.orcl0422.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/24   19:47
 */
@Data
public class BorrowVo {

    private String bId;

    private String bookName;

    private String bIntroduce;

    private String bAuthor;

    private Integer count;

    private Integer borrowFlag;

    private String picUrl;
    private String borrowId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date borrowTime;

    private String userId;
    private String id;

    private String phone;

    private Date createTime;

    private String sex;

    private String email;

    private String password;

    private String userName;


}
