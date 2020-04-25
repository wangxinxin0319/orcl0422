package com.wyb.orcl0422.configer;

import com.wyb.orcl0422.pojo.TUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22  14:57
 */
public class UserInter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        TUser user = (TUser) request.getSession().getAttribute("user");
        if (user!=null) {
            return true;
        }
        request.getSession().setAttribute("msg","请先登录！");
        response.sendRedirect("/user/tologin");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
