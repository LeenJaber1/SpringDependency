package com.example.demo;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService {
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
