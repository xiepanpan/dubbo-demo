package com.xiepanpan.dubbo;

/**
 * @author: xiepanpan
 * @Date: 2020/7/10
 * @Description:
 */
public class XpHelloImpl implements IXpHello {
    public String sayHello(String msg) {
        return "Hello:" +msg;
    }
}
