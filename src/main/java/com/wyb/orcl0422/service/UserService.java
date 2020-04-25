package com.wyb.orcl0422.service;

import cn.hutool.crypto.SecureUtil;
import com.wyb.orcl0422.dao.TUserMapper;
import com.wyb.orcl0422.pojo.TUser;
import com.wyb.orcl0422.pojo.TUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22   14:07
 */
@Service
public class UserService {
    @Autowired
    TUserMapper tUserMapper;
    public int registerToUser(TUser tUser) {
        return tUserMapper.insert(tUser);
    }

    public TUser checkPhone(String phone) {
        return tUserMapper.selectPhone(phone);
    }

    public TUser checkUserNameAndPassword(String name, String password) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name",name);
        String md5Password = SecureUtil.md5(password);//密码加密
        map.put("password",md5Password);
        return tUserMapper.checkUserNameAndPassword(map);
    }
}
