package com.wyb.orcl0422.dao;

import com.wyb.orcl0422.pojo.Borrow;
import com.wyb.orcl0422.pojo.BorrowExample;
import java.util.List;

import com.wyb.orcl0422.vo.BorrowVo;
import org.apache.ibatis.annotations.Param;

public interface BorrowMapper {
    int countByExample(BorrowExample example);

    int deleteByExample(BorrowExample example);

    int insert(Borrow record);

    int insertSelective(Borrow record);

    List<Borrow> selectByExample(BorrowExample example);

    int updateByExampleSelective(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByExample(@Param("record") Borrow record, @Param("example") BorrowExample example);

    List<BorrowVo> list(String bId);
}