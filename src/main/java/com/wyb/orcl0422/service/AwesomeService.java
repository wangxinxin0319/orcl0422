package com.wyb.orcl0422.service;

import com.wyb.orcl0422.dao.AwesomeMapper;
import com.wyb.orcl0422.pojo.Awesome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/24   18:23
 */
@Service
public class AwesomeService {
    @Autowired
    AwesomeMapper awesomeMapper;

    public void insert(String id) {
        Awesome awesome= awesomeMapper.selectBybId(id);
        if (awesome!=null) {//点赞数+1  更新
            awesome.setLikeCount(awesome.getLikeCount()+1);
            awesomeMapper.updateByBid(awesome);//修改
        }else{
            Awesome awesome1= new Awesome();
            awesome1.setbId(id);
            awesome1.setLikeCount(1);
            awesomeMapper.insert(awesome1);//新增
        }

    }
}
