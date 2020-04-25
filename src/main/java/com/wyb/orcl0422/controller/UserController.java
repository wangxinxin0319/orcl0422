package com.wyb.orcl0422.controller;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import com.wyb.orcl0422.pojo.TUser;
import com.wyb.orcl0422.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22   13:35
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/toregister")
    public String toRegister(){
        return "register";
    }
    /**
     * 注册功能
     * @return
     */
    @RequestMapping("/registerToUser")
    public String registerToUser(TUser tUser){
        System.out.println(tUser.getName());
        if(null!=tUser){
            tUser.setId(RandomUtil.randomUUID().replace("-","")); //设置主键的id
            tUser.setCreateTime(new Date()); //设置添加的时间
            String md5Password = SecureUtil.md5(tUser.getPassword());//密码md5 加密
            tUser.setPassword(md5Password);
        }
        //没有效验手机号是否存在
        int flag = userService.registerToUser(tUser); //一般数据库的操作，如果成功，返回的状态就是大于0状态
        return flag>0?"login":"register"; //三目判断
    }

    /**
     * 手机号唯一
     * @param phone
     * @return
     */
    @RequestMapping("/checkPhone")
    @ResponseBody
    public String checkPhone(String phone){
        TUser tUser=userService.checkPhone(phone);
        if (tUser!=null) {
            return "no";//便是手机号已经注册
        }else{
            return "ok";//表示手机号未注册
        }

    }

    /**
     * 登录
     * @param name
     * @param password
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String checkUserNameAndPassword(String name, String  password, Model model, HttpServletRequest request){
        if(!StringUtils.isEmpty(name) && !StringUtils.isEmpty(password)){
            TUser user =  userService.checkUserNameAndPassword(name,password);
            if (null==user){ //用户名或者密码错误
                model.addAttribute("msg","用户名或者密码错误");
                return "login";
            }else{
                //放入session
                request.getSession().setAttribute("user",user);
                //返回到列表页面
                return "redirect:/book/queryBookList" ;
            }
        }else{
            model.addAttribute("msg","用户名密码不能为空");
            //如果用户名或者密码为空，则返回到登录页面
            return "login";
        }
    }
    @RequestMapping("/distory")
    public String distory(HttpSession session){
        session.removeAttribute("user");
        return "login";
    }


}
