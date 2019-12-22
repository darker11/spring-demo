package com.hello;

import org.springframework.stereotype.Component;

/**
 * @author yue.lou
 * @since 2019/12/22
 */

@Component
public class HelloImpl implements  Hello {

    @Override
    public void sayHello(String name) {
        System.out.printf("hi %s, how are you !", name);
    }

    public void init() {
        System.out.println("初始化开始");
    }

    public void destroy() {
        System.out.println("清理各种资源");
    }
}
