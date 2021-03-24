package com.example.demo.auction.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AuctionDto implements Serializable {

    private long auctionNo;
    private Date regDate;
    private String bidPrice;
    private String currentPrice;
    private String bid;
    private List<User> userList;
    private User user;
    private Item item;
    private Chat chat;
}
