package com.shunfeng.demo.service;


import org.springframework.stereotype.Service;

@Service
public class ServerImpl implements ServerInterface {
    public void testRMI() {
        System.out.println("welcome use RMI!");
    }
}
