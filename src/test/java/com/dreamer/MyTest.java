package com.dreamer;

import com.alibaba.fastjson.JSON;
import com.dreamer.entity.UserInfo;
import com.dreamer.service.UserInfoService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xfgeng on 2018/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class MyTest {
    private static Logger logger = Logger.getLogger(MyTest.class);

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void test() {
        UserInfo userInfo = userInfoService.selectByPrimaryKey(1);
        System.out.println(JSON.toJSONString(userInfo));
        logger.info(JSON.toJSONString(userInfo));
    }

}
