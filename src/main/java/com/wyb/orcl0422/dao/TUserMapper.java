package com.wyb.orcl0422.dao;

import com.wyb.orcl0422.pojo.TUser;
import com.wyb.orcl0422.pojo.TUserExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    TUser selectPhone(String phone);

    TUser checkUserNameAndPassword(HashMap<String, Object> map);
}