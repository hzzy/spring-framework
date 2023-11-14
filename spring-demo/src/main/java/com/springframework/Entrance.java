package com.springframework;

import com.springframework.service.BoyFriendService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Entrance {
    public static void main(String[] args) {

        System.out.println("hello world");

        String url = "//Users/zy/gitcode/local/spring-framework/spring-demo/src/main/resources/spring/spring-config.xml";
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext(url);
        applicationContext.start();
        BoyFriendService boyFriendService = applicationContext.getBean(BoyFriendService.class);
        boyFriendService.smoke("zhong hua");
    }
}
