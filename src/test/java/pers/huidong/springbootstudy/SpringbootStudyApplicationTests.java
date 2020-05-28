package pers.huidong.springbootstudy;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.huidong.springbootstudy.bean.Person;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootStudyApplicationTests {

    @Autowired
    Person person;
    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException{
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    void contextLoadsTest() {
        System.out.println(person);
    }

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void logger() {
        //日志的级别：由低到高
        //trace<debug<info<warn<error
        //可以调整输出的日志级别，日志就只会在这个级别以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //springboot默认是info级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");

    }

}
