package pers.huidong.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/22 14:48
 * @description:
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        session.setAttribute("loginUser",username);
        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            return "redirect:/main.html";

        } else {
            map.put("msg", "用户名或密码错误！");
            return "login";
        }
    }
}
