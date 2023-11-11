package com.example.demo;


import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessageService{
    public void sendMsg(String message) {
        System.out.println(message);
    }

}
