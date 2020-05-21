package pers.huidong.springbootstudy.controller;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.huidong.springbootstudy.bean.Person;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/16 9:49
 * @description:
 */

@Controller
public class HelloController {

    //注意：在使用 @RequestMapping后，返回值通常解析为跳转路径，但是加上 @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中。
    //classpath:/templates/success.html
    @RequestMapping("success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("huidong1","huidong2","huidong3"));
        return "success";
    }
}
