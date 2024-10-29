package com.roczyno.fl_lab2_springproject1;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
