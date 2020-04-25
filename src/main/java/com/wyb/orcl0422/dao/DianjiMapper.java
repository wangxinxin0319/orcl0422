package com.wyb.orcl0422.dao;

import com.wyb.orcl0422.pojo.Dianji;
import com.wyb.orcl0422.pojo.DianjiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DianjiMapper {
    int countByExample(DianjiExample example);

    int deleteByExample(DianjiExample example);

    int insert(Dianji record);

    int insertSelective(Dianji record);

    List<Dianji> selectByExample(DianjiExample example);

    int updateByExampleSelective(@Param("record") Dianji record, @Param("example") DianjiExample example);

    int updateByExample(@Param("record") Dianji record, @Param("example") DianjiExample example);

    void updateBybId(Dianji book);
}