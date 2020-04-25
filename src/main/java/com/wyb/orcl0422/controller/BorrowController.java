package com.wyb.orcl0422.controller;

import com.wyb.orcl0422.service.BorrowService;
import com.wyb.orcl0422.vo.BorrowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/24   19:45
 */
@Controller
@RequestMapping("/borrow")
public class BorrowController {
    @Autowired
    BorrowService borrowService;
    @RequestMapping("/borrowList")
    @ResponseBody
    public List<BorrowVo> List(String bId){
       return borrowService.list(bId);
    }
}
