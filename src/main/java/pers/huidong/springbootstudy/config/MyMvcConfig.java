package pers.huidong.springbootstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.util.StringUtils;
import pers.huidong.springbootstudy.component.LoginInterceptor;
import pers.huidong.springbootstudy.component.MyLocateResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/20 14:33
 * @description:
 */
//@EnableWebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/huidong").setViewName("success");
//    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginInterceptor())
                        .addPathPatterns("/**")
                        .excludePathPatterns("/login.html","/","/user/login");
            }
        };
        return webMvcConfigurer;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocateResolver();
    }
//   //这里是将MyLocateResolver写在这里
//        @Bean
//    public LocaleResolver localeResolver(){
//        return new LocaleResolver() {
//            @Override
//            public Locale resolveLocale(HttpServletRequest httpServletRequest) {
//                String l = httpServletRequest.getParameter("l");
//                Locale locale = Locale.getDefault();
//                if(!StringUtils.isEmpty(l)){
//                    String[] split = l.split("_");
//                    locale = new Locale(split[0],split[1]);
//                }
//                return locale;
//            }
//
//            @Override
//            public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
//
//            }
//        };
//    }
}
