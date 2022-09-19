package com.springframework.service.impl;

import com.springframework.service.BoyFriendService;


public class BoyFriendServiceImpl implements BoyFriendService {

    @Override
    public int smoke(String cat) {
        System.out.println("boy friend smoke " + cat);
        return 2;
    }

}
