package com.example.demo.auction.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="auctions")
public class Auction {

    @Id
    @GeneratedValue
    @Column(name="auction_no")
    private long auctionNo;

    @Column(name="reg_date")
    private Date regDate;
    
    @Column(name="bid_price")
    private String bidPrice;

    @Column(name="current_price")
    private String currentPrice;

    @Column(name="bid")
    private String bid;

    @Column(name="user_list")
    private List<User> userList;

    @Column(name="user")
    private User user;
    
    @Column(name="stock")
    private Item item;

    @Column(name="chat")
    private Chat chat;
}
