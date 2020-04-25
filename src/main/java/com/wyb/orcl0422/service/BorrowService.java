package com.wyb.orcl0422.service;

import com.wyb.orcl0422.dao.BorrowMapper;
import com.wyb.orcl0422.pojo.Borrow;
import com.wyb.orcl0422.vo.BorrowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22   19:45
 */
@Service
public class BorrowService {
    @Autowired
    BorrowMapper borrowMapper;

    public void insert(Borrow borrow) {
        borrowMapper.insert(borrow);
    }

    public List<BorrowVo> list(String bId) {
        return borrowMapper.list(bId);
    }
}
