package com.wyb.orcl0422.dao;

import com.wyb.orcl0422.pojo.Book;
import com.wyb.orcl0422.pojo.BookExample;
import java.util.List;
import java.util.Map;

import com.wyb.orcl0422.vo.DianjiVo;
import com.wyb.orcl0422.vo.Vo;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    int countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    List<Vo> selectAll(Map<Object, Object> map);

    void updateBybId(Book book);

    Book selectById(String bId);


    DianjiVo selectBookInfo(String bId);
}