package com.mobtag.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adronilson Junge
 */
@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping
    public String hello(){
        return "Hello Bookstore manager";
    }
}
