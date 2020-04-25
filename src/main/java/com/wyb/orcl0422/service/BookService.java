package com.wyb.orcl0422.service;

import cn.hutool.core.util.RandomUtil;
import com.wyb.orcl0422.dao.BookMapper;
import com.wyb.orcl0422.dao.BorrowMapper;
import com.wyb.orcl0422.dao.DianjiMapper;
import com.wyb.orcl0422.pojo.*;
import com.wyb.orcl0422.vo.DianjiVo;
import com.wyb.orcl0422.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22   17:37
 */
@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BorrowMapper borrowMapper;
    @Autowired
    DianjiMapper dianjiMapper;
    public List<Vo> queryBookList(Map<Object, Object> map) {

        return bookMapper.selectAll(map);
    }


    public void lendOrBorrow(int borrowFlag, String bId, HttpSession session) {
        BookExample bookExample = new BookExample();
        bookExample.createCriteria().andBIdEqualTo(bId);
        Book book=bookMapper.selectByExample(bookExample).get(0);
        //根据状态判断借出情况
        if (borrowFlag==0) {//表明在库里，要借出
            //查询bid 对象
            book.setCount(book.getCount()+1);
            book.setBorrowFlag(1);
            //根据id修改，同时添加borrow数据
            bookMapper.updateBybId(book);
            //添加数据
            Borrow borrow = new Borrow();
            borrow.setBorrowId(RandomUtil.randomUUID().replace("-",""));
            borrow.setbId(bId);
            borrow.setBorrowTime(new Date());
            TUser user = (TUser) session.getAttribute("user");
            borrow.setUserId(user.getId());
            borrowMapper.insert(borrow);
        }else{//归还
            //查询bid 对象
            book.setBorrowFlag(0);
            //根据id修改，同时添加borrow数据
            bookMapper.updateBybId(book);
        }
    }

    /**
     * 根据id查找
     * @param bId
     * @return
     */
    public Book selectById(String bId) {
        return bookMapper.selectById(bId);
    }


    public void save(Book book, HttpSession session) {
            //添加
            book.setbId(RandomUtil.randomUUID().replace("-",""));
            book.setCount(0);
            book.setBorrowFlag(0);
            bookMapper.insert(book);
            //2.添加borrow表
            Borrow borrow = new Borrow();
            borrow.setBorrowId(RandomUtil.randomUUID().replace("-",""));
            borrow.setbId(book.getbId());
            TUser user = (TUser) session.getAttribute("user");
            borrow.setUserId(user.getId());
            borrow.setBorrowTime(new Date());
            borrowMapper.insert(borrow);
            //3.添加点击量表
            Dianji dianji = new Dianji();
            dianji.setbId(book.getbId());
            dianji.setTraffic(0);
            dianjiMapper.insert(dianji);

    }

    public DianjiVo list(String bId) {
        return (DianjiVo) bookMapper.selectBookInfo(bId);
    }
}
