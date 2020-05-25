package pers.huidong.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.huidong.springbootstudy.exception.UserNotExistException;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/25 15:38
 * @description:
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user")String user){
        if (user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }
}
