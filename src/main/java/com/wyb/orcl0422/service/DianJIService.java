package com.wyb.orcl0422.service;

import com.wyb.orcl0422.dao.DianjiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/25   16:52
 */
@Service
public class DianJIService {
    @Autowired
    DianjiMapper dianjiMapper;
}
