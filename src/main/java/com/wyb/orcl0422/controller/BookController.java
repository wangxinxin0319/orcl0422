package com.wyb.orcl0422.controller;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.extra.servlet.multipart.UploadFile;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyb.orcl0422.pojo.Awesome;
import com.wyb.orcl0422.pojo.Book;
import com.wyb.orcl0422.pojo.Borrow;
import com.wyb.orcl0422.pojo.TUser;
import com.wyb.orcl0422.service.AwesomeService;
import com.wyb.orcl0422.service.BookService;
import com.wyb.orcl0422.service.BorrowService;
import com.wyb.orcl0422.utils.uploadUtils;
import com.wyb.orcl0422.vo.DianjiVo;
import com.wyb.orcl0422.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import sun.net.www.protocol.http.HttpURLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22   17:34
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BorrowService borrowService;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    AwesomeService awesomeService;

    @RequestMapping("/queryBookList")
    public String queryBookList(Model model, @RequestParam(defaultValue = "1") int currentPage,
                                @DateTimeFormat(pattern = "yyyy-MM-dd") Date time1,
                                @DateTimeFormat(pattern = "yyyy-MM-dd") Date time2,
                                String bName) {
        Map<Object, Object> map = new HashMap<>();
        map.put("bName", bName);
        map.put(time1, time1);
        map.put(time2, time2);
        PageHelper.startPage(currentPage, 2);
        List<Vo> books = bookService.queryBookList(map);
        PageInfo<Vo> page = new PageInfo<>(books);
        model.addAttribute("list", books);
        model.addAttribute("page", page);
        return "list";
    }

    @RequestMapping("/BorrowOrReturn")
    public String queryBookList(int borrowFlag, String bId, HttpSession session) {
        bookService.lendOrBorrow(borrowFlag, bId, session);
        return "redirect:/book/queryBookList";
    }

    @RequestMapping("/toadd")
    public String toAdd( Model model) {
        return "save";
    }

    /*磁盘上的路径*/
    @Value("${file.upload.path}")
    private String filePath;

    /**
     * 添加书籍 or 修改
     *
     * @param book
     * @param session
     * @param file
     * @return
     */
    @RequestMapping("/save")
    public String saveOrUpdate(Book book, HttpSession session, @RequestParam("file") MultipartFile file) {
        if (file.getSize() > 0) { //对图片 进行上传并且赋值
            String picUrl = uploadUtils.uploadUtils(file, filePath);
            book.setPicUrl(picUrl);
        }
        bookService.save(book, session);
        return "redirect:/book/queryBookList";
    }

    /**
     * 点赞功能
     *
     * @return
     */
    @RequestMapping("/updown")
    @ResponseBody
    public String updown(String id, HttpServletRequest request) {
        TUser user = (TUser) request.getSession().getAttribute("user");
        //判断当前用户是否点赞过,redis缓存里是否有
        Boolean aBoolean = redisTemplate.hasKey(user.getId() + "updown_" + id);
        if (!aBoolean) {//若没有添加
            //查询表中相同bid 点赞数，基础上+1
            awesomeService.insert(id);
            redisTemplate.opsForValue().increment(user.getId() + "updown_" + id, 1); //完成点赞的功能
            return "yes";
        } else {
            return "no";// 不能点赞
        }
    }

    /**
     * 跳转到书籍详情页面，同时点击量新增1
     * @param bId
     * @param model
     * @return
     */
    @RequestMapping("/xq")
    public String toQueryBookInfo(String bId,Model model){
        model.addAttribute("bId",bId) ;
        //统计点击量
        redisTemplate.opsForValue().increment(bId,1); //完成点击量的加1
        return "xq";
    }
    @RequestMapping("/queryBookInfo")
    @ResponseBody
    public DianjiVo QueryBookInfo(String bId, Model model){
        return  bookService.list(bId);
    }

}







