package com.yuki.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yuki.dubbo.provider.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：yuki
 * @Description:
 * @Date: Created in 17:12 2020/5/29
 * @Modified By:
 */
@RestController
public class Consumer {
    @Reference
    HelloService helloService;
    @RequestMapping("/test")
    public String test(){
        return helloService.sayHello("yuki");
    }

}
