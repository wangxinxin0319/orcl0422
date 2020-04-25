package com.wyb.orcl0422.configer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;

/**
 * @Title
 * @Description
 * @Autoor wangxinxin
 * @time 2020/4/22   15:00
 */
@Configuration
public class UserWebMvc implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        ArrayList<String> list = new ArrayList<>();
        list.add("/user/tologin");
        list.add("/user/login");
        list.add("/user/register");
        list.add("/user/toregister");
        list.add("/user/registerToUser");
        list.add("/user/checkPhone");
        list.add("/css/**");
        list.add("/bootstrap-3.3.7/**");
        list.add("/js/**");
        list.add("/My97DatePicker/**");
        list.add("/img/**");
        list.add("/kindeditor-4.1.11-zh-CN/**");
        registry.addInterceptor(new UserInter()).addPathPatterns("/**").excludePathPatterns(list);


    }
    /*磁盘上的路径*/
    @Value("${file.upload.path}")
    private String filePath ;
    /*相对路径*/
    @Value("${file.upload.relative}")
    private String relativePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(relativePath).addResourceLocations("file:/"+filePath);
    }
}
