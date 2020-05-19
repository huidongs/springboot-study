package pers.huidong.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/16 9:49
 * @description:
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/out")
    public String test(){
        return "Hello SpringBoot";
    }

    @RequestMapping("success")
    String success(){
        //classpath:/templates/success.html
        return "success";
    }
}
