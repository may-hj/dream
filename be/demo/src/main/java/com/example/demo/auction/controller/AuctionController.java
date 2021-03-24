package com.example.demo.auction.controller;

import com.example.demo.auction.service.AuctionService;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AuctionController {
    private final AuctionService service;
}
