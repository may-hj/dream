package com.example.demo.sns.domain;

import org.springframework.stereotype.Component;

import javassist.SerialVersionUID;

@Component
public class SNSDto {
    private static final long SerialVersionUID = 1L;
    private String username;
    private String board_content;
    private String regdate;
    private String hit; //조회수
    
}
