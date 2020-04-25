package com.wyb.orcl0422.dao;

import com.wyb.orcl0422.pojo.Awesome;
import com.wyb.orcl0422.pojo.AwesomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwesomeMapper {
    int countByExample(AwesomeExample example);

    int deleteByExample(AwesomeExample example);

    int insert(Awesome record);

    int insertSelective(Awesome record);

    List<Awesome> selectByExample(AwesomeExample example);

    int updateByExampleSelective(@Param("record") Awesome record, @Param("example") AwesomeExample example);

    int updateByExample(@Param("record") Awesome record, @Param("example") AwesomeExample example);

    Awesome selectBybId(String id);

    void updateByBid(Awesome awesome);
}