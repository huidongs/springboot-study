package pers.huidong.springbootstudy.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/25 17:03
 * @description:
 */
public class MyErrorAttributes extends DefaultErrorAttributes {

    public Map<String,Object> getErrorAttributes(RequestAttributes requestAttributes,boolean includeStackTrace){
        Map<String,Object> map = super.getErrorAttributes((WebRequest) requestAttributes,includeStackTrace);
        map.put("company","huidongaaa");
        return map;
    }
}
