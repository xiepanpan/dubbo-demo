package com.xiepanpan.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: xiepanpan
 * @Date: 2020/7/11
 * @Description:  通过spring加载配置文件 发布服务
 */
public class Bootstrap {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("dubbo-server.xml");
        classPathXmlApplicationContext.start();

        System.in.read();
    }
}
