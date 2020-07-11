package com.xiepanpan.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xiepanpan
 * @Date: 2020/7/11
 * @Description:  客户端启动类
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("dubbo-client.xml");
        IXpHello xpHelloService = (IXpHello) classPathXmlApplicationContext.getBean("xpHelloService");

        System.out.println(xpHelloService.sayHello("zhoujielun"));

    }

}
