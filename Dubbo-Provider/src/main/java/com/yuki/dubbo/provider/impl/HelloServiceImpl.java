package com.yuki.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuki.dubbo.provider.HelloService;

/**
 * @Author：yuki
 * @Description:
 * @Date: Created in 16:37 2020/5/29
 * @Modified By:
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
