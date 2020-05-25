package pers.huidong.springbootstudy.exception;

/**
 * @program: springboot-study
 * @auther: HuiDong
 * @date: 2020/5/25 15:42
 * @description:
 */
public class UserNotExistException  extends RuntimeException{

    public UserNotExistException(){
        super("用户不存在");
    }
}
